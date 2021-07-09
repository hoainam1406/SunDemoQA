package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PracticeFormUI extends PageObject {
    @FindBy(xpath = "//button[@id='submit']")
    public WebElementFacade button;
    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElementFacade message;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElementFacade firstname;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElementFacade lastname;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElementFacade email;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    public WebElementFacade gendermale;
    @FindBy(xpath = "//label[contains(text(),'Female')]")
    public WebElementFacade genderfemale;
    @FindBy(xpath = "//label[contains(text(),'Other')]")
    public WebElementFacade genderother;
    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElementFacade mobile;
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElementFacade dateofbirth;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
    public WebElementFacade subjects;
    @FindBy(xpath = "//label[contains(text(),'Sports')]")
    public WebElementFacade hobbiesprots;
    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    public WebElementFacade hobbiereading;
    @FindBy(xpath = "//label[contains(text(),'Music')]")
    public WebElementFacade hobbiemusic;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElementFacade currentaddress;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]")
    public WebElementFacade state;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]")
    public WebElementFacade city;
}
