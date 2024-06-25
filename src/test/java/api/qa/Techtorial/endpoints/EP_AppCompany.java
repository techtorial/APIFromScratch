package api.qa.Techtorial.endpoints;

import api.qa.Techtorial.pojo.PJ_AppCompany;
import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import utils.ConfigReader;

public class EP_AppCompany {

    public void validateCompanyInformation(String expectedMessage,String companyName,String companyEmail,String companyPhone){

        RestAssured.baseURI= ConfigReader.readProperty("baseUrl");
        RestAssured.basePath=ConfigReader.readProperty("basePath");

        Response response=RestAssured.given().accept("application/json")
                .header("Authorization",ConfigReader.readProperty("bearer_token"))
                .when().get().then().statusCode(200).log().body().extract().response();

        PJ_AppCompany deserializedResponse=response.as(PJ_AppCompany.class);

        Assertions.assertEquals(expectedMessage,deserializedResponse.getMessage());
        Assertions.assertEquals(companyName,deserializedResponse.getData().getCompany_name());
        Assertions.assertEquals(companyEmail,deserializedResponse.getData().getCompany_email());
        Assertions.assertEquals(companyPhone,deserializedResponse.getData().getCompany_phone());
    }







}
