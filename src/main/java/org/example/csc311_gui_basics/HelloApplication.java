package org.example.csc311_gui_basics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "/org/example/csc311_gui_basics/CSC311_GUI_Basics.fxml"
                )
        );

        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("CSC311 GUI Basics");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}