package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{

    @FindBy(css = ".title")
    private WebElement overviewTitle;

    public String getOverviewTitle(){
        return overviewTitle.getText();
    }
}
