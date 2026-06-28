package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CompletePage;
import pages.OverviewPage;

public class CheckoutCompleteSteps {

    private final OverviewPage overviewPage = new OverviewPage();
    private final CompletePage completePage = new CompletePage();

    @And("User click to finish button")
    public void userClickToFinishButton() {

        overviewPage.clickFinishButton();

    }

    @Then("User should see the checkout complete page")
    public void userShouldSeeTheCheckoutCompletePage() {

        Assert.assertEquals(completePage.getCompleteHeader(), "Thank you for your order!");

    }
}
