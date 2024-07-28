package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFunctions {
    static WebDriverWait wait;
    static boolean flag=false;
    public static void driverWait(WebDriver driver,By element,long time){
        wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public static void driverWait(WebDriver driver, WebElement element, long time){
        wait=new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static boolean isDisplay(WebDriver driver, By element,long time){
        driverWait(driver,element,time);
        flag=driver.findElement(element).isDisplayed();
        return flag;
    }
}
