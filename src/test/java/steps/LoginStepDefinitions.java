package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("user navigate login page of the application")
    public void userNavigateLoginPageOfTheApplication() {

    }

    @And("user enter invalid {string} in user text box")
    public void userEnterInvalidInUserTextBox(String username) {
    }

    @And("user enter valid {string} in password text box")
    public void userEnterValidInPasswordTextBox(String password) {
    }

    @When("user click on submit button")
    public void userClickOnSubmitButton() {
    }

    @Then("user redirect to user dashboard")
    public void userRedirectToUserDashboard() {
    }
}
