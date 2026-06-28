package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;
import pages.ProductsPage;

public class RemoveProductWithOutlineSteps {

    private final ProductsPage productsPage =  new ProductsPage();
    private final CartPage cartPage = new CartPage();

    @And("User open the shopping cart")
    public void userOpenTheShoppingCart() {

        productsPage.openCart();

    }

    @And("User removes {string} from the cart")
    public void userRemovesFromTheCart(String product) {

        cartPage.removeProduct(product);

    }

    @Then("The cart should be empty")
    public void theCartShouldBeEmpty() {

        Assert.assertTrue(cartPage.isCartEmpty(), "Cart boş değil");
    }
}
