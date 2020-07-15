package objects.components;

import com.google.inject.Inject;
import org.openqa.selenium.*;

public class EditInvite {
    private WebDriver webDriver;

    private By searchContext;

    private By createnewinviteButton = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[1]/a");

    private By userprofileButton = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/a");

    private By myprofileOption = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/ul/li/div/div[1]/a");

    private By logoutOption = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/ul/li/div/div[2]/a");

    private By invitesubjField = By.xpath("//*[@id=\"subject\"]");

    private By duedateField = By.xpath("//*[@id=\"duedate\"]");

    private By duetodaydateDatePicker = By.xpath("//*[@id=\"main-app\"]/div[4]/div[1]/table/tbody/tr[3]/td[4]");

    private By duenottodaydateDatePicker = By.xpath("//*[@id=\"main-app\"]/div[4]/div[1]/table/tbody/tr[5]/td[4]");

    private By searchcontactField = By.xpath("//*[@id=\"edit-invite-form\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div/span/input[2]");

    private By pick1contactField = By.xpath("//*[@id=\"edit-invite-form\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div/span/div/div/div[1]");

    private By pick2contactField = By.xpath("//*[@id=\"edit-invite-form\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div/span/div/div/div[2]");

    private By messagetocontactField = By.xpath("//*[@id=\"invite-message\"]");

    private By createcontactButton = By.xpath("//*[@id=\"edit-invite-form\"]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div/button");

    private By allrequestsButton = By.xpath("//*[@id=\"requests-wrapper\"]/div[2]/ul/li[1]/a");

    private By currentprofileButton = By.xpath("//*[@id=\"requests-wrapper\"]/div[2]/ul/li[2]/a");

    private By requesttitleField = By.cssSelector("#requests-wrapper > div.vtabs > div > div:nth-child(4) > div.create-request-row.m-0 > div > div:nth-child(2) > div > div > div.col-12 > input");

    private By requestdescField = By.xpath("//*[@id=\"requests-wrapper\"]/div[2]/div/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div[1]");

    private By createrequestButton = By.xpath("//*[@id=\"requests-wrapper\"]/div[2]/div/div[4]/div[2]/div/button");

    private By uploadfileButton = By.xpath("//*[@id=\"requests-wrapper\"]/div[2]/div/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[3]");

    private By reviewinviteButton = By.xpath("//*[@id=\"edit-invite-submit-btn\"]");

    @Inject
    public EditInvite(WebDriver webDriver) {
        this(webDriver, By.id("edit-invite-page"));
    }

    public EditInvite(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void clickCreateNewInvite() {
        getSearchContext().findElement(createnewinviteButton).click();
    }

    public void hoverUserProfile() { getSearchContext().findElement(userprofileButton).click(); }

    public void clickMyProfile() {
        getSearchContext().findElement(myprofileOption).click();
    }

    public void clickLogout() { getSearchContext().findElement(logoutOption).click(); }

    public void enterInviteSubj() { getSearchContext().findElement(invitesubjField).sendKeys("FileinviteTest"); }

    public void clickDueDate() { getSearchContext().findElement(duedateField).click(); }

    public void pickDueDate() { getSearchContext().findElement(duetodaydateDatePicker).click(); }

    public void pickNDueDate() { getSearchContext().findElement(duenottodaydateDatePicker).click(); }

    public void searchExistingContact() { getSearchContext().findElement(searchcontactField).click(); }

    public void getFirstContact() { getSearchContext().findElement(pick1contactField).click(); }

    public void getSecondContact() { getSearchContext().findElement(pick2contactField).click(); }

    public void clickCreateContact() { getSearchContext().findElement(createcontactButton).click(); }

    public void enterMessageToContact() { getSearchContext().findElement(messagetocontactField).sendKeys("Fileinvite Test"); }

    public void enterRequestTitle() { getSearchContext().findElement(requesttitleField).sendKeys("Request Test"); }

    public void enterRequestDesc() { getSearchContext().findElement(requestdescField).sendKeys("Request Test Description"); }

    public void clickCreateRequest() { getSearchContext().findElement(createrequestButton).click(); }

    public void clickUploadFile() { getSearchContext().findElement(uploadfileButton).click(); }

    public void clickReviewInvite() { getSearchContext().findElement(reviewinviteButton).click(); }

}
