package com.ote.rexeni.XMLBuilder;

import com.ote.rexeni.XMLData.XmlData;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class XmlBuilder {
    String filename = "test";
    String fileExtension = "xml";
    public void generate() {
        try {
            JAXBContext context = JAXBContext.newInstance(XmlData.class);
            XmlData data = new XmlData();

            // Todo: Config data

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(data, new File("out/docs/" + filename + fileExtension));

            // Todo: Only for test pourposes. Delete.
            System.out.println("Archivo XML generado con éxito.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
