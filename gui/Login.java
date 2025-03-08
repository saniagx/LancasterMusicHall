package gui;

import src.Run;

public class Login extends Run {

    public Login() {}

    public void LoginButton() {
        // To do: Compare entered fields for username and password with database values
        ScreenController.loadScreen("MainMenu");
    }
}