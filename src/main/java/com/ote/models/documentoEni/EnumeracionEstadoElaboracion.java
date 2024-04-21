
package com.ote.models;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enumeracionEstadoElaboracion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="enumeracionEstadoElaboracion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EE01"/&gt;
 *     &lt;enumeration value="EE02"/&gt;
 *     &lt;enumeration value="EE03"/&gt;
 *     &lt;enumeration value="EE04"/&gt;
 *     &lt;enumeration value="EE99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumeracionEstadoElaboracion", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos")
@XmlEnum
public enum EnumeracionEstadoElaboracion {

    @XmlEnumValue("EE01")
    EE_01("EE01"),
    @XmlEnumValue("EE02")
    EE_02("EE02"),
    @XmlEnumValue("EE03")
    EE_03("EE03"),
    @XmlEnumValue("EE04")
    EE_04("EE04"),
    @XmlEnumValue("EE99")
    EE_99("EE99");
    private final String value;

    EnumeracionEstadoElaboracion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumeracionEstadoElaboracion fromValue(String v) {
        for (EnumeracionEstadoElaboracion c: EnumeracionEstadoElaboracion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
