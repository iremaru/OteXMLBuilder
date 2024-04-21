package com.ote.rexeni;

import com.ote.rexeni.XMLBuilder.CSVwrapper;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class AppController {
    String TITLE_CHOOSER_OUTPUT = "Escoja el directorio donde se generarán los ficheros";
    String TITLE_CHOOSER_INPUT = "Escoja los ficheros a transformar";
    File inputDirectory;
    File outputDirectory;
    List<File> sourceFiles;

    @FXML
    private Label inputDir_label;
    @FXML
    private Label outputDir_label;
    @FXML
    private Button btnTransform;

    @FXML
    protected void onLoadButtonClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle(TITLE_CHOOSER_INPUT);
        if (inputDirectory != null) fileChooser.setInitialDirectory(inputDirectory);
        fileChooser
                .getExtensionFilters()
                .add(new FileChooser.ExtensionFilter(
                        "Archivos XLSM", "*.xlsx", "*.xlsm"
                ));
        //Todo: To consider allowing the user to load multiple files at once.
//        File selectedFile = fileChooser.showOpenDialog(new Stage());
        sourceFiles = fileChooser.showOpenMultipleDialog(new Stage());

        if (sourceFiles != null) {
            btnTransform.setDisable(false);
            inputDirectory = sourceFiles.get(0).getParentFile();
            inputDir_label.setText(sourceFiles.get(0).getName());
            for (int i = 1; i < (long) sourceFiles.size(); i++) {
                inputDir_label.setText(inputDir_label.getText()
                        + ", "
                        + sourceFiles.get(i).getName()
                );
            }

        }
    }

    @FXML
    protected void onOutputDirButtonClick() {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle(TITLE_CHOOSER_OUTPUT);

        outputDirectory = chooser.showDialog(new Stage());
//        if (outputDirectory != null) outputDir_label.setText(outputDirectory.getName());
        if (outputDirectory != null) outputDir_label.setText(outputDirectory.getAbsolutePath());
    }

    @FXML
    protected void onTransformButtonClick() {
        if (sourceFiles != null) {
            CSVwrapper builder = new CSVwrapper();
            sourceFiles.forEach(file -> builder.generate(null, file.getPath()));
        }
    }

    @FXML
    protected void onExitButtonClick() {
        Platform.exit();
    }
}