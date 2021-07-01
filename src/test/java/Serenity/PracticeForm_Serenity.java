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

}
