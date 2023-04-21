package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserModification extends TestBase {
    @Test
    public void testNewTab() {
        app.getUser().openTabAndSwitch();
        app.getUser().pause(2000);
    }

    @Test
    public void changeAvatar() {
        app.getUser().clickTheAvatar();
        app.getUser().pause(2000);
        app.getUser().openUserProfile();
        app.getUser().goToTheAtlassianAccount();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUrl().contains("https://id.atlassian.com/manage-profile/profile-and-visibility"));
        app.getAtlassian().initChangePhoto();
        app.getAtlassian().uploadPhoto("C:\\Users\\Adam-milo\\Desktop\\QA37_Automat\\QA37W_Trello\\src\\test\\resources\\avatar.jpg");
        app.getAtlassian().pause(2000);
        app.getUser().returnToThello();

        Assert.assertTrue(app.getUrl().contains("https://trello.com/"));

    }
}