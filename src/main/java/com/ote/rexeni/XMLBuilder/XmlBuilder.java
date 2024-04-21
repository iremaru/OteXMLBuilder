//package com.ote.rexeni.XMLBuilder;
//
////import com.ote.models.documentoEni.TipoContenido;
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import jakarta.xml.bind.Marshaller;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Iterator;
//
//public class XmlBuilder {
//  final String FIRST_COLUMN_NAME = "Fecha";
//  final int MAX_COLUMNS_WITH_DATA = 13;
//  final String PATH = "src/main/resources/temp/";
//  final String filename = "test";
//  final String fileExtension = ".xml";
//  //final ObjectFactory objectFactory = new ObjectFactory();
//
//  public void generate(File sourceFiles) {
//    try {
//      Workbook workbook = new XSSFWorkbook(sourceFiles);
//      //TipoContenido invoices = objectFactory.createTipoContenido();
//
//      //processWorkbook(workbook, invoices);
//      //transformToXML(invoices);
//
//    } /*catch (JAXBException e) {
//      XMLBuilderHandleExceptions.handleException(e);
//    }
//      */ catch (InvalidFormatException e) {
//      //TODO: Handle exception
//      System.out.println("--------------------------------------");
//      System.out.println("---------- INVALID FORMAT EXCEPTION");
//      e.printStackTrace();
//      System.out.println("--------------------------------------");
//    } catch (IOException e) {
//      System.out.println("--------------------------------------");
//      System.out.println("---------- IO EXCEPTION");
//      e.printStackTrace();
//      System.out.println("--------------------------------------");
//    }
//  }
//
//  void processWorkbook(Workbook workbook, TipoContenido invoice) {
//    System.out.println("-----------------------------");
//    System.out.println("--- INICIANDO");
//    System.out.println("-----------------------------");
//    Sheet sheet = workbook.getSheetAt(0);
//    Iterator<Row> iterator = sheet.rowIterator();
//
//    boolean headerHasPassed = false;
//    boolean isInvoiceSection = false;
//    //boolean invoiceSectionHasPassed = false; //Invoice section has no started, so 'has passed';
//    int firstInvoices = 0, secondInvoices = 0, totalEntries = 0;
//
//    while (iterator.hasNext()) {
//
//      //Enter the row
//      Row row = iterator.next();
//      Cell firstColumn = row.getCell(0);
//      Cell thirdColumn = row.getCell(2);
//
//      //invoiceSectionHasPassed = headerHasPassed && !isInvoiceSection;
//      isInvoiceSection = headerHasPassed;
//      headerHasPassed = headerHasPassed || checkIsHeaderRow(row);
//
//      System.out.println("---------------------LINEA: " + row.getRowNum());
//
//      if(firstColumn != null && isInvoiceSection && firstColumn.getCellType() == CellType.STRING){
//        totalEntries++;
//        String firstColumnText = firstColumn.getStringCellValue();
//        if (checkWhetherColumnIsADate(firstColumn)) {
//          firstInvoices++;
//          processFirstEntrieInvoice(row, invoice);
//          System.out.println("--- FACTURAS: " + firstColumnText);
//
//        } else {
//          secondInvoices++;
//          proccesSecondLineInvoice(row);
//        }
//      }
//      else if (firstColumn == null && thirdColumn != null && thirdColumn.getCellType() == CellType.NUMERIC) {
//        totalEntries++;
//        proccesSecondLineInvoice(row);
//        System.out.println("--- SEGUNDA LÍNEA DE FACTURA || Tipo: " + thirdColumn.getCellType());
//        secondInvoices++;
//
//      }
//    }
//    System.out.println(">ENTRADAS TOTALES:             " + totalEntries);
//    System.out.println(">FACTURAS TOTALES:             " + firstInvoices);
//    System.out.println(">FACTURAS CON SEGUNDAS LÍNEAS: " + secondInvoices);
//
//
//        /*for (Row row : sheet) {
//            if(row.getRowNum() == 0) continue;
//
//            Cell cellName = row.getCell(0);
//
//            Cell cellImporte = row.getCell(1);
//
//            FacturaType facturaType = objectFactory.createFacturaType();
//            facturaType.setNombre(cellName.getStringCellValue());
//            facturaType.setImporte( (int)cellImporte.getNumericCellValue() );
//
//            invoice.getFactura().add(facturaType);
//        }*/
//  }
//
//  void transformToXML(TipoContenido invoices) throws JAXBException {
//
//    JAXBContext context = JAXBContext.newInstance(TipoContenido.class);
//    Marshaller marshaller = context.createMarshaller();
//    //JAXBElement<TipoContenido> jaxbElement = objectFactory.createContenido(invoices);
//
//    //marshaller.marshal(jaxbElement, new File(PATH + filename + fileExtension));
//  }
//
//  void processFirstEntrieInvoice(Row row, TipoContenido invoice) {
//
//    Cell cellDate = row.getCell(0);
//    Cell cellID = row.getCell(1);
//    Cell cellOperationID = row.getCell(2);
//    Cell cellSocialTheme = row.getCell(3);
//    Cell cellNIF = row.getCell(5);
//    Cell cellDescription = row.getCell(6);
//    Cell cellBaseImponible = row.getCell(7);
//    Cell cellTipo = row.getCell(8);
//    Cell cellIVA = row.getCell(9);
//    Cell cellBasExenta = row.getCell(10);
//    Cell cellTotal = row.getCell(12);
//
//    //JAXBElement<TipoContenido> contentType = objectFactory.createContenido(invoice);
//
//    //contentType.setNombre(cellName.getStringCellValue());
//    //contentType.setImporte( (int)cellImporte.getNumericCellValue() );
//
//    //invoice.getFactura().add(facturaType);
//  }
//
//  void proccesSecondLineInvoice(Row row) {
//
//  }
//
//  boolean checkIsHeaderRow(Row row) {
//    Cell firstColumn = row.getCell(0);
//    if (firstColumn == null) return false;
//
//    String firstColumnValue = firstColumn.getStringCellValue();
//    System.out.println("COLUMN: " + firstColumnValue);
//    return firstColumnValue.equalsIgnoreCase(FIRST_COLUMN_NAME);
//  }
//
//  /**
//   * Check if the invoice section is over for a given sheet.
//   * //TODO: Hay que revisar esto. Hay muchas líneas en blanco en medio de las facturas. Por lo que este método daría un falso positivo rápidamente.
//   *
//   * @param row the row to be checked
//   * @return true if the invoice section is over, false otherwise
//   */
//  boolean checkInvoiceSectionIsOver(Row row) {
//    //Column 0 is the date, but if we are using this method, it means that
//    //there is no data in column 0, and we will check if there are data in the other columns.
//    int firstColumnToCheck = 2;
//    for (int column = firstColumnToCheck; column < MAX_COLUMNS_WITH_DATA; column++) {
//      Cell cell = row.getCell(column);
//      boolean isNullCell = cell == null;
//      boolean isBlankCell = !isNullCell && cell.getCellType() == CellType.BLANK;
//
//
//      System.out.println("---- La celda " + column + " es nula?" + isNullCell);
//      System.out.println("---- La celda " + column + " esta en blanco?: " + isBlankCell);
//      System.out.println("----- ¿Cerramos la sección?: " + !(!isNullCell && !isBlankCell));
//
//      if (!isNullCell && !isBlankCell) return false;
//    }
//    return true;
//  }
//
//  /**
//   * Check if the row is an invoice section.
//   * Must be used after checkIsHeaderRow.
//   *
//   * @param row the row to be checked
//   * @return true if the row is an invoice section, false otherwise
//   */
//  boolean checkWhetherItIsInvoiceSection(Row row, boolean headerHasPassed) {
//    return headerHasPassed && !checkInvoiceSectionIsOver(row);
//  }
//
//  /**
//   * A function to check whether the column is a date.
//   *
//   * @param firstColumn the cell in the first column
//   * @return true if the first column is a date, false otherwise
//   */
//  boolean checkWhetherColumnIsADate(Cell firstColumn) {
//    String text = firstColumn.getStringCellValue();
//    return !text.isBlank() && text.contains("/");
//  }
//
//}
