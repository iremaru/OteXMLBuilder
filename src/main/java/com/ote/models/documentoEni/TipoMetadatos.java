
package com.ote.models;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Clase Java para TipoMetadatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoMetadatos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersionNTI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="Identificador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Organo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FechaCaptura" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OrigenCiudadanoAdministracion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EstadoElaboracion" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos}TipoEstadoElaboracion"/&gt;
 *         &lt;element name="TipoDocumental" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos}tipoDocumental"/&gt;
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
@XmlType(name = "TipoMetadatos", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", propOrder = {
    "versionNTI",
    "identificador",
    "organo",
    "fechaCaptura",
    "origenCiudadanoAdministracion",
    "estadoElaboracion",
    "tipoDocumental"
})
public class TipoMetadatos {

    @XmlElement(name = "VersionNTI", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String versionNTI;
    @XmlElement(name = "Identificador", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    protected String identificador;
    @XmlElement(name = "Organo", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    protected List<String> organo;
    @XmlElement(name = "FechaCaptura", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCaptura;
    @XmlElement(name = "OrigenCiudadanoAdministracion", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos")
    protected boolean origenCiudadanoAdministracion;
    @XmlElement(name = "EstadoElaboracion", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    protected TipoEstadoElaboracion estadoElaboracion;
    @XmlElement(name = "TipoDocumental", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    @XmlSchemaType(name = "string")
    protected TipoDocumental tipoDocumental;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad versionNTI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNTI() {
        return versionNTI;
    }

    /**
     * Define el valor de la propiedad versionNTI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNTI(String value) {
        this.versionNTI = value;
    }

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
    }

    /**
     * Gets the value of the organo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the organo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgano().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrgano() {
        if (organo == null) {
            organo = new ArrayList<String>();
        }
        return this.organo;
    }

    /**
     * Obtiene el valor de la propiedad fechaCaptura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCaptura() {
        return fechaCaptura;
    }

    /**
     * Define el valor de la propiedad fechaCaptura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCaptura(XMLGregorianCalendar value) {
        this.fechaCaptura = value;
    }

    /**
     * Obtiene el valor de la propiedad origenCiudadanoAdministracion.
     * 
     */
    public boolean isOrigenCiudadanoAdministracion() {
        return origenCiudadanoAdministracion;
    }

    /**
     * Define el valor de la propiedad origenCiudadanoAdministracion.
     * 
     */
    public void setOrigenCiudadanoAdministracion(boolean value) {
        this.origenCiudadanoAdministracion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoElaboracion.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoElaboracion }
     *     
     */
    public TipoEstadoElaboracion getEstadoElaboracion() {
        return estadoElaboracion;
    }

    /**
     * Define el valor de la propiedad estadoElaboracion.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoElaboracion }
     *     
     */
    public void setEstadoElaboracion(TipoEstadoElaboracion value) {
        this.estadoElaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumental.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumental }
     *     
     */
    public TipoDocumental getTipoDocumental() {
        return tipoDocumental;
    }

    /**
     * Define el valor de la propiedad tipoDocumental.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumental }
     *     
     */
    public void setTipoDocumental(TipoDocumental value) {
        this.tipoDocumental = value;
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
