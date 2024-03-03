
package com.ote.models;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enumeracionEstados.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="enumeracionEstados"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E01"/&gt;
 *     &lt;enumeration value="E02"/&gt;
 *     &lt;enumeration value="E03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumeracionEstados", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/metadatos")
@XmlEnum
public enum EnumeracionEstados {

    @XmlEnumValue("E01")
    E_01("E01"),
    @XmlEnumValue("E02")
    E_02("E02"),
    @XmlEnumValue("E03")
    E_03("E03");
    private final String value;

    EnumeracionEstados(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumeracionEstados fromValue(String v) {
        for (EnumeracionEstados c: EnumeracionEstados.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
