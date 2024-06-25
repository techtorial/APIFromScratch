package api.qa.Techtorial.stepdefinitions;

import api.qa.Techtorial.endpoints.EP_AppCompany;
import io.cucumber.java.en.Then;

public class SD_AppCompany {

   EP_AppCompany epAppCompany=new EP_AppCompany();

    @Then("User calls company endpoint and validates {string},{string},{string},{string}")
    public void user_calls_company_endpoint_and_validates(String message, String name, String email, String phone) {

        epAppCompany.validateCompanyInformation(message,name,email,phone);

    }


}
