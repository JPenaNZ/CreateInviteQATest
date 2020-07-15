package stepDefinitions;

import com.google.inject.Inject;
import configs.User;
import cucumber.api.java.en.*;
import objects.components.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InviteExistingContactsSteps {
    @Inject
    private WebDriver webDriver;

    @Given("Launch chrome browser to invite existing contact")
    public void launch_chrome_browser_to_invite_existing_contact() {
        System.setProperty("webdriver.chrome.driver", "C://WebDriver//bin//chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @When("Open Fileinvite app to invite existing contact")
    public void open_Fileinvite_app_to_invite_existing_contact() throws InterruptedException {
        webDriver.get("https://app.fileinvite.com/login");
        Thread.sleep(1000);
    }

    @When("Enter login details to invite existing contact")
    public void enter_login_details_to_invite_existing_contact() throws InterruptedException {
        LoginForm loginForm = new LoginForm(webDriver);
        loginForm.enterLoginDetails(User.NORMAL_USER);
        loginForm.clickSignin();
        Thread.sleep(1000);
    }

    @When("Click the Create New Invite button to invite existing contact")
    public void click_the_Create_New_Invite_button_to_invite_existing_contact() throws InterruptedException {
        Dashboard dashboard = new Dashboard(webDriver);
        dashboard.clickCreateNewInvite();
        Thread.sleep(1000);
    }

    @When("Enter new invite details for existing contact due today")
    public void enter_new_invite_details_for_existing_contact_due_today() throws InterruptedException {
        EditInvite editInvite = new EditInvite(webDriver);
        editInvite.enterInviteSubj();
        editInvite.clickDueDate();
        Thread.sleep(1000);
        editInvite.pickDueDate();
        editInvite.searchExistingContact();
        Thread.sleep(10000);
        editInvite.getFirstContact();
        Thread.sleep(1000);
        editInvite.enterMessageToContact();
    }

    @When("Enter new invite details for existing contact not due today")
    public void enter_new_invite_details_for_existing_contact_not_due_today() throws InterruptedException {
        EditInvite editInvite = new EditInvite(webDriver);
        editInvite.enterInviteSubj();
        editInvite.clickDueDate();
        Thread.sleep(1000);
        editInvite.pickNDueDate();
        editInvite.searchExistingContact();
        Thread.sleep(10000);
        editInvite.getFirstContact();
        Thread.sleep(1000);
        editInvite.enterMessageToContact();
    }

    @When("Enter new invite details for existing contacts")
    public void enter_new_invite_details_for_existing_contacts() throws InterruptedException {
        EditInvite editInvite = new EditInvite(webDriver);
        editInvite.enterInviteSubj();
        editInvite.clickDueDate();
        Thread.sleep(1000);
        editInvite.pickNDueDate();
        editInvite.searchExistingContact();
        Thread.sleep(10000);
        editInvite.getFirstContact();
        Thread.sleep(1000);
        editInvite.searchExistingContact();
        Thread.sleep(10000);
        editInvite.getSecondContact();
        Thread.sleep(1000);
        editInvite.enterMessageToContact();
    }

    @When("Create new request without attachment for existing contact")
    public void create_new_request_without_attachment_for_existing_contact() throws InterruptedException {
        EditInvite editInvite = new EditInvite(webDriver);
        editInvite.enterRequestTitle();
        editInvite.enterRequestDesc();
        editInvite.clickCreateRequest();
        Thread.sleep(10000);

        Boolean createRequest = webDriver.findElement(By.xpath("//*[@id=\"request-list\"]/div")).isDisplayed();
        Assert.assertEquals(true,createRequest);

        editInvite.clickReviewInvite();
        Thread.sleep(10000);
    }

    @When("Create new request with attachment for existing contact")
    public void create_new_request_with_attachment_for_existing_contact() throws InterruptedException {
        EditInvite editInvite = new EditInvite(webDriver);
        editInvite.enterRequestTitle();
        editInvite.enterRequestDesc();
        editInvite.clickCreateRequest();
        Thread.sleep(10000);

        Boolean createRequest = webDriver.findElement(By.xpath("//*[@id=\"request-list\"]/div")).isDisplayed();
        Assert.assertEquals(true,createRequest);

        editInvite.clickUploadFile();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webDriver.switchTo().activeElement().sendKeys("C:\\Temp\\sample.txt");

        editInvite.clickReviewInvite();
        Thread.sleep(10000);
    }

    @Then("Review and send invite for existing contact")
    public void review_and_send_invite_for_existing_contact() throws InterruptedException {
        SendInvite sendInvite = new SendInvite(webDriver);
        sendInvite.clickSendInvite();
        Thread.sleep(5000);
    }

    @Then("View sent invite for existing contact")
    public void view_sent_invite_for_existing_contact() throws InterruptedException {
        ViewInvite viewInvite = new ViewInvite(webDriver);
        viewInvite.clickViewInvite();
        Thread.sleep(1000);
    }

    @Then("Logout from the Main App after existing contact invite")
    public void logout_from_the_Main_App_after_existing_contact_invite() throws InterruptedException {
        InviteOverview inviteOverview = new InviteOverview(webDriver);
        inviteOverview.hoverUserProfile();
        Thread.sleep(1000);
        inviteOverview.clickLogout();
        webDriver.close();
    }
}
