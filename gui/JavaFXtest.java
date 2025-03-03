package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFXtest extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX works in our project!");
        Scene scene = new Scene(label, 300, 200);
        stage.setTitle("Test JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}