
package com.ote.models.enidoc.enifile;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ote.models.enidoc.enifile package. 
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
public class EniFileFactory {

    private final static QName _Contenido_QNAME = new QName("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido", "contenido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ote.models.enidoc.enifile
     * 
     */
    public EniFileFactory() {
    }

    /**
     * Create an instance of {@link TipoContenido }
     * 
     */
    public TipoContenido createTipoContenido() {
        return new TipoContenido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoContenido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoContenido }{@code >}
     */
    @XmlElementDecl(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido", name = "contenido")
    public JAXBElement<TipoContenido> createContenidoXML(TipoContenido value) {
        return new JAXBElement<TipoContenido>(_Contenido_QNAME, TipoContenido.class, null, value);
    }

}
