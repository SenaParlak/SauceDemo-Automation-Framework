package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement productsTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public boolean isProductsTitleDisplayed() {
        return productsTitle.isDisplayed();
    }

    public void logout(){
        burgerMenuButton.click();
        logoutButton.click();
    }
}
