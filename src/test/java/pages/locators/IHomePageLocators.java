package pages.locators;

public interface IHomePageLocators {
    String contactListAppTextTagName="h1";
    String welcomeMessageTextXpath="(//div[@class='welcome-message'])[1]";
    String welcomeMessageAPITextXpath="(//div[@class='welcome-message'])[2]";
    String welcomeMessageAPIHyperLinkXpath="//a[text()='here']";
    String loginTextXpath="(//div[@class='main-content']//p)[1]";

}
