package Steps;

import Serenity.PracticeForm_Serenity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class PracticeFormSteps extends PageObject {
    @Steps
    PracticeForm_Serenity practiceForm_serenity;
    @Given("^I want open the registration form page$")
    public void openTheRegistrationFormPage() {
        practiceForm_serenity.OpenHomePage();
    }
    @When("^I click the submit button$")
    public void clickTheSubmitButton() {
        practiceForm_serenity.ClickSubmit();
    }
    @Then("^The \"([^\"]*)\" \"([^\"]*)\" should not show$")
    public void theShouldNotShow(String arg0, String arg1) throws Throwable {
                Assert.assertEquals(practiceForm_serenity.getMessage(),arg0);
        //        throw new PendingException();
    }
    @When("^I filling up the required fields only$")
    public void iFillingUpTheRequiredFieldsOnly() {
        practiceForm_serenity.enterMandatoryFields();
    }
}
