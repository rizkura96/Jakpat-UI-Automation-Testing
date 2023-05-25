package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateSurvey {
    public static WebDriver driver;

    public CreateSurvey(WebDriver driver) {
        PageFactory.initElements(driver, this);
        CreateSurvey.driver = driver;
    }

    @FindBy(xpath = "//a[contains(.,'New Survey')]")
    private WebElement newSurvey;
    public void setNewSurvey(){
        newSurvey.click();
    }

    @FindBy(xpath = "//input[@id='survey[title]']")
    private WebElement surveyTitle;
    public void setSurveyTitle(String sTitle){
        surveyTitle.sendKeys(sTitle);
    }

    @FindBy(xpath = "//input[@id='survey[client_title]']")
    private WebElement clientTitle;
    public void setClientTitle(String cTitle){
        clientTitle.sendKeys(cTitle);
    }

    @FindBy(xpath = "//textarea[@id='survey[info]']")
    private WebElement surveyDescription;
    public void setSurveyDescription(String sDescription){
        surveyDescription.sendKeys(sDescription);
    }

    @FindBy(xpath = "//select[@id='survey[frequency_type]']")
    private WebElement selectFreq;
    public void setSelectFreq(String text){
        Select frequency = new Select(selectFreq);
        frequency.selectByVisibleText(text);
    }

    @FindBy(xpath = "//button[contains(.,'Save')]")
    private WebElement saveSurvey;
    public void setSaveSurvey(){
        saveSurvey.click();
    }

    @FindBy(xpath = "//i[@class='fa fa-check-square-o ng-scope']")
    private WebElement selectRandom;
    public void setSelectRandom(){
        selectRandom.click();
    }

    @FindBy(xpath = "//input[@name='survey[personnel_limit]']")
    private WebElement inputResponden;
    public void setInputResponden(String number){
        inputResponden.sendKeys(number);
    }

    @FindBy(xpath = "//button[@class='btn btn-default btn-header-next ng-scope']")
    private WebElement inputQuestion;
    public void setInputQuestion(){
        inputQuestion.click();
    }

    @FindBy(xpath = "//div[@class='btn-group']/button[@class='btn btn-default']")
    //div[@class='btn-group open']//span[@class='hidden-xs'] //div[@class='btn-group open']/button[@class='btn btn-default']
    private WebElement questionType;
    public void setQuestionType(){
        questionType.click();
    }

    @FindBy(xpath = "//div[@class='btn-group open']//a[contains(.,'Multiple Answer')]")
    private WebElement multiAnswer;
    public void setMultiAnswer(){
        multiAnswer.click();
    }

    @FindBy(xpath = "//textarea[@class='form-control msd-elastic ng-isolate-scope ng-dirty ng-invalid ng-invalid-question[<% question . id %>][question]']")
    private WebElement writeQuestion;
    public void setWriteQuestion(String wQuestion){
        writeQuestion.sendKeys(wQuestion);
    }

    @FindBy(xpath = "//input[@class='ng-valid ng-dirty']")
    private WebElement options;
    public void setOptions(){
        options.click();
    }

    @FindBy(xpath = "//textarea[@class='form-control msd-elastic ng-isolate-scope ng-dirty ng-invalid ng-invalid-question[<% question.id %>][option][<% option.id %>][option]']")
    private WebElement writeOpsi;
    public void setWriteOpsi(String text){
        writeOpsi.sendKeys(text);
    }

    @FindBy(xpath = "//div[@class='col-sm-12 question-handle-bar question-wrapper-1684995237848c6p3z ']//li[2]//textarea[@class='form-control msd-elastic ng-isolate-scope ng-dirty ng-invalid ng-invalid-question[<% question.id %>][option][<% option.id %>][option]']")
    private WebElement writeOpsi2;
    public void setWriteOpsi2(String text2){
        writeOpsi2.sendKeys(text2);
    }

    @FindBy(xpath = "//i[@class='mfb-component__main-icon--active fa fa-minus']")
    private WebElement plus;
    public void setPlus(){
        plus.click();
    }

    @FindBy(xpath = "//i[@class='mfb-component__child-icon fa fa-save']")
    private WebElement saveSurvey2;
    public void setSaveSurvey2(){
        saveSurvey2.click();
    }

    @FindBy(xpath = "//span[.='Next : Billing']")
    private WebElement nextBilling;
    public void setNextBilling(){
        nextBilling.click();
    }

    @FindBy(xpath = "//h4[.='Question']")
    private WebElement verifyBillPage;
    public void setVerifyBillPage(){
        verifyBillPage.isDisplayed();
    }
}