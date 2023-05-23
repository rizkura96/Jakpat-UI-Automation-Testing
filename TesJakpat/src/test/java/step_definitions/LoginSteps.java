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

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User already on login page")
    public void userAlreadyOnLoginPage() {
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
    public void userClikSignInButton()throws InterruptedException {
        Login login = new Login(webDriver);
        login.setSignIn();
        Thread.sleep(3000);
    }

    @Then("The page will be directed to main page of Jakpat")
    public void thePageWillBeDirectedToMainPageOfJakpat() {
        Login login = new Login(webDriver);
        Assert.assertTrue(login.setSuccessLogin());
    }
}
