package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".inventory_item_name")
    private WebElement productName;

    public String getProductName() {
        return productName.getText();
    }
}
