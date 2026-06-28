package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".inventory_item_name")
    private WebElement productName;

    @FindBy(css = ".cart_item")
    private List<WebElement> cartItems;

    @FindBy(id = "checkout")
    private WebElement checkout;


    public String getProductName() {
        return getText(productName);
    }

    public void removeProduct(String productName){
        String productId = productName.toLowerCase().replace(" ", "-");
        DriverManager.getDriver().findElement(By.id("remove-" + productId)).click();
    }

    public boolean isCartEmpty(){
        return cartItems.isEmpty();
    }

    public void checkout(){
        click(checkout);
    }
}
