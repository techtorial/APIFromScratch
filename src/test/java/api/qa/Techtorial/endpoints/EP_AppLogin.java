package api.qa.Techtorial.endpoints;

import api.qa.Techtorial.pojo.PJ_AppLogin;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import utils.ConfigReader;

public class EP_AppLogin {

    public void validateLoginInformation(String message,String name){

        RestAssured.baseURI= ConfigReader.readProperty("baseUrl");
        RestAssured.basePath=ConfigReader.readProperty("base_path_login");

        Response response=RestAssured.given().contentType("application/json")
                .accept("application/json").body("{\"email\":\"testemployee@example.com\",\n" +
                        " \"password\":\"1234567890\"\n" +
                        "}")
                .when().post().then().statusCode(200).log().body().extract().response();

        PJ_AppLogin deserializedResponse=response.as(PJ_AppLogin.class);

        Assertions.assertEquals(message,deserializedResponse.getMessage());
        Assertions.assertNotNull(deserializedResponse.getData().getToken());
        Assertions.assertEquals(name,deserializedResponse.getData().getUser().getName());







    }
}
