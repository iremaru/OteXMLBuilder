package com.ote.models.enidoc;

import com.ote.models.enidoc.enidocmenta.TipoMetadatos;
import com.ote.models.enidoc.enids.Firmas;
import com.ote.models.enidoc.enifile.TipoContenido;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "documento", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumento", propOrder = {
        "contenido",
        "metadatos",
        "firmas"
})
public class TipoDocumento {

    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido", required = true)
    protected TipoContenido contenido;

    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    protected TipoMetadatos metadatos;

    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
    protected Firmas firmas;

    @XmlAttribute(name = "Id")
    protected String id;

    public TipoContenido getContenido() {
        return contenido;
    }

    public void setContenido(TipoContenido value) {
        this.contenido = value;
    }

    public TipoMetadatos getMetadatos() {
        return metadatos;
    }

    public void setMetadatos(TipoMetadatos value) {
        this.metadatos = value;
    }

    public Firmas getFirmas() {
        return firmas;
    }

    public void setFirmas(Firmas value) {
        this.firmas = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }
}
