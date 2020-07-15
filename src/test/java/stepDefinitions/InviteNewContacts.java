package stepDefinitions;

import com.google.inject.Inject;
import configs.User;
import cucumber.api.java.en.*;
import objects.components.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InviteNewContacts {
    @Inject
    private WebDriver webDriver;

    @Given("Launch chrome browser to invite a new contact")
    public void launch_chrome_browser_to_invite_a_new_contact() {
        System.setProperty("webdriver.chrome.driver", "C://WebDriver//bin//chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @When("Open Fileinvite app to invite a new contact")
    public void open_Fileinvite_app_to_invite_a_new_contact() throws InterruptedException {
        webDriver.get("https://app.fileinvite.com/login");
        Thread.sleep(1000);
    }

    @When("Enter login details to invite new contact")
    public void enter_login_details_to_invite_new_contact() throws InterruptedException {
        LoginForm loginForm = new LoginForm(webDriver);
        loginForm.enterLoginDetails(User.NORMAL_USER);
        loginForm.clickSignin();
        Thread.sleep(1000);
    }

    @When("Click the Create New Invite button for new contact")
    public void click_the_Create_New_Invite_button_for_new_contact() throws InterruptedException {
        Dashboard dashboard = new Dashboard(webDriver);
        dashboard.clickCreateNewInvite();
        Thread.sleep(1000);
    }

    @When("Enter new invite details due today for new contact")
    public void enter_new_invite_details_due_today_for_new_contact() throws InterruptedException {
        EditInvite editInvite = new EditInvite(webDriver);
        editInvite.enterInviteSubj();
        editInvite.clickDueDate();
        Thread.sleep(1000);
        editInvite.pickDueDate();
        editInvite.enterMessageToContact();
        editInvite.clickCreateContact();
    }

    @When("Create new contact")
    public void create_new_contact() {
        String Parentwindow = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles())
        {
            webDriver.switchTo().window(winHandle);
        }

        CreateContactPopup createContactPopup = new CreateContactPopup(webDriver);
        createContactPopup.enterNewContactFirstName();
        createContactPopup.enterNewContactLastName();
        createContactPopup.enterNewContactEmail();
        createContactPopup.enterNewContactMobile();
        createContactPopup.enterNewContactSMS();
        createContactPopup.clickNewContactCreate();

        webDriver.switchTo().window(Parentwindow);
    }

    @When("Create new request without attachment for new contact")
    public void create_new_request_without_attachment_for_new_contact() throws InterruptedException {
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

    @Then("Review and send invite for new contact")
    public void review_and_send_invite_for_new_contact() throws InterruptedException {
        SendInvite sendInvite = new SendInvite(webDriver);
        sendInvite.clickSendInvite();
        Thread.sleep(5000);
    }

    @Then("View sent invite for new contact")
    public void view_sent_invite_for_new_contact() throws InterruptedException {
        ViewInvite viewInvite = new ViewInvite(webDriver);
        viewInvite.clickViewInvite();
        Thread.sleep(1000);
    }

    @Then("Logout from the Main App after new contact invite")
    public void logout_from_the_Main_App_after_new_contact_invite() throws InterruptedException {
        InviteOverview inviteOverview = new InviteOverview(webDriver);
        inviteOverview.hoverUserProfile();
        Thread.sleep(1000);
        inviteOverview.clickLogout();
        webDriver.close();
    }
}
