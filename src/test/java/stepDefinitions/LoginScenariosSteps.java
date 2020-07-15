package stepDefinitions;

import com.google.inject.Inject;
import configs.User;
import configs.UserDummy;
import cucumber.api.java.en.*;
import objects.components.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenariosSteps {

    @Inject
    private WebDriver webDriver;

    @Given("Launch chrome browser")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://WebDriver//bin//chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @When("Open Fileinvite app")
    public void open_Fileinvite_app() throws InterruptedException {
        webDriver.get("https://app.fileinvite.com/login");
        Thread.sleep(1000);
    }

    @Then("Enter login details successfully")
    public void Enter_login_details_successfully() throws InterruptedException {
        LoginForm loginForm = new LoginForm(webDriver);
        loginForm.enterLoginDetails(User.NORMAL_USER);
        loginForm.clickSignin();
        Thread.sleep(1000);
    }

    @When("Enter dummy login details")
    public void Enter_dummy_login_details() throws InterruptedException {
        LoginForm loginForm = new LoginForm(webDriver);
        loginForm.enterLoginDetails(UserDummy.NORMAL_USER);
        loginForm.clickSignin();
        Thread.sleep(1000);
    }

    @Then("Open My profile")
    public void open_My_profile() throws InterruptedException {
        Dashboard dashboard = new Dashboard(webDriver);
        dashboard.hoverUserProfile();
        Thread.sleep(1000);
        dashboard.clickMyProfile();
        Thread.sleep(1000);
    }

    @Then("Verify login error message")
    public void verify_login_error_message() throws InterruptedException {
        boolean loginError = webDriver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/ul/li")).isDisplayed();
        Assert.assertEquals(true,loginError);
        Thread.sleep(1000);
    }

    @Then("Logout from the app")
    public void logout_from_the_app() throws InterruptedException {
        Dashboard dashboard = new Dashboard(webDriver);
        dashboard.hoverUserProfile();
        Thread.sleep(1000);
        dashboard.clickLogout();
        webDriver.close();
    }

    @Then("Close the app")
    public void close_the_app() {
        webDriver.close();
    }
}
