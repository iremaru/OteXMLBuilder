module com.ote.ote {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ote.ote to javafx.fxml;
    exports com.ote.ote;
}