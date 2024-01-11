package api;

import core.utils.restAssured.BaseTest;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONArray;
import org.testng.annotations.Test;
import static core.utils.restAssured.RestAssuredUtil.getBaseUrl;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import org.json.simple.JSONObject;

public class Cognito extends BaseTest {

    static String jwtToken ;
    static String loginPath = "/api/cognito/authentication/login";
    static String createUserPath = "/api/users/add_user/minimal-info";
    static String logoutPath = "/api/cognito/authentication/logout";

    String email = "srijan-admin@srijan.net";
    String password = "Srijan@12345";
    String auth = "Authorization";

    String employee_id= RandomStringUtils.randomNumeric(4);
    String firstName=RandomStringUtils.randomAlphabetic(5);
    String lastName=RandomStringUtils.randomAlphabetic(5);
    String description = RandomStringUtils.randomAlphanumeric(20);

    String Number=RandomStringUtils.randomNumeric(11);
    String phoneExtension=RandomStringUtils.randomNumeric(4);
    String createUserEmail = RandomStringUtils.randomAlphanumeric(7)+"@gmail.com";
    String refToken= RandomStringUtils.randomAlphanumeric(10);

    @Test
    public void loginUser() {
        System.out.println("Login Request : " + getBaseUrl()  + loginPath);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\""+ email +"\", \"password\":\""+password+"\"}")
                .when()
                .post(getBaseUrl()  + loginPath);
        res.then().assertThat()
                .statusCode(200)
                .body("application_code", equalTo(200))
                .body("message", equalTo("Authenticated"))
                .body("error", equalTo(false));
        System.out.println(res.body());

        jwtToken = res.getBody().jsonPath().get("data[0].jwt").toString();
    }


    @Test
    public void logoutUser() {

        loginUser();
        System.out.println("Logout Request : " + getBaseUrl()  + logoutPath);
        Response res = given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\""+ email +"\",\"refresh_token\":\""+ refToken +"\"}")
                .when()
                .post(getBaseUrl()  + logoutPath);
        res.then().assertThat()
                .statusCode(200)
                .body("application_code", equalTo(200))
                .body("message", equalTo("Invalidated the token"))
                .body("error", equalTo(false));

        JsonPath body = res.getBody().jsonPath();
        System.out.println("Logout Response Body: " + res.getBody().asString());

    }

    @Test
    public void createUser() {

        loginUser();
        JSONObject phone_number = new JSONObject();
        JSONObject name = new JSONObject();

        phone_number.put("ext",phoneExtension);
        phone_number.put("number",Number);
        name.put("last_name",lastName );
        name.put("first_name", firstName);
        System.out.println("Create User Request : " + getBaseUrl()  + createUserPath);
        Response res = given()
                .contentType(ContentType.JSON)
                .header("authorization", "Bearer "+jwtToken)
                .body("{\"employee_id\":\""+ employee_id +"\",\"name\":{\"first_name\":\""+firstName+"\",\"last_name\":\""+lastName+"\"},\"email\":\""+createUserEmail+"\",\"access\":\"careagent\",\"phone_number\":{\"number\":\""+Number+"\",\"ext\":\""+phoneExtension+"\"},\"is_active\":true}")
                //.body("{\"employee_id\":\""+ employee_id +"\",\"name\":\""+name+"\",\"email\":\""+createUserEmail+"\", \"access\":\""+ "careagent" +"\",\"phone_number\":\""+ phone_number +"\",\"is_active\":\""+ "true" +"\" }")
                .when()
                .post(getBaseUrl()  + createUserPath);
        res.then().assertThat()
                .statusCode(200)
                .body("application_code", equalTo(200))
                .body("message", equalTo("careagent created successfully"))
                .body("error", equalTo(false));;


        System.out.println("Create User Request Request Body: " + "{\"employee_id\":\""+ employee_id +"\",\"name\":\""+name+"\",\"email\":\""+createUserEmail+"\", \"access\":\""+ "careagent" +"\",\"phone_number\":\""+ phone_number +"\",\"is_active\":\""+ "true" +"\" }");
        System.out.println("Create User Request Response Body: " + res.getBody().asString());
    }

}
