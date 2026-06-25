package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement productsTitle;

    public boolean isProductsTitleDisplayed() {
        return productsTitle.isDisplayed();
    }
}
