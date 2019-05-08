package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.List;
import java.util.Map;


public class NavInformationSteps {

  public static RequestSpecification request;
  public static Response response;

  @Given("^The Nav Price List URL$")
  public void theNavPriceListURL() throws Throwable {
    request = RestAssured.given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON);
  }

  @When("^Nav Price List is retrieved$")
  public void navPriceListIsRetrieved() throws Throwable {
    response = request.when().get(BaseSteps.baseURL+"/retail/mvc/getNavPriceList.jsonp");
    assertEquals(response.getStatusCode(),200);
  }

  @Then("^NAV information is available for products$")
  public void navInformationIsAvailableForProducts() throws Throwable {
    List<Map<String,String>> jsonResponse = response.then().extract().response().jsonPath().getList("$");
    for(Map<String,String>element:jsonResponse){
      assertNotNull(element.get("navPriceArray"));
      assertNotNull(element.get("portId"));
    }
  }
}
