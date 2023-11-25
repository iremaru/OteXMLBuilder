module com.ote.ote {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.xml.bind;
    requires com.dlsc.formsfx;

    opens com.ote.rexeni to javafx.fxml;
    exports com.ote.rexeni;
}