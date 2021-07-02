package Steps;

import Serenity.PracticeForm_Serenity;
import cucumber.api.PendingException;
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
    @When("^I filling up all the required fields$")
    public void iFillingUpAllTheRequiredFields() {
        practiceForm_serenity.enterAllFields();
    }
    @When("^I filling up the required fields only$")
    public void iFillingUpTheRequiredFieldsOnly() {
        practiceForm_serenity.enterMandatoryFields();
    }


    @Then("^The \"([^\"]*)\" \"([^\"]*)\" should show$")
    public void theShouldShow(String arg0, String arg1) throws Throwable {
        Assert.assertEquals(practiceForm_serenity.getMessage(),arg0);
//        throw new PendingException();
    }

    @When("^I filling up firstname and mandatory fields only$")
    public void iFillingUpFirstnameAndMandatoryFieldsOnly() {
        practiceForm_serenity.enterFirstnameOnly();

    }
    @When("^I adding numbers or special characters instead of string in the full name text field\\.$")
    public void iAddingNumbersOrSpecialCharactersInsteadOfStringInTheFullNameTextField() {
        practiceForm_serenity.enterNumberAndSpecialInFullname();
    }

    @When("^I filling up random string instead of real email$")
    public void iFillingUpRandomStringInsteadOfRealEmail() {
        practiceForm_serenity.enterInvalidEmail();
    }

    @When("^I filling up all the required fields but not check the gender field$")
    public void iFillingUpAllTheRequiredFieldsButNotCheckTheGenderField() {
        practiceForm_serenity.uncheckGender();
    }
}
