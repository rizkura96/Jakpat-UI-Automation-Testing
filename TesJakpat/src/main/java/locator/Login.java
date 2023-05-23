package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public static WebDriver driver;

    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
        Login.driver = driver;
    }

    @FindBy(xpath = "//input[@name='member[username]']")
    private WebElement username;
    public void setUserName(String uName){
        username.sendKeys(uName);
    }

    @FindBy(xpath = "//input[@name='member[password]']")
    private WebElement password;
    public void setPassword(String pWord){
        password.sendKeys(pWord);
    }

    @FindBy(xpath = "//button[@id='login-button']")
    private WebElement signIn;
    public void setSignIn(){
        signIn.click();
    }

    @FindBy(xpath = "//img[@src='https://jakpat.net/bracket/css/images/minilogo.png']")
    private WebElement successLogin;
    public boolean setSuccessLogin() {
        successLogin.isDisplayed();
        return true;
    }


}

