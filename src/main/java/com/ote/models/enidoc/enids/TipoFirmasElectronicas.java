
package com.ote.models.enidoc.enids;

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
 * <p>Clase Java para TipoFirmasElectronicas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoFirmasElectronicas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoFirma"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="TF01"/&gt;
 *               &lt;enumeration value="TF02"/&gt;
 *               &lt;enumeration value="TF03"/&gt;
 *               &lt;enumeration value="TF04"/&gt;
 *               &lt;enumeration value="TF05"/&gt;
 *               &lt;enumeration value="TF06"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContenidoFirma"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="CSV"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ValorCSV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RegulacionGeneracionCSV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FirmaConCertificado"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="FirmaBase64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                             &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *                             &lt;element name="ReferenciaFirma" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoFirmasElectronicas", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", propOrder = {
    "tipoFirma",
    "contenidoFirma"
})
public class TipoFirmasElectronicas {

    @XmlElement(name = "TipoFirma", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", required = true)
    protected String tipoFirma;
    @XmlElement(name = "ContenidoFirma", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", required = true)
    protected TipoFirmasElectronicas.ContenidoFirma contenidoFirma;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ref")
    protected String ref;

    /**
     * Obtiene el valor de la propiedad tipoFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFirma() {
        return tipoFirma;
    }

    /**
     * Define el valor de la propiedad tipoFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFirma(String value) {
        this.tipoFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad contenidoFirma.
     * 
     * @return
     *     possible object is
     *     {@link TipoFirmasElectronicas.ContenidoFirma }
     *     
     */
    public TipoFirmasElectronicas.ContenidoFirma getContenidoFirma() {
        return contenidoFirma;
    }

    /**
     * Define el valor de la propiedad contenidoFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFirmasElectronicas.ContenidoFirma }
     *     
     */
    public void setContenidoFirma(TipoFirmasElectronicas.ContenidoFirma value) {
        this.contenidoFirma = value;
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

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="CSV"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ValorCSV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="RegulacionGeneracionCSV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FirmaConCertificado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="FirmaBase64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *                   &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
     *                   &lt;element name="ReferenciaFirma" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "csv",
        "firmaConCertificado"
    })
    public static class ContenidoFirma {

        @XmlElement(name = "CSV", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
        protected TipoFirmasElectronicas.ContenidoFirma.CSV csv;
        @XmlElement(name = "FirmaConCertificado", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
        protected TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado firmaConCertificado;

        /**
         * Obtiene el valor de la propiedad csv.
         * 
         * @return
         *     possible object is
         *     {@link TipoFirmasElectronicas.ContenidoFirma.CSV }
         *     
         */
        public TipoFirmasElectronicas.ContenidoFirma.CSV getCSV() {
            return csv;
        }

        /**
         * Define el valor de la propiedad csv.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoFirmasElectronicas.ContenidoFirma.CSV }
         *     
         */
        public void setCSV(TipoFirmasElectronicas.ContenidoFirma.CSV value) {
            this.csv = value;
        }

        /**
         * Obtiene el valor de la propiedad firmaConCertificado.
         * 
         * @return
         *     possible object is
         *     {@link TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado }
         *     
         */
        public TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado getFirmaConCertificado() {
            return firmaConCertificado;
        }

        /**
         * Define el valor de la propiedad firmaConCertificado.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado }
         *     
         */
        public void setFirmaConCertificado(TipoFirmasElectronicas.ContenidoFirma.FirmaConCertificado value) {
            this.firmaConCertificado = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ValorCSV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="RegulacionGeneracionCSV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "valorCSV",
            "regulacionGeneracionCSV"
        })
        public static class CSV {

            @XmlElement(name = "ValorCSV", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", required = true)
            protected String valorCSV;
            @XmlElement(name = "RegulacionGeneracionCSV", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma", required = true)
            protected String regulacionGeneracionCSV;

            /**
             * Obtiene el valor de la propiedad valorCSV.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorCSV() {
                return valorCSV;
            }

            /**
             * Define el valor de la propiedad valorCSV.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorCSV(String value) {
                this.valorCSV = value;
            }

            /**
             * Obtiene el valor de la propiedad regulacionGeneracionCSV.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegulacionGeneracionCSV() {
                return regulacionGeneracionCSV;
            }

            /**
             * Define el valor de la propiedad regulacionGeneracionCSV.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegulacionGeneracionCSV(String value) {
                this.regulacionGeneracionCSV = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="FirmaBase64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
         *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
         *         &lt;element name="ReferenciaFirma" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firmaBase64",
            "signature",
            "referenciaFirma"
        })
        public static class FirmaConCertificado {

            @XmlElement(name = "FirmaBase64", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
            protected byte[] firmaBase64;
            @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
            protected SignatureType signature;
            @XmlElement(name = "ReferenciaFirma", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
            protected Object referenciaFirma;

            /**
             * Obtiene el valor de la propiedad firmaBase64.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getFirmaBase64() {
                return firmaBase64;
            }

            /**
             * Define el valor de la propiedad firmaBase64.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setFirmaBase64(byte[] value) {
                this.firmaBase64 = value;
            }

            /**
             * Obtiene el valor de la propiedad signature.
             * 
             * @return
             *     possible object is
             *     {@link SignatureType }
             *     
             */
            public SignatureType getSignature() {
                return signature;
            }

            /**
             * Define el valor de la propiedad signature.
             * 
             * @param value
             *     allowed object is
             *     {@link SignatureType }
             *     
             */
            public void setSignature(SignatureType value) {
                this.signature = value;
            }

            /**
             * Obtiene el valor de la propiedad referenciaFirma.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getReferenciaFirma() {
                return referenciaFirma;
            }

            /**
             * Define el valor de la propiedad referenciaFirma.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setReferenciaFirma(Object value) {
                this.referenciaFirma = value;
            }

        }

    }

}
