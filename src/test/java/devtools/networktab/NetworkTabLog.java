package devtools.networktab;

import com.google.gson.JsonObject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.network.Network;
import org.openqa.selenium.devtools.v124.network.model.Request;
import org.openqa.selenium.devtools.v124.network.model.RequestId;
import org.openqa.selenium.devtools.v124.network.model.Response;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class NetworkTabLog {
    ChromeDriver driver;
    ChromeOptions options;
    @Test
    public void captureNetworkTabLog() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
/*        DevTools devTools=driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty()
        ,Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(),requestConsume-> {
                    Request request = requestConsume.getRequest();
                    System.out.println(request.getUrl());

                });
*/
        // capturing the response

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        DevTools devTools=driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty()
                ,Optional.empty()));

        final RequestId[] requestIds=new RequestId[1];
        final String[] responseBody = {null};
        devTools.addListener(Network.responseReceived(),
                responseReceived -> {
                    Response response=responseReceived.getResponse();
                    requestIds[0]=responseReceived.getRequestId();

                    if(response.getUrl().contains("/personal-details")){
                        System.out.println(response.getHeaders());
                        System.out.println(response.getStatus());
                        System.out.println(response.getUrl());
                        responseBody[0] =devTools.send(Network.getResponseBody(requestIds[0])).getBody();
                        System.out.println(responseBody[0]);
                    }

                });

        driver.findElement(By.cssSelector("a[href*='viewMyDetails']")).click();
        Thread.sleep(5000);
        devTools.disconnectSession();
        devTools.close();
        driver.quit();



    }
}
