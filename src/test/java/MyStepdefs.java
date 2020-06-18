import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class MyStepdefs {
    private RequestSpecification requestSpecification;
    private Response response;
    private ValidatableResponse validatableResponse;

    @Given("demo uses {string} and {string}")
    public void demoUsesAnd(String userName, String password) {
        requestSpecification = given()
                .auth()
                .preemptive()
                .basic(userName, password);
    }

    @When("demo makes a get request to {string}")
    public void demoMakesAGetRequestTo(String url) {

        response = requestSpecification.when()
                .get(url);
    }


    @Then("the status code is {string}")
    public void theStatusCodeIs(String statusCode) {
        validatableResponse = response
                .then()
                .statusCode(Integer.parseInt(statusCode));
    }
}
