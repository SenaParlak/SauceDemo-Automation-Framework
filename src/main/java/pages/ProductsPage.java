package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ElementUtils;

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
        return isDisplayed(productsTitle);
    }

    public void logout(){
        click(burgerMenuButton);
        click(logoutButton);
    }

    public void addToCart(String productName){
        String productId = ElementUtils.formatProductId(productName);
        DriverManager.getDriver().findElement(By.id("add-to-cart-" + productId)).click();
    }
    public void openCart(){
        click(shoppingCart);
    }
}
