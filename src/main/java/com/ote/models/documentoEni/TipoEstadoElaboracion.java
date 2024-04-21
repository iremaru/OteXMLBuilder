
package com.ote.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoEstadoElaboracion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoEstadoElaboracion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValorEstadoElaboracion" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos}enumeracionEstadoElaboracion"/&gt;
 *         &lt;element name="IdentificadorDocumentoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEstadoElaboracion", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", propOrder = {
    "valorEstadoElaboracion",
    "identificadorDocumentoOrigen"
})
public class TipoEstadoElaboracion {

    @XmlElement(name = "ValorEstadoElaboracion", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    @XmlSchemaType(name = "string")
    protected EnumeracionEstadoElaboracion valorEstadoElaboracion;
    @XmlElement(name = "IdentificadorDocumentoOrigen", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos")
    protected String identificadorDocumentoOrigen;

    /**
     * Obtiene el valor de la propiedad valorEstadoElaboracion.
     * 
     * @return
     *     possible object is
     *     {@link EnumeracionEstadoElaboracion }
     *     
     */
    public EnumeracionEstadoElaboracion getValorEstadoElaboracion() {
        return valorEstadoElaboracion;
    }

    /**
     * Define el valor de la propiedad valorEstadoElaboracion.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeracionEstadoElaboracion }
     *     
     */
    public void setValorEstadoElaboracion(EnumeracionEstadoElaboracion value) {
        this.valorEstadoElaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorDocumentoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorDocumentoOrigen() {
        return identificadorDocumentoOrigen;
    }

    /**
     * Define el valor de la propiedad identificadorDocumentoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorDocumentoOrigen(String value) {
        this.identificadorDocumentoOrigen = value;
    }

}
