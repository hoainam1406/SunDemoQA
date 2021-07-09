package Steps;

import Serenity.PracticeFormSerenity;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class PracticeFormSteps extends PageObject {

    @Steps
    PracticeFormSerenity practiceFormSerenity;

    @Given("^I want open the registration form page$")
    public void openTheRegistrationFormPage() {
        practiceFormSerenity.OpenHomePage();
    }

    @When("^I click the submit button$")
    public void clickTheSubmitButton() {
        practiceFormSerenity.ClickSubmit();
    }

    @Then("^Mandatory fields should show the red border  and 'Thanks for submitting the form' should not show$")
    public void mandatoryFieldsShouldShowTheRedBorderAndThanksForSubmittingTheFormShouldNotShow() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfFirstNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfLastNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfGender());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfMobileNumberBorder());
    }

    @When("^I filling up all the required fields$")
    public void iFillingUpAllTheRequiredFields() {
        practiceFormSerenity.enterAllFields();
    }

    @Then("^The \"([^\"]*)\" 'Thanks for submitting the form' should show$")
    public void theThanksForSubmittingTheFormShouldShow(String message) throws Throwable {
        Assert.assertEquals(practiceFormSerenity.getMessage(), message);
    }

    @When("^I filling up the required fields only$")
    public void iFillingUpTheRequiredFieldsOnly() {
        practiceFormSerenity.enterMandatoryFields();
    }

    @When("^I filling up mandatory fields without firstname field$")
    public void iFillingUpMandatoryFieldsWithoutFirstnameField() {
        practiceFormSerenity.enterMandatoryFieldsWithoutFirstname();
    }

    @Then("^Firstname field should show the red borde and other mandatory fields should not show the green border$")
    public void firstnameFieldShouldShowTheRedBorderAndOtherMandatoryFieldsShouldNotShowTheGreenBorder() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfFirstNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfLastNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfGender());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfMobileNumberBorder());
    }

    @When("^I filling up mandatory fields without lastname field$")
    public void iFillingUpMandatoryFieldsWithoutLastnameField() {
        practiceFormSerenity.enterMandatoryFieldsWithoutLastname();
    }

    @Then("^Lastname field should show the red border  and other mandatory fields should not show the green border$")
    public void lastnameFieldShouldShowTheRedBorderAndOtherMandatoryFieldsShouldNotShowTheGreenBorder() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfLastNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfFirstNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfGender());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfMobileNumberBorder());
    }

    @When("^I adding numbers or special characters instead of string in the full name text field\\.$")
    public void iAddingNumbersOrSpecialCharactersInsteadOfStringInTheFullNameTextField() {
        practiceFormSerenity.enterNumberAndSpecialInFullname();
    }
    @Then("^Lastname and Firstname fields should show the red border$")
    public void lastnameAndFirstnameFieldsShouldShowTheRedBorder() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfFirstNameBorder());
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfLastNameBorder());
    }
    @When("^I not filling up any data into email field$")
    public void iNotFillingUpAnyDataIntoEmail() {
    }
    @Then("^Email field should show the green border$")
    public void emailFieldShouldShowTheGreenBorder() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenTrue(), practiceFormSerenity.colorCodeOfEmailBorder());
    }
    @When("^I filling up random string instead of real email$")
    public void iFillingUpRandomStringInsteadOfRealEmail() {
        practiceFormSerenity.enterInvalidEmail1();
    }
    @Then("^Email field should show the red border$")
    public void emailFieldShouldShowTheRedBorder() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfEmailBorder());
    }
    @When("^I filling up wrong format instead of real email$")
    public void iFillingUpWrongFormatInsteadOfRealEmail() {
        practiceFormSerenity.enterInvalidEmail2();
    }
    @When("^I filling up email field have blankspace$")
    public void iFillingUpEmailFieldHaveBlankspace() {
        practiceFormSerenity.enterInvalidEmail3();
    }
    @When("^I not checking any data into gender field$")
    public void iNotCheckingAnyDataIntoGenderField() {
    }

    @Then("^Gender field should show the red border$")
    public void genderFieldShouldShowTheRedBorder() {
        Assert.assertEquals(practiceFormSerenity.expectedColorCodeWhenFalse(), practiceFormSerenity.colorCodeOfGender());
    }

}

