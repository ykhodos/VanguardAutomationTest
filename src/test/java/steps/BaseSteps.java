package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSteps {

  public java.util.Properties properties;

  public static WebDriver driver;
  public static String baseURL;
  public static String browser;
  public static int implicitWaitSec;

  @Before
  public void beforeScenario(){
    //load application properties
    if(properties == null) {
      try {
        properties = new java.util.Properties();
        properties.load(getClass().getResourceAsStream("/application.properties"));

        baseURL = properties.getProperty("base_url");
        browser = properties.getProperty("browser");
        implicitWaitSec = Integer.parseInt(properties.getProperty("implicitWaitSec"));
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }

    //initiate web driver
    if (driver == null) {
      switch (browser) {
        case "Firefox":
          driver = new FirefoxDriver();
        case "Chrome":
        default:
          driver = new ChromeDriver();
      }
      driver.manage().timeouts().implicitlyWait(implicitWaitSec, TimeUnit.SECONDS);
    }
  }


  @After
  public void afterScenario() {
    if(driver != null)
      driver.quit();
  }

}
