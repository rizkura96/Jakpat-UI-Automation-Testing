package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.CreateSurvey;
import org.openqa.selenium.WebDriver;

public class CreateSurveySteps {
    private final WebDriver webDriver;
    public CreateSurveySteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("User click New Survey button")
    public void userClickNewSurveyButton() throws InterruptedException {
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setNewSurvey();
        Thread.sleep(1000);
    }

    @And("User input {string} as survey title, {string} as client title, {string} as survey description, and {string} as frequency")
    public void userInputAsSurveyTitleAsClientTitleAsSurveyDescriptionAndAsFrequency(String surveyTitle, String clientTitle, String surveyDescription, String frecuency) throws  InterruptedException {
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setSurveyTitle(surveyTitle);
        createSurvey.setClientTitle(clientTitle);
        createSurvey.setSurveyDescription(surveyDescription);
        createSurvey.setSelectFreq(frecuency);
        createSurvey.setSaveSurvey();
        Thread.sleep(1000);
    }

    @And("User input set target responden {string}")
    public void userInputSetTargetResponden(String number)throws InterruptedException {
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setSelectRandom();
        createSurvey.setInputResponden(number);
        Thread.sleep(1000);
    }

    @And("User input the questions {string}, first option {string}, second option {string}")
        public void userInputTheQuestionsOptionOption(String question, String first, String second) {
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setInputQuestion();
        createSurvey.setQuestionType();
        createSurvey.setMultiAnswer();
        createSurvey.setWriteQuestion(question);
        createSurvey.setOptions();
        createSurvey.setWriteOpsi(first);
        createSurvey.setWriteOpsi2(second);
        createSurvey.setPlus();
    }

    @And("User click Save button")
    public void userClickSaveButton() throws InterruptedException{
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setSaveSurvey2();
        Thread.sleep(1000);
    }

    @And("User click Next Billing button")
    public void userClickNextBillingButton() throws InterruptedException {
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setNextBilling();
        Thread.sleep(1000);
    }

    @Then("The page will be directed to payment page")
    public void thePageWillBeDirectedToPaymentPage() {
        CreateSurvey createSurvey = new CreateSurvey(webDriver);
        createSurvey.setVerifyBillPage();
    }
}
