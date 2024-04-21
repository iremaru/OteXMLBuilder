package com.ote.rexeni.XMLBuilder;

import com.ote.models.enidoc.DocumentoFactory;
import com.ote.models.enidoc.TipoDocumento;
import com.ote.models.enidoc.enids.TipoFirmasElectronicas;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileWriter;

public class CSVwrapper {
    final String PATH = "src/main/resources/temp/";
    final String filename = "test";
    final String fileExtension = ".xml";

    public void generate(TipoFirmasElectronicas firmas, String sourceFile) {
        //Convierte el csv en binario

        //Asigna los valores al XML

        //Crea el xml
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TipoDocumento.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            DocumentoFactory documentoFactory = new DocumentoFactory();
            JAXBElement<TipoDocumento> documentENI = documentoFactory.createEnidoc(firmas, sourceFile);
            jaxbMarshaller.marshal(documentENI, new File(PATH + filename + fileExtension));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


        //Lo guarda en la carpeta de salida

    }
}
