package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Login;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on login page")
    public void userAlreadyOnLoginPage() throws InterruptedException {
        Login login = new Login(webDriver);
        login.setDropDown();
        Thread.sleep(1000);
        login.setLoginButton();
        Thread.sleep(1000);
        Assert.assertTrue(login.verifyLoginPage());
    }

    @When("User input {string} as username and {string} as password")
    public void userInputAsUsernameAndAsPassword(String username, String password) throws InterruptedException {
        Login login = new Login(webDriver);
        login.setUserName(username);
        Thread.sleep(1000);
        login.setPassword(password);
        Thread.sleep(1000);
    }

    @And("User clik Sign In button")
    public void userClikSignInButton() throws InterruptedException {
        Login login = new Login(webDriver);
        login.setSignIn();
        Thread.sleep(3000);
    }

    @Then("The page will be directed to main page of Jakpat")
    public void thePageWillBeDirectedToMainPageOfJakpat() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setVerifySuccessLogin());
    }


    @Then("User failed login and a login failure pop up {string} will appear")
    public void userFailedLoginAndALoginFailurePopUpWillAppear(String errorText) {
        Login login = new Login(webDriver);
        Assert.assertEquals(errorText,login.setVerifyFailedLogin());
    }

    @Then("User failed login and a login failure pop up will appear")
    public void userFailedLoginAndALoginFailurePopUpWillAppear() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setVerifyFailedLogin2());
    }
}
