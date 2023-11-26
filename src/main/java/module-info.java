module com.ote.ote {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires org.glassfish.jaxb.runtime;
    requires jakarta.xml.bind;
    requires com.dlsc.formsfx;

    opens com.ote.models to jakarta.xml.bind;
    opens com.ote.rexeni to javafx.fxml;
    exports com.ote.rexeni;
}