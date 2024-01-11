package api;

import core.utils.restAssured.BaseTest;
import org.testng.annotations.Test;
import static core.utils.restAssured.RestAssuredUtil.getRequestUrl;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class LocationFilter extends BaseTest {

    String city = "karachi";
    static String accessToken = "sk.eyJ1IjoienViYWlyYWxhbTEyMyIsImEiOiJjbDByOGJ6MWkwMHpkM2pxZDE1OXptbnM4In0.ukuCkfJWZWJ9yEMwhMmACw";
    static String   invalidAccessToken = "sk.eyJ1IjoienViYWlyYWxhbTEyMyIsImEiOiJjbDByO";

    @Test
    public void getLocationFilter() {

        given().when().get(getRequestUrl() + city + ".json?" + "access_token=" + accessToken)
                .then().statusCode(200).body("query", hasItem(city));
    }

    @Test
    public void getLocationFilterWithoutToken() {

        given().when().get(getRequestUrl() + city + ".json?" + "access_token=")
                .then().statusCode(401).body("message", equalTo("Not Authorized - No Token"));
    }

    @Test
    public void getLocationFilterWithInvalidToken() {

        given().when().get(getRequestUrl() + city + ".json?" + "access_token=" + invalidAccessToken)
                .then().statusCode(401).body("message", equalTo("Not Authorized - Invalid Token"));
    }

    @Test
    public void getLocationFilterWithoutCityFilter() {

        given().when().get(getRequestUrl() + "?access_token=" + accessToken)
                .then().statusCode(404).body("message", equalTo("Not Found"));
    }
}
