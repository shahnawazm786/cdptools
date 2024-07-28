package steps;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CucumberHooks {
    public static WebDriver driver;
    
    @Before
    public void setup(){
        System.out.println("@Before");
    }
    @BeforeStep
    public void beforeStepSetup(Scenario scenario){
        System.out.println("@BeforeStep");
    }
    @AfterStep
    public void afterSetupTearDown(Scenario scenario){
        System.out.println("@AfterStep");
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("@After");
    }
}
