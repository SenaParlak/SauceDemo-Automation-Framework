package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement productsTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;

    public boolean isProductsTitleDisplayed() {
        return productsTitle.isDisplayed();
    }

    public void logout(){
        burgerMenuButton.click();
        logoutButton.click();
    }

    public void addToCart(String productName){
        String productId =productName.toLowerCase().replace(" ", "-");
        DriverManager.getDriver().findElement(By.id("add-to-cart-" + productId)).click();
    }
    public void getShoppingCart(){
        shoppingCart.click();
    }
}
