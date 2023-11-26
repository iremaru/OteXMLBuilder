
package com.ote.models;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ote.models package. 
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
public class ObjectFactory {

    private final static QName _Facturas_QNAME = new QName("", "facturas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ote.models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FacturasType }
     * 
     */
    public FacturasType createFacturasType() {
        return new FacturasType();
    }

    /**
     * Create an instance of {@link FacturaType }
     * 
     */
    public FacturaType createFacturaType() {
        return new FacturaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturasType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacturasType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "facturas")
    public JAXBElement<FacturasType> createFacturas(FacturasType value) {
        return new JAXBElement<FacturasType>(_Facturas_QNAME, FacturasType.class, null, value);
    }

}
