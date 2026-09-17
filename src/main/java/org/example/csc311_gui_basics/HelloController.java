package org.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private BarChart<String, Number> barChart;

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

    @FXML
    private void initialize() {

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Programming Languages");

        series.getData().add(new XYChart.Data<>("Java", 8));
        series.getData().add(new XYChart.Data<>("Python", 6));
        series.getData().add(new XYChart.Data<>("C++", 4));
        series.getData().add(new XYChart.Data<>("JavaScript", 7));

        barChart.getData().add(series);
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