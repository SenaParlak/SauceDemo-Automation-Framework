package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{

    @FindBy(css = ".title")
    private WebElement overviewTitle;

    @FindBy(id = "finish")
    private WebElement finishButton;

    public String getOverviewTitle(){
        return getText(overviewTitle);
    }

    public void clickFinishButton(){
        click(finishButton);
    }
}
