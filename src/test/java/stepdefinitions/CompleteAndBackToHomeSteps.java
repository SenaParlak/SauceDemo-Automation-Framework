package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import pages.CompletePage;

public class CompleteAndBackToHomeSteps {

    private final CompletePage completePage =  new CompletePage();

    @And("User click to back to home button")
    public void userClickToBackToHomeButton() {

        completePage.clickBackToHome();

    }
}
