package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CartPage;
import pages.ProductsPage;

public class AddToCartWithOutlineSteps {

    private final ProductsPage productsPage =  new ProductsPage();
    private final CartPage cartPage = new CartPage();

    @When("User adds {string} to the cart")
    public void userAddsToTheCart(String product) {

        productsPage.addToCart(product);

    }

    @Then("The {string} should be successfully added.")
    public void theShouldBeSuccessfullyAdded(String product) {

        productsPage.openCart();
        Assert.assertEquals(cartPage.getProductName(),  product);

    }
}
