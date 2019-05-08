package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FundsCompareSteps {

  private WebDriver driver;

  @Given("^retail homepage is loaded$")
  public void retail_homepage_is_loaded() throws Throwable {
    driver = BaseSteps.driver;
    driver.get(BaseSteps.baseURL+"/retail/jsp/home.jsp");
    driver.manage().window().maximize();
    assertTrue(driver.findElement(By.linkText("SMSF & INDIVIDUAL INVESTORS")).isDisplayed());
  }

  @When("^user clicks on 'Retail managed funds' link$")
  public void user_clicks_on_Retail_managed_funds_link() throws Throwable {
    driver.findElement(By.linkText("Retail managed funds")).click();
    Thread.sleep(1000);
  }

  @Then("^retail investment products page is displayed$")
  public void retail_investment_products_page_is_displayed() throws Throwable {
    assertTrue(driver.findElement(By.xpath("//*[@id='banner']/h1[text()='Investment products']")).isDisplayed());
    assertEquals("Retail Fund", driver.findElement(By.xpath("//*[@id='productType_box']")).getText());
  }

  @Given("^more than (\\d+) funds are displayed$")
  public void more_than_funds_are_displayed(int numOfFunds) throws Throwable {
    List<WebElement> fundsList = driver.findElements(By.xpath("//*[@id='listviewTable']/div/div[2]/div[1]//*[@class='fundCompareChkBox']"));
    assertTrue(numOfFunds <= fundsList.size());
  }

  @When("^user selects (\\d+) funds$")
  public void user_selects_funds(int numOfFunds) throws Throwable {
        for (int i = 0; i < numOfFunds; i++) {
          WebElement fund = driver.findElements(By.xpath("//*[@id='listviewTable']/div/div[2]/div[1]//*[@class='fundCompareChkBox']")).get(i);
          ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true); "+ "window.scrollBy(0,-200);", fund);
          assertTrue(fund.isDisplayed());
          fund.click();
          Thread.sleep(1000);
    }
  }

  @When("^user clicks 'Compare' button$")
  public void user_clicks_Compare_button() throws Throwable {
    assertTrue(driver.findElement(By.id("compareFunds")).isDisplayed());
    driver.findElement(By.id("compareFunds")).click();
    Thread.sleep(1000);
  }

  @Then("^'Compare products' page is loaded$")
  public void compare_products_page_is_loaded() throws Throwable {
    assertTrue(driver.findElement(By.xpath("//*[@id='fcImage']//*[text()='Compare products']")).isDisplayed());
  }


}
