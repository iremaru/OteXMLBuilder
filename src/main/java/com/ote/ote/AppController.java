package com.ote.ote;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class AppController {
    File inputDirectory;
    List<File> sourceFiles;

    @FXML
    private Label inputDir_label;

    @FXML
    protected void onLoadButtonClick() {
        FileChooser fileChooser = new FileChooser();
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
            inputDirectory = sourceFiles.get(0).getParentFile();
            inputDir_label.setText(sourceFiles.get(0).getName());
            for (int i = 1; i < sourceFiles.stream().count(); i++) {
                inputDir_label.setText(inputDir_label.getText()
                        + ", "
                        + sourceFiles.get(i).getName()
                );
            }

        }
    }
}