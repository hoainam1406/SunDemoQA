package Pages;


import UI.TextBox_UI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {
    TextBox_UI textBox_ui;
    public String getUserName() {
        return textBox_ui.userName.getTextValue();
    }

    public String getEmail() {
        return textBox_ui.email.getTextValue();
    }
    public String getCurrentAddress() {
        return textBox_ui.currentAddress.getValue();
    }
    public String getPermanentAddress() {
        return textBox_ui.permanentAddress.getValue();
    }
    public void inputData() {
        textBox_ui.userName.sendKeys("MyKieu");
        textBox_ui.email.sendKeys("kieu@gmail.com");
        textBox_ui.currentAddress.sendKeys("DaNang");
        textBox_ui.permanentAddress.sendKeys("QuangNam");
    }
    public void emailError(){
        textBox_ui.userName.sendKeys("MyKieu");
        textBox_ui. currentAddress.sendKeys("DaNang");
        textBox_ui.permanentAddress.sendKeys("QuangNam");
        textBox_ui.email.sendKeys("kieu");
        if(textBox_ui.userEmail.containsElements("@")) {
            System.out.println("Test not passed");
        }else {
            System.out.println("Test passed");
        }
    }
    public void fullNameBlank(){
        textBox_ui.email.sendKeys("kieu@gmail.com");
        textBox_ui.currentAddress.sendKeys("DaNang");
        textBox_ui.permanentAddress.sendKeys("QuangNam");

    }
    public void  clickSubmit() {
        evaluateJavascript("document.querySelector('#submit').click()");
    }
}
