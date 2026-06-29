package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CheckoutPage;

public class CheckoutInformationValidationSteps {

    private final CheckoutPage checkoutPage =  new CheckoutPage();

    @Then("User should see {string}")
    public void userShouldSee(String errorMessage) {

        Assert.assertEquals(checkoutPage.getErrorMessage(), errorMessage);

    }
}
