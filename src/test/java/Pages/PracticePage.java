package Pages;

import UI.PracticeFormUI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticePage extends PageObject{
    PracticeFormUI practiceFormUi;
    public void clickSubmitButton(){
        evaluateJavascript("document.querySelector('#submit').click()");
    }
    public void enterFirstname(){
        practiceFormUi.firstname.sendKeys("Nam");
    }
    public void enterLastname(){
        practiceFormUi.lastname.sendKeys("Hoài");
    }
    public void enterInvalidFirstname(){
        practiceFormUi.firstname.sendKeys("123456");
    }
    public void enterInvalidLastname(){
        practiceFormUi.lastname.sendKeys("abc@");
    }
    public void enterEmail(){
        practiceFormUi.email.sendKeys("nam@abc.com");
    }
    public void enterInvalidEmail1(){
        practiceFormUi.email.sendKeys("1213565465465");
    }
    public void enterInvalidEmail2(){
        practiceFormUi.email.sendKeys("abc@abc");
    }
    public void enterInvalidEmail3(){
        practiceFormUi.email.sendKeys("a b@abc.com");
    }
    public void enterMobile(){
        practiceFormUi.mobile.sendKeys("0123456789");
    }
    public void checkGender(){
        practiceFormUi.gendermale.click();
    }
    public void enterDayOfBirth(){
        practiceFormUi.dateofbirth.sendKeys("14 Jun 1999");
    }
    public void enterSubject(){
        practiceFormUi.subjects.sendKeys("Maths",Keys.ENTER);
    }
    public void checkHobbies(){
        practiceFormUi.hobbiesprots.click();
    }
    public void enterCurrentAddress(){
        practiceFormUi.currentaddress.sendKeys("29 Xuan Dieu");
    }
    public String getMessage(){
        return practiceFormUi.message.getText();
    }
}

