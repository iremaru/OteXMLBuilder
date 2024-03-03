
package com.ote.models;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TipoDocumentoIndizado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumentoIndizado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificadorDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ValorHuella" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FuncionResumen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaIncorporacionExpediente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrdenDocumentoExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumentoIndizado", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", propOrder = {
    "identificadorDocumento",
    "valorHuella",
    "funcionResumen",
    "fechaIncorporacionExpediente",
    "ordenDocumentoExpediente"
})
public class TipoDocumentoIndizado {

    @XmlElement(name = "IdentificadorDocumento", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", required = true)
    protected String identificadorDocumento;
    @XmlElement(name = "ValorHuella", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", required = true)
    protected String valorHuella;
    @XmlElement(name = "FuncionResumen", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", required = true)
    protected String funcionResumen;
    @XmlElement(name = "FechaIncorporacionExpediente", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIncorporacionExpediente;
    @XmlElement(name = "OrdenDocumentoExpediente", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido")
    protected String ordenDocumentoExpediente;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad identificadorDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorDocumento() {
        return identificadorDocumento;
    }

    /**
     * Define el valor de la propiedad identificadorDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorDocumento(String value) {
        this.identificadorDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad valorHuella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorHuella() {
        return valorHuella;
    }

    /**
     * Define el valor de la propiedad valorHuella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorHuella(String value) {
        this.valorHuella = value;
    }

    /**
     * Obtiene el valor de la propiedad funcionResumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncionResumen() {
        return funcionResumen;
    }

    /**
     * Define el valor de la propiedad funcionResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncionResumen(String value) {
        this.funcionResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIncorporacionExpediente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIncorporacionExpediente() {
        return fechaIncorporacionExpediente;
    }

    /**
     * Define el valor de la propiedad fechaIncorporacionExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIncorporacionExpediente(XMLGregorianCalendar value) {
        this.fechaIncorporacionExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenDocumentoExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenDocumentoExpediente() {
        return ordenDocumentoExpediente;
    }

    /**
     * Define el valor de la propiedad ordenDocumentoExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenDocumentoExpediente(String value) {
        this.ordenDocumentoExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
