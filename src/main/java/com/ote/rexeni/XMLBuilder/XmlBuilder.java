package com.ote.rexeni.XMLBuilder;

import com.ote.models.InvoiceGroupType;
import com.ote.models.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class XmlBuilder {
  final String FIRST_COLUMN_NAME = "Fecha";
  final int MAX_COLUMNS_WITH_DATA = 13;
  final String PATH = "src/main/resources/temp/";
  final String filename = "test";
  final String fileExtension = ".xml";
  final ObjectFactory objectFactory = new ObjectFactory();

  public void generate(File sourceFiles) {
    try {
      Workbook workbook = new XSSFWorkbook(sourceFiles);
      InvoiceGroupType invoices = objectFactory.createFacturasType();

      processWorkbook(workbook, invoices);
      transformToXML(invoices);

    } catch (JAXBException e) {
      XMLBuilderHandleExceptions.handleException(e);
    } catch (InvalidFormatException e) {
      //TODO: Handle exception
      System.out.println("--------------------------------------");
      System.out.println("---------- INVALID FORMAT EXCEPTION");
      e.printStackTrace();
      System.out.println("--------------------------------------");
    } catch (IOException e) {
      System.out.println("--------------------------------------");
      System.out.println("---------- IO EXCEPTION");
      e.printStackTrace();
      System.out.println("--------------------------------------");
    }
  }

  void processWorkbook(Workbook workbook, InvoiceGroupType invoice) {
    Sheet sheet = workbook.getSheetAt(0);
    Iterator<Row> iterator = sheet.rowIterator();

    boolean headerHasPassed = false;
    boolean isInvoiceSection = false;
    boolean invoiceSectionHasPassed = false; //Invoice section has no started, so 'has passed';
    int firstInvoices = 0, secondInvoices = 0, totalEntries = 0;

    while (iterator.hasNext()) {

      //Enter the row
      Row row = iterator.next();
      Cell firstColumn = row.getCell(0);
      if (
          firstColumn != null
              && !invoiceSectionHasPassed //Whether we are in the section, or never have we checked if we have entered the section
              && (headerHasPassed || (headerHasPassed = checkIsHeaderRow(row))) //It has already passed the header, or we are in the header
              && (isInvoiceSection || (isInvoiceSection = !checkIsHeaderRow(row))) //And we are in the section, or we have passed the header (in which case we are in the section)
              && (!(invoiceSectionHasPassed = !checkWhetherItIsInvoiceSection(row))) //And we haven't left the invoices section.

      ) {
        String firstColumnText = firstColumn.getStringCellValue();

        //New invoices set the invoice date in the first column,
        //otherwise it is the second line of the previous invoice
        boolean isNewInvoice = checkWhetherColumnIsADate(firstColumn);

        totalEntries++;
        if (isNewInvoice) {
          firstInvoices++;
          System.out.println("--- FACTURAS: " + firstColumnText);

        } else {
          secondInvoices++;
        }
      }


    }
    System.out.println(">ENTRADAS TOTALES:             " + totalEntries);
    System.out.println(">FACTURAS TOTALES:             " + firstInvoices);
    System.out.println(">FACTURAS CON SEGUNDAS LÍNEAS: " + secondInvoices);


        /*for (Row row : sheet) {
            if(row.getRowNum() == 0) continue;

            Cell cellName = row.getCell(0);

            Cell cellImporte = row.getCell(1);

            FacturaType facturaType = objectFactory.createFacturaType();
            facturaType.setNombre(cellName.getStringCellValue());
            facturaType.setImporte( (int)cellImporte.getNumericCellValue() );

            invoice.getFactura().add(facturaType);
        }*/
  }

  void transformToXML(InvoiceGroupType invoices) throws JAXBException {

    JAXBContext context = JAXBContext.newInstance(InvoiceGroupType.class);
    Marshaller marshaller = context.createMarshaller();
    JAXBElement<InvoiceGroupType> jaxbElement = objectFactory.createFacturas(invoices);

    marshaller.marshal(jaxbElement, new File(PATH + filename + fileExtension));
  }

  boolean checkIsHeaderRow(Row row) {
    String firstColumnValue = row.getCell(0).getStringCellValue();
    System.out.println("COLUMN: " + firstColumnValue);
    return firstColumnValue.equalsIgnoreCase(FIRST_COLUMN_NAME);
  }

  /**
   * Check if the invoice section is over for a given sheet.
   *
   * @param row the row to be checked
   * @return true if the invoice section is over, false otherwise
   */
  boolean checkInvoiceSectionIsOver(Row row) {
    //Column 0 is the date, but if we are using this method, it means that
    //there is no data in column 0, and we will check if there are data in the other columns.
    int firstColumnToCheck = 1;
    for (int column = firstColumnToCheck; column < MAX_COLUMNS_WITH_DATA; column++) {
      if (row.getCell(column) == null && row.getCell(column).getStringCellValue().isBlank())
        return true;
    }
    return false;
  }

  /**
   * Check if the row is an invoice section.
   * Must be used after checkIsHeaderRow.
   *
   * @param row the row to be checked
   * @return true if the row is an invoice section, false otherwise
   */
  boolean checkWhetherItIsInvoiceSection(Row row) {
    return !checkIsHeaderRow(row) && !checkInvoiceSectionIsOver(row);
  }

  /**
   * A function to check whether the column is a date.
   *
   * @param firstColumn the cell in the first column
   * @return true if the first column is a date, false otherwise
   */
  boolean checkWhetherColumnIsADate(Cell firstColumn) {
    String text = firstColumn.getStringCellValue();
    //!firstColumnText.isBlank();
        //firstColumn.getCellType() == CellType.NUMERIC && firstColumn.getDateCellValue() != null;
    return !text.isBlank() && text.contains("/");
  }

}
