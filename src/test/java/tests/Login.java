package tests;

import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    Logger logger =LoggerFactory.getLogger(Login.class);

    @BeforeMethod
    public void preCondition(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }

    @Test
    public void login1() {
        User user = User.builder().email("inavernitskaya@gmail.com").password("aA54321!").build();
        logger.info("Test login positive 1---"+user.getEmail()+ ""+user.getPassword());

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);
        logger.info("Logged--");

        Assert.assertTrue(app.getUser().isLogged());



    }
}