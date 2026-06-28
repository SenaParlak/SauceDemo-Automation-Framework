package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutSteps {

    private final CartPage cartPage = new CartPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();

    @And("User click to checkout button")
    public void userClickToCheckoutButton() {

        cartPage.checkout();

    }

    @Then("User should see checkout information page")
    public void userShouldSeeCheckoutInformationPage() {

        Assert.assertEquals(checkoutPage.getCheckoutTitle(), "Checkout: Your Information");

    }
}
