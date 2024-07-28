package steps;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import utility.ApplicationDriverManager;
import utility.EBrowser;
import utility.ReadPropertiesFileManager;

import java.io.IOException;

public class CucumberHooks {
    public static WebDriver driver;
    
    @Before
    public void setup() throws IOException {
        driver= new ApplicationDriverManager().getDriver(EBrowser.CHROME);
        driver.get(ReadPropertiesFileManager.getValue("system.application.url"));
    }
    @BeforeStep
    public void beforeStepSetup(Scenario scenario){
        //System.out.println(scenario.getLine());
        System.out.println(scenario.getName());
    }
    @AfterStep
    public void afterSetupTearDown(Scenario scenario){
        System.out.println(scenario.getStatus().toString());
    }
    @After
    public void tearDown(Scenario scenario){
        if(driver!=null){
        driver.manage().deleteAllCookies();
        driver.quit();
        }
    }
}
