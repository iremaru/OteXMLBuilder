package com.ote.models.enidoc;

import com.ote.models.enidoc.enidocmenta.*;
import com.ote.models.enidoc.enids.FirmaFactory;
import com.ote.models.enidoc.enids.Firmas;
import com.ote.models.enidoc.enids.TipoFirmasElectronicas;
import com.ote.models.enidoc.enifile.EniFileFactory;
import com.ote.models.enidoc.enifile.TipoContenido;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.GregorianCalendar;


@XmlRegistry
public class DocumentoFactory {
    final String DocumentIDEspecifico = "IDEspecifico";
    private final static QName _Documento_QNAME = new QName("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e", "documento");

    Firmas createFirma(TipoFirmasElectronicas firmasElectronicas) {
        //TODO: Check its correct
        FirmaFactory factory = new FirmaFactory();
        Firmas firmaList = factory.createFirmas();
        firmaList.getFirma().add(firmasElectronicas);

        return firmaList;
    }

    JAXBElement<Firmas> createFirmaXML(TipoFirmasElectronicas firmasElectronicas) {
        //TODO: Check its correct
        FirmaFactory factory = new FirmaFactory();
        Firmas firmaList = factory.createFirmas();
        firmaList.getFirma().add(firmasElectronicas);

        return factory.createFirmasXML(firmaList);
    }

    TipoMetadatos createEnidocmeta() {
        MetadatosFactory factory = new MetadatosFactory();

        TipoMetadatos metadatos = factory.createTipoMetadatos();
        metadatos.setVersionNTI("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e");
        //TODO: Organo es un identificador normalizado extraído de Directorio Común de unidades orgánicas y oficinas
        metadatos.getOrgano().add("AYUNTAMIENTO DE SANTA LUCIA");

        try {
            GregorianCalendar date = new GregorianCalendar();
            XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
            metadatos.setFechaCaptura(xmlDate);
        } catch (javax.xml.datatype.DatatypeConfigurationException datatypeException) {
        }

        metadatos.setIdentificador(
                "ES_"
                        + metadatos.getOrgano()
                        + metadatos.getFechaCaptura()
                        + DocumentIDEspecifico);

        metadatos.setOrigenCiudadanoAdministracion(true);

        //TODO: Elaboración por defecto: Copia electrónica auténtica con cambio de formato
        TipoEstadoElaboracion estadoElaboracion = factory.createTipoEstadoElaboracion();
        estadoElaboracion.setValorEstadoElaboracion(EnumeracionEstadoElaboracion.EE_02);
        metadatos.setEstadoElaboracion(estadoElaboracion);


        metadatos.setTipoDocumental(TipoDocumental.TD_06);

        return metadatos;
    }

    JAXBElement<TipoMetadatos> createEnidocmetaXML() {
        MetadatosFactory factory = new MetadatosFactory();

        TipoMetadatos metadatos = factory.createTipoMetadatos();
        metadatos.setVersionNTI("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e");
        //TODO: Organo es un identificador normalizado extraído de Directorio Común de unidades orgánicas y oficinas
        metadatos.getOrgano().add("AYUNTAMIENTO DE SANTA LUCIA");

        try {
            GregorianCalendar date = new GregorianCalendar();
            XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
            metadatos.setFechaCaptura(xmlDate);
        } catch (javax.xml.datatype.DatatypeConfigurationException datatypeException) {
        }

        metadatos.setIdentificador(
                "ES_"
                        + metadatos.getOrgano()
                        + metadatos.getFechaCaptura()
                        + DocumentIDEspecifico);

        metadatos.setOrigenCiudadanoAdministracion(true);

        //TODO: Elaboración por defecto: Copia electrónica auténtica con cambio de formato
        TipoEstadoElaboracion estadoElaboracion = factory.createTipoEstadoElaboracion();
        estadoElaboracion.setValorEstadoElaboracion(EnumeracionEstadoElaboracion.EE_02);
        metadatos.setEstadoElaboracion(estadoElaboracion);


        metadatos.setTipoDocumental(TipoDocumental.TD_06);

        return factory.createMetadatosXML(metadatos);
    }

    TipoContenido createEnifile(String CSVpath) {
        EniFileFactory factory = new EniFileFactory();
        TipoContenido contenido = factory.createTipoContenido();
        try {
            contenido.setValorBinario(transformCSVtoBytes(CSVpath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contenido;
    }

    JAXBElement<TipoContenido> createEnifileXML(String CSVpath) {
        EniFileFactory factory = new EniFileFactory();
        TipoContenido contenido = factory.createTipoContenido();
        try {
            contenido.setValorBinario(transformCSVtoBytes(CSVpath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return factory.createContenidoXML(contenido);
    }


    TipoDocumento createEniDoc(TipoFirmasElectronicas firmas, String CSVpath)
    {
        TipoDocumento doc = new TipoDocumento();
        doc.setFirmas(createFirma(firmas));
        doc.setMetadatos(createEnidocmeta());
        doc.setContenido(createEnifile(CSVpath));
        return doc;
    }

    @XmlElementDecl(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e", name = "documento")
    public JAXBElement<TipoDocumento> createEnidoc(TipoFirmasElectronicas firmas, String CSVpath) {

        TipoDocumento doc = createEniDoc(firmas, CSVpath);

        return new JAXBElement<TipoDocumento>(_Documento_QNAME, TipoDocumento.class, null, doc);
    }

    byte[] transformCSVtoBytes(String CSVpath) throws IOException {

        Path csvFile = Paths.get(CSVpath);
        return Files.readAllBytes(csvFile);
    }
}


