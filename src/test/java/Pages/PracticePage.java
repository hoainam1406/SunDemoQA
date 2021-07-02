package Pages;

import UI.PracticeForm_UI;
import cucumber.api.java.eo.Se;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

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
    public void enterinvalidfirstname(){
        practiceForm_ui.firstname.sendKeys("123456");
    }
    public void enterivalidlastname(){
        practiceForm_ui.lastname.sendKeys("abc@");
    }
    public void enteremail(){
        practiceForm_ui.email.sendKeys("nam@abc.com");
    }
    public void enterivalidemail(){
        practiceForm_ui.email.sendKeys("1213565465465");
    }
    public void entermobile(){
        practiceForm_ui.mobile.sendKeys("0123456789");
    }
    public void checkGender(){
        practiceForm_ui.gendermale.click();
    }
    public void enterDayOfBirth(){
        practiceForm_ui.dateofbirth.sendKeys("14 Jun 1999");
    }
    public void enterSubject(){
        practiceForm_ui.subjects.sendKeys("Maths",Keys.ENTER);
    }
    public void checkHobbies(){
        practiceForm_ui.hobbiesprots.click();
    }
    public void enterCurrentAddress(){
        practiceForm_ui.currentaddress.sendKeys("29 Xuan Dieu");
    }
    public void selectState(){
        practiceForm_ui.state.sendKeys("NCR");
    }
    public void selectCity(){
        practiceForm_ui.city.sendKeys("Delhi");
    }
    public String getMessage(){
        return practiceForm_ui.message.getText();
    }
}

