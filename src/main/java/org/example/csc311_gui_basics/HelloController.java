package org.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private void onHelloButtonClick() {
        System.out.println("Button clicked!");
    }

    @FXML
    private void changeBackgroundColor() {
        Color color = colorPicker.getValue();

        mainPane.setStyle(
                "-fx-background-color: " + toHex(color) + ";"
        );
    }

    private String toHex(Color color) {
        return String.format(
                "#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255)
        );
    }
}