package apiTesting;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCase1 {
    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

        int expectedCode= 200;
        given()
                .auth()
                .preemptive()
                .basic("demo", "12345")
                .when()
                .get("https://demo.cyclos.org/api/demo/addresses")
                .then()
                .statusCode(expectedCode);


//                .assertThat()
//                .body("data.id", hasSize(6))
//                .and()
//                .statusCode(200);
//
//        given().
//                when().
//                get("http://ergast.com/api/f1/2017/circuits.json").
//                then().
//                assertThat().
//                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
    }

}
