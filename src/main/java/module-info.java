module com.ote.ote {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.xml.bind;

    opens com.ote.ote to javafx.fxml;
    exports com.ote.ote;
}