package stepdefinitions;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigurationReader;


public class SuccessLoginSteps {

    private final LoginPage loginPage = new LoginPage();
    private final ProductsPage productsPage = new ProductsPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

        DriverManager.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {

        loginPage.login(
                ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password")
        );

    }

    @Then("User should see the Products page")
    public void userShouldSeeTheProductsPage() throws InterruptedException {

        Assert.assertTrue(productsPage.isProductsTitleDisplayed());

    }
}
