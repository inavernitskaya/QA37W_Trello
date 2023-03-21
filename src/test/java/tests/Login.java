package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test
    public void login1() {

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("inavernitskaya@gmail.com", "aA54321!");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());


    }
}
