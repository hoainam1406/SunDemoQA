package Serenity;

import Pages.PracticePage;
import net.thucydides.core.steps.ScenarioSteps;

public class PracticeForm_Serenity extends ScenarioSteps {
    PracticePage practicePage;
    public void enter(){
        practicePage.enterfirstname();
    }
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
        practicePage.enterfirstname();
        practicePage.enterlastname();
        practicePage.checkGender();
        practicePage.entermobile();
    }
    public void enterAllFields(){
        practicePage.enterfirstname();
        practicePage.enterlastname();
        practicePage.enteremail();
        practicePage.checkGender();
        practicePage.entermobile();
        practicePage.enterDayOfBirth();
//        practicePage.enterSubject();
        practicePage.checkHobbies();
        practicePage.enterCurrentAddress();
//        practicePage.selectState();
//        practicePage.selectCity();
    }
    public void enterFirstnameOnly(){
        practicePage.enterfirstname();
        practicePage.checkGender();
        practicePage.entermobile();
    }
    public void enterNumberAndSpecialInFullname(){
        practicePage.enterinvalidfirstname();
        practicePage.enterivalidlastname();
        practicePage.checkGender();
        practicePage.entermobile();
    }
    public void enterInvalidEmail(){
        practicePage.enterfirstname();
        practicePage.enterlastname();
        practicePage.enterivalidemail();
        practicePage.checkGender();
        practicePage.entermobile();
    }
    public void uncheckGender(){
        practicePage.enterfirstname();
        practicePage.enterlastname();
        practicePage.enteremail();
        practicePage.entermobile();
    }




}
