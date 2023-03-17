package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepdefinition {
    @When("^i click on sign in$")
    public void i_click_on_sign_in() throws Throwable {
        throw new Exception("cliking oin sign in button is not found");
    }

    @Then("^home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        throw new Exception("home page is not displayed");
    }

    @And("^i entered email as '(.+)' and password as'(.+)'$")
    public void i_entered_email_as_and_password_as(String email, String password) throws Throwable {
        throw new Exception("email or password textbox not found");
    }

    @And("^i clicked on sign in$")
    public void i_clicked_on_sign_in() throws Throwable {
        throw new Exception("sign in button is not found");
    }

}
