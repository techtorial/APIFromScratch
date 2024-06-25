package api.qa.Techtorial.stepdefinitions;

import api.qa.Techtorial.endpoints.EP_AppLogin;
import io.cucumber.java.en.Then;

public class SD_AppLogin {

    EP_AppLogin epAppLogin = new EP_AppLogin();

    @Then("User calls Login End-point and validates {string},{string}")
    public void user_calls_login_end_point_and_validates(String message, String username) {
        epAppLogin.validateLoginInformation(message, username);
    }
}
