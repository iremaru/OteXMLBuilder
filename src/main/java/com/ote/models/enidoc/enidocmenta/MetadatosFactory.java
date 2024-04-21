
package com.ote.models.enidoc.enidocmenta;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ote.models.enidoc.enidocmenta package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class MetadatosFactory {

    private final static QName _Metadatos_QNAME = new QName("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", "metadatos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ote.models.enidoc.enidocmenta
     * 
     */
    public MetadatosFactory() {
    }

    /**
     * Create an instance of {@link TipoMetadatos }
     * 
     */
    public TipoMetadatos createTipoMetadatos() {
        return new TipoMetadatos();
    }

    /**
     * Create an instance of {@link TipoEstadoElaboracion }
     * 
     */
    public TipoEstadoElaboracion createTipoEstadoElaboracion() {
        return new TipoEstadoElaboracion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoMetadatos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoMetadatos }{@code >}
     */
    @XmlElementDecl(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", name = "metadatos")
    public JAXBElement<TipoMetadatos> createMetadatosXML(TipoMetadatos value) {
        return new JAXBElement<TipoMetadatos>(_Metadatos_QNAME, TipoMetadatos.class, null, value);
    }

}
