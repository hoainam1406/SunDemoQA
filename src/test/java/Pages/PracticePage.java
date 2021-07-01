package Pages;

import UI.PracticeForm_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticePage extends PageObject{
    PracticeForm_UI practiceForm_ui;
    public void clickSubmitButton(){
        evaluateJavascript("document.querySelector('#submit').click()");
    }
    public void enterfirstname(){
        practiceForm_ui.firstname.sendKeys("Nam");
    }
    public void enterlastname(){
        practiceForm_ui.lastname.sendKeys("Hoài");
    }
    public void entermobile(){
        practiceForm_ui.mobile.sendKeys("0123456789");
    }
    public String getMessage(){
        return practiceForm_ui.message.getText();
    }
    public void checkGender(){
        practiceForm_ui.gendermale.click();
    }

}

