package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("user navigate login page of the application")
    public void userNavigateLoginPageOfTheApplication() {
        System.out.println("Login application");
    }

    @And("user enter invalid {string} in user text box")
    public void userEnterInvalidInUserTextBox(String username) {
        System.out.println("user name"+username);
    }

    @And("user enter valid {string} in password text box")
    public void userEnterValidInPasswordTextBox(String password) {
        System.out.println("Password"+password);
    }

    @When("user click on submit button")
    public void userClickOnSubmitButton() {
        System.out.println("Click on Submit button");
    }

    @Then("user redirect to user dashboard")
    public void userRedirectToUserDashboard() {
    }
}
