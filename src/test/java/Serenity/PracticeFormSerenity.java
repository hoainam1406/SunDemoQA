package Serenity;

import Pages.PracticePage;
import UI.PracticeFormUI;
import net.thucydides.core.steps.ScenarioSteps;

public class PracticeFormSerenity extends ScenarioSteps {
    PracticePage practicePage;
    PracticeFormUI practiceFormUi;
    public void OpenHomePage(){
        practicePage.open();
    }
    public void ClickSubmit(){
        practicePage.clickSubmitButton();
    }
    public String getMessage(){
        return practicePage.getMessage();
    }
    public void enterMandatoryFields(){
        practicePage.enterFirstname();
        practicePage.enterLastname();
        practicePage.checkGender();
        practicePage.enterMobile();
    }
    public void enterAllFields(){
        practicePage.enterFirstname();
        practicePage.enterLastname();
        practicePage.enterEmail();
        practicePage.checkGender();
        practicePage.enterMobile();
        practicePage.enterDayOfBirth();
        practicePage.checkHobbies();
        practicePage.enterCurrentAddress();
    }

    public void enterMandatoryFieldsWithoutFirstname(){
        practicePage.enterLastname();
        practicePage.checkGender();
        practicePage.enterMobile();
    }
    public void enterMandatoryFieldsWithoutLastname(){
        practicePage.enterFirstname();
        practicePage.checkGender();
        practicePage.enterMobile();
    }
    public void enterNumberAndSpecialInFullname(){
        practicePage.enterInvalidFirstname();
        practicePage.enterInvalidLastname();
    }
    public void enterInvalidEmail1(){
        practicePage.enterInvalidEmail1();
    }
    public void enterInvalidEmail2(){
        practicePage.enterInvalidEmail2();
    }
    public void enterInvalidEmail3(){
        practicePage.enterInvalidEmail3();
    }
    public String colorCodeOfFirstNameBorder(){
        String colorCode= practiceFormUi.firstname.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String colorCodeOfLastNameBorder(){
        String colorCode= practiceFormUi.lastname.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String colorCodeOfEmailBorder(){
        String colorCode= practiceFormUi.email.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String colorCodeOfMobileNumberBorder(){
        String colorCode= practiceFormUi.mobile.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String colorCodeOfGender(){
        String colorCode= practiceFormUi.gendermale.getCssValue("color");
        return colorCode;
    }
    public String expectedColorCodeWhenFalse(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }
    public String expectedColorCodeWhenTrue(){
        String expectedColorCodeInRGB= "rgba(40, 167, 69, 1)";
        return expectedColorCodeInRGB;
    }




}
