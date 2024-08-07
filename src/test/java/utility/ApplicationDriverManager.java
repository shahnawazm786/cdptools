package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public  WebDriver getDriver(EBrowser browserName) throws IOException {
    switch (browserName){
        case CHROME:
            options=new ChromeOptions();
            System.out.println(ArraysProcessing.getChromeOptions());
            options.addArguments(ArraysProcessing.getChromeOptions());
            driver=new ChromeDriver(options);
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


    return driver;
    }
}
