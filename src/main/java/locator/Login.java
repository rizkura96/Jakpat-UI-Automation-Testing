package locator;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//button[@class='navbar-toggle btn-menu']")
    private WebElement dropDown;
    public void setDropDown(){
        dropDown.click();
    }

    @FindBy(xpath = "//a[.='Login']")
    private WebElement loginButton;
    public void setLoginButton(){
        loginButton.click();
    }
    public boolean verifyLoginPage(){
        username.isDisplayed();
        return true;
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
    private WebElement verifySuccessLogin;
    public boolean setVerifySuccessLogin() {
        verifySuccessLogin.isDisplayed();
        return true;
    }

//    @FindBy(css = ".alert")
//    private WebElement verifyFailedLogin;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement verifyFailedLogin;
    public String setVerifyFailedLogin(){
        return verifyFailedLogin.getText();
    }

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement verifyFailedLogin2;
    public boolean setVerifyFailedLogin2(){
        return verifyFailedLogin2.isDisplayed();
    }




}

