package com.ote.rexeni.XMLBuilder;

import com.ote.models.FacturaType;
import com.ote.models.FacturasType;
import com.ote.models.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class XmlBuilder {
    final String PATH = "src/main/resources/temp/";
    final String filename = "test";
    final String fileExtension = ".xml";
    final ObjectFactory objectFactory = new ObjectFactory();

    public void generate(File sourceFiles) {
        try {
            Workbook workbook = new XSSFWorkbook(sourceFiles);
            FacturasType facturas = objectFactory.createFacturasType();

            processWorkbook(workbook, facturas);
            transformToXML(facturas);

        } catch (JAXBException e) {
            XMLBuilderHandleExceptions.handleException(e);
        } catch ( InvalidFormatException e) {
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


    void processWorkbook(Workbook workbook, FacturasType facturas) {
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            if(row.getRowNum() == 0) continue;

            Cell cellName = row.getCell(0);
            Cell cellImporte = row.getCell(1);

            FacturaType facturaType = objectFactory.createFacturaType();
            facturaType.setNombre(cellName.getStringCellValue());
            facturaType.setImporte( (int)cellImporte.getNumericCellValue() );

            facturas.getFactura().add(facturaType);
        }
    }

    void transformToXML(FacturasType facturas) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(FacturasType.class);
        Marshaller marshaller = context.createMarshaller();
        JAXBElement<FacturasType> jaxbElement = objectFactory.createFacturas(facturas);

        marshaller.marshal(jaxbElement, new File(PATH + filename + fileExtension));
    }

}
