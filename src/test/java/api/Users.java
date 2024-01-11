package api;

import core.utils.restAssured.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import static core.utils.restAssured.RestAssuredUtil.getBaseUrl;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class Users extends BaseTest {


}


//public class Users extends BaseTest {
//
//    @Test
//    public void deleteLocation() {
//        Cognito addLocation = new Cognito();
//        addLocation.addNewLocation();
//
//        System.out.println("Delete Location Request : " + getBaseUrl() + Cognito.requestPath + "/" + Cognito.id + "?access_token=" + LocationFilter.accessToken);
//        System.out.println("Validate Response Code With Success Status");
//        deleteRequest(Cognito.id,LocationFilter.accessToken)
//                .then()
//                .statusCode(204);
//    }
//
//    @Test
//    public void deletingDataSetAlreadyDeleted() {
//        Cognito addLocation = new Cognito();
//        addLocation.addNewLocation();
//
//        System.out.println("Delete Location Request : " + getBaseUrl() + Cognito.requestPath + "/" + Cognito.id + "?access_token=" + LocationFilter.accessToken);
//        System.out.println("Validate Response Code With Success Status");
//        deleteRequest(Cognito.id,LocationFilter.accessToken)
//                .then()
//                .statusCode(204);
//
//        // second delete request with 422  response code
//        System.out.println("Validate Response Code with 422 Unprocessable Entity");
//        deleteRequest(Cognito.id,LocationFilter.accessToken)
//                .then()
//                .statusCode(422)
//                .body("message", equalTo("No dataset"));
//    }
//
//    @Test
//    public void deleteLocationWithInvalidId() {
//        String invalidID = "xyz123ID";
//        System.out.println("Delete Location Request : " + getBaseUrl() + Cognito.requestPath + "/" + invalidID + "?access_token=" + LocationFilter.accessToken);
//
//        System.out.println("Validate Response Code with 422 Unprocessable Entity");
//        deleteRequest(invalidID, LocationFilter.accessToken)
//                .then()
//                .statusCode(422)
//                .body("message", equalTo("No dataset"));
//    }
//
//    @Test
//    public void deleteLocationWithNullId() {
//        System.out.println("Delete Location Request : " + getBaseUrl() + Cognito.requestPath + "/" + null + "?access_token=" + LocationFilter.accessToken);
//
//        System.out.println("Validate Response Code with 422 Unprocessable Entity");
//        deleteRequest(null
//                , LocationFilter.accessToken)
//                .then()
//                .statusCode(422)
//                .body("message", equalTo("No dataset"));
//    }
//
//    @Test
//    public void deleteLocationWithInvalidToken()  {
//        System.out.println("Delete Location Request : " + getBaseUrl() + Cognito.requestPath + "/" + Cognito.id + "?access_token=" + LocationFilter.invalidAccessToken);
//
//        System.out.println("Validate Response Code With 401 Unauthorized");
//        deleteRequest(Cognito.id,LocationFilter.invalidAccessToken)
//                .then()
//                .statusCode(401)
//                .body("message", equalTo("Unauthorized"));
//    }
//
//    @Test
//    public void deleteLocationWithoutToken()  {
//        System.out.println("Delete Location Request : " + getBaseUrl() + Cognito.requestPath + "/" + Cognito.id + "?access_token=" );
//
//        System.out.println("Validate Response Code With 401 Unauthorized");
//        deleteRequest(Cognito.id,"")
//                .then()
//                .statusCode(401)
//                .body("message", equalTo("Unauthorized"));
//    }
//
//    public Response deleteRequest(String id, String token)  {
//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .delete(getBaseUrl() + Cognito.requestPath + "/" + id + "?access_token=" + token);
//        System.out.println("Delete Location Response Body: " + response.getBody().asString());
//        return response;
//    }
//}
