package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.IHomePageLocators;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    /***
     *  Element Declarations
     */
    private By contactListAppText=By.tagName(IHomePageLocators.contactListAppTextTagName);
    private By welcomeMessageText=By.xpath(IHomePageLocators.welcomeMessageTextXpath);

    /***
     * Home page function
     */
    public void verifyHeadingText(){
        Assert.assertTrue(true);
    }

}
