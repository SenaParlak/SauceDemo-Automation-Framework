package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;

public class InvalidUserLoginSteps {

    private final LoginPage loginPage = new LoginPage();

    @When("User logs in with invalid credentials")
    public void userLogsInWithInvalidCredentials() {

        loginPage.login(
                ConfigurationReader.getProperty("invalidusername"),
                ConfigurationReader.getProperty("invalidpassword"));
    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage(){

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }
}
