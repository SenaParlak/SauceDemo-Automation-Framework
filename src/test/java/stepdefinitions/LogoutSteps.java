package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;

public class LogoutSteps {

    private final ProductsPage productsPage = new ProductsPage();
    private final LoginPage loginPage = new LoginPage();

    @When("User click to hamburger menu and logout button")
    public void userClickToHamburgerMenuAndLogoutButton() {

        productsPage.logout();

    }

    @Then("User should see the login page")
    public void userShouldSeeTheLoginPage() {

        Assert.assertTrue(loginPage.loginPageDisplayed());

    }
}
