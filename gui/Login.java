package gui;

public class Login extends Run {
    private ScreenController sc;

    public Login() {
        this.sc = getScreenController();
    }

    public void LoginButton() {
        // To do: Compare entered fields for username and password with database values
        sc.loadScreen("MainMenu");
    }
}