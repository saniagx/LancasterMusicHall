package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Run extends Application {
    static ScreenController sc;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws IOException {
        try {
            Scene scene = new Scene(new Pane(), 800, 600);
            sc = new ScreenController(scene);
            initializeScreens();
            sc.loadScreen("Login"); // Login screen is loaded on startup

            Image LMHlogo = new Image("assets/LMHlogo.png");
            stage.getIcons().add(LMHlogo);

            stage.setTitle("Lancaster's Music Hall");
            stage.setResizable(false);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Adds all screens to the screen hashmap in ScreenController
    public void initializeScreens() throws IOException {
        sc.addScreen("Login", FXMLLoader.load(getClass().getResource("login.fxml")));
        sc.addScreen("MainMenu", FXMLLoader.load(getClass().getResource("mainMenu.fxml")));
    }

    public static ScreenController getScreenController() {
        return sc;
    }
}
