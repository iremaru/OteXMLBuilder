
package com.ote.models.enidoc.enids;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para firmas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="firmas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firma" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma}TipoFirmasElectronicas" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firmas", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", propOrder = {
    "firma"
})
public class Firmas {

    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", required = true)
    protected List<TipoFirmasElectronicas> firma;

    /**
     * Gets the value of the firma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the firma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoFirmasElectronicas }
     * 
     * 
     */
    public List<TipoFirmasElectronicas> getFirma() {
        if (firma == null) {
            firma = new ArrayList<TipoFirmasElectronicas>();
        }
        return this.firma;
    }

}
