package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CartPage;
import pages.ProductsPage;

public class AddToCartSteps {

    private final ProductsPage productsPage =  new ProductsPage();
    private final CartPage cartPage = new CartPage();

    @When("User adds product to the cart")
    public void userAddsProductToTheCart() {

        productsPage.addToCart("Sauce Labs Fleece Jacket");

    }

    @Then("The product should be successfully added.")
    public void theProductShouldBeSuccessfullyAdded() throws InterruptedException {

        productsPage.openCart();

        String expectedProduct = "Sauce Labs Fleece Jacket";
        Assert.assertEquals(cartPage.getProductName(), expectedProduct);

    }
}
