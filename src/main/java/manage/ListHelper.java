package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListHelper extends HelperBase{
    public ListHelper(WebDriver wd) {
        super(wd);
    }

    public void createList(String listName) {
        click(By.cssSelector(".icon-add"));
        type(By.xpath("[@placeholder='Enter a title for this card…']"),listName);
        click(By.cssSelector(".js-save-edit"));


    }
}

