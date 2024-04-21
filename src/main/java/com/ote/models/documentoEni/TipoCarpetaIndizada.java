
package com.ote.models;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TipoCarpetaIndizada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoCarpetaIndizada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificadorCarpeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="DocumentoIndizado" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido}TipoDocumentoIndizado"/&gt;
 *           &lt;element name="ExpedienteIndizado" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido}TipoIndiceContenido"/&gt;
 *           &lt;element name="CarpetaIndizada" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido}TipoCarpetaIndizada"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "TipoCarpetaIndizada", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", propOrder = {
    "identificadorCarpeta",
    "documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada"
})
public class TipoCarpetaIndizada {

    @XmlElement(name = "IdentificadorCarpeta", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", required = true)
    protected String identificadorCarpeta;
    @XmlElements({
        @XmlElement(name = "DocumentoIndizado", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", type = TipoDocumentoIndizado.class),
        @XmlElement(name = "ExpedienteIndizado", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", type = TipoIndiceContenido.class),
        @XmlElement(name = "CarpetaIndizada", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/indice-e/contenido", type = TipoCarpetaIndizada.class)
    })
    protected List<Object> documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad identificadorCarpeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorCarpeta() {
        return identificadorCarpeta;
    }

    /**
     * Define el valor de la propiedad identificadorCarpeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorCarpeta(String value) {
        this.identificadorCarpeta = value;
    }

    /**
     * Gets the value of the documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoCarpetaIndizada }
     * {@link TipoDocumentoIndizado }
     * {@link TipoIndiceContenido }
     * 
     * 
     */
    public List<Object> getDocumentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada() {
        if (documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada == null) {
            documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada = new ArrayList<Object>();
        }
        return this.documentoIndizadoOrExpedienteIndizadoOrCarpetaIndizada;
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
