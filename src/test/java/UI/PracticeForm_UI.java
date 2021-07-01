package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PracticeForm_UI extends PageObject {
    @FindBy(xpath = "//button[@id='submit']")
    public WebElementFacade button;
    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElementFacade message;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElementFacade firstname;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElementFacade lastname;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    public WebElementFacade gendermale;
    @FindBy(xpath = "//label[contains(text(),'Female')]")
    public WebElementFacade genderfemale;
    @FindBy(xpath = "//label[contains(text(),'Other')]")
    public WebElementFacade genderother;
    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElementFacade mobile;

}
