
package com.ote.models;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoDocumental.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tipoDocumental"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TD01"/&gt;
 *     &lt;enumeration value="TD02"/&gt;
 *     &lt;enumeration value="TD03"/&gt;
 *     &lt;enumeration value="TD04"/&gt;
 *     &lt;enumeration value="TD05"/&gt;
 *     &lt;enumeration value="TD06"/&gt;
 *     &lt;enumeration value="TD07"/&gt;
 *     &lt;enumeration value="TD08"/&gt;
 *     &lt;enumeration value="TD09"/&gt;
 *     &lt;enumeration value="TD10"/&gt;
 *     &lt;enumeration value="TD11"/&gt;
 *     &lt;enumeration value="TD12"/&gt;
 *     &lt;enumeration value="TD13"/&gt;
 *     &lt;enumeration value="TD14"/&gt;
 *     &lt;enumeration value="TD15"/&gt;
 *     &lt;enumeration value="TD16"/&gt;
 *     &lt;enumeration value="TD17"/&gt;
 *     &lt;enumeration value="TD18"/&gt;
 *     &lt;enumeration value="TD19"/&gt;
 *     &lt;enumeration value="TD20"/&gt;
 *     &lt;enumeration value="TD99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoDocumental", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos")
@XmlEnum
public enum TipoDocumental {

    @XmlEnumValue("TD01")
    TD_01("TD01"),
    @XmlEnumValue("TD02")
    TD_02("TD02"),
    @XmlEnumValue("TD03")
    TD_03("TD03"),
    @XmlEnumValue("TD04")
    TD_04("TD04"),
    @XmlEnumValue("TD05")
    TD_05("TD05"),
    @XmlEnumValue("TD06")
    TD_06("TD06"),
    @XmlEnumValue("TD07")
    TD_07("TD07"),
    @XmlEnumValue("TD08")
    TD_08("TD08"),
    @XmlEnumValue("TD09")
    TD_09("TD09"),
    @XmlEnumValue("TD10")
    TD_10("TD10"),
    @XmlEnumValue("TD11")
    TD_11("TD11"),
    @XmlEnumValue("TD12")
    TD_12("TD12"),
    @XmlEnumValue("TD13")
    TD_13("TD13"),
    @XmlEnumValue("TD14")
    TD_14("TD14"),
    @XmlEnumValue("TD15")
    TD_15("TD15"),
    @XmlEnumValue("TD16")
    TD_16("TD16"),
    @XmlEnumValue("TD17")
    TD_17("TD17"),
    @XmlEnumValue("TD18")
    TD_18("TD18"),
    @XmlEnumValue("TD19")
    TD_19("TD19"),
    @XmlEnumValue("TD20")
    TD_20("TD20"),
    @XmlEnumValue("TD99")
    TD_99("TD99");
    private final String value;

    TipoDocumental(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumental fromValue(String v) {
        for (TipoDocumental c: TipoDocumental.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
