package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage{

    @FindBy(css=".complete-header")
    private WebElement completeHeader;

    @FindBy(id = "back-to-products")
    private WebElement backToHome;

    public String getCompleteHeader(){
        return getText(completeHeader);
    }

    public void clickBackToHome(){
        click(backToHome);
    }
}
