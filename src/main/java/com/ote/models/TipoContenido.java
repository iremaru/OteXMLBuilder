
package com.ote.models;

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
 * <p>Clase Java para TipoContenido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoContenido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DatosXML" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="ValorBinario" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="referenciaFichero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="NombreFormato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "TipoContenido", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido", propOrder = {
    "datosXML",
    "valorBinario",
    "referenciaFichero",
    "nombreFormato"
})
public class TipoContenido {

    @XmlElement(name = "DatosXML", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido")
    protected Object datosXML;
    @XmlElement(name = "ValorBinario", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido")
    protected byte[] valorBinario;
    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido")
    protected String referenciaFichero;
    @XmlElement(name = "NombreFormato", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido", required = true)
    protected String nombreFormato;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad datosXML.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDatosXML() {
        return datosXML;
    }

    /**
     * Define el valor de la propiedad datosXML.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDatosXML(Object value) {
        this.datosXML = value;
    }

    /**
     * Obtiene el valor de la propiedad valorBinario.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValorBinario() {
        return valorBinario;
    }

    /**
     * Define el valor de la propiedad valorBinario.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValorBinario(byte[] value) {
        this.valorBinario = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaFichero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaFichero() {
        return referenciaFichero;
    }

    /**
     * Define el valor de la propiedad referenciaFichero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaFichero(String value) {
        this.referenciaFichero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFormato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFormato() {
        return nombreFormato;
    }

    /**
     * Define el valor de la propiedad nombreFormato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFormato(String value) {
        this.nombreFormato = value;
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
