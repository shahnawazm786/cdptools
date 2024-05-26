package steps;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CucumberHooks {
    public static WebDriver driver;
    
    @Before
    public void setup(){

    }
    @BeforeStep
    public void beforeStepSetup(Scenario scenario){

    }
    @AfterStep
    public void afterSetupTearDown(Scenario scenario){

    }
    @After
    public void tearDown(Scenario scenario){

    }
}
