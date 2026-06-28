package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement checkoutTitle;

    public String getCheckoutTitle() {
        return checkoutTitle.getText();
    }
}
