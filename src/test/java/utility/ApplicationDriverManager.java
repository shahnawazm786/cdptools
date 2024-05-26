package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class ApplicationDriverManager {
private WebDriver driver;
private ChromeOptions options;

    /***
     * Pass the browser name from the properties file
     * @param browserName
     * @return
     */
    public WebDriver getDriver(EBrowser browserName) throws IOException {
    switch (browserName){
        case CHROME:
            options=new ChromeOptions();
            options.addArguments(ArraysProcessing.getChromeOptions());
            break;
        case FIREFOX:
            System.out.println("Firefox");
            break;
        case EDGE:
            System.out.println("EDGE");
            break;
        case SAFARI:
            System.out.println("Safari");
            break;
        default:
            System.out.println("CHROME");

    }


    return null;
    }
}
