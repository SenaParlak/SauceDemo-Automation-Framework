package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CheckoutPage;
import pages.OverviewPage;

public class CheckoutInformationSteps {

    private final CheckoutPage checkoutPage =  new CheckoutPage();
    private final OverviewPage overviewPage = new OverviewPage();

    @And("User enter checkout information with {string}, {string} and {string}")
    public void userEnterCheckoutInformationWithAnd(String firstName, String lastName, String postalCode) throws InterruptedException {

        checkoutPage.enterCheckoutInformation(firstName, lastName, postalCode);

    }

    @Then("User should see the checkout overview page")
    public void userShouldSeeTheCheckoutOverviewPage() throws InterruptedException {

        Assert.assertEquals(overviewPage.getOverviewTitle(), "Checkout: Overview");

    }
}
