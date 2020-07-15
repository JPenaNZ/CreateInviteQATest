package objects.components;

import com.google.inject.Inject;
import org.openqa.selenium.*;

public class CreateContactPopup {
    private WebDriver webDriver;

    private By searchContext;

    private By newcontactfnameField = By.xpath("//*[@id=\"first-name-input\"]");

    private By newcontactlnameField = By.xpath("//*[@id=\"last-name-input\"]");

    private By newcontactemailField = By.xpath("//*[@id=\"email-input\"]");

    private By newcontactmobileField = By.xpath("//*[@id=\"mobile-input\"]");

    private By newcontactsmsChkbox = By.xpath("//*[@id=\"sms-input\"]");

    private By newcontactcancelButton = By.xpath("//*[@id=\"ajax-create-contact-form\"]/div/div[3]/button[1]");

    private By newcontactcreateButton = By.xpath("//*[@id=\"ajax-create-contact-form\"]/div/div[3]/button[2]");

    @Inject
    public CreateContactPopup(WebDriver webDriver) {
        this(webDriver, By.id("ajax-create-contact-form"));
    }

    public CreateContactPopup(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void enterNewContactFirstName() {
        getSearchContext().findElement(newcontactfnameField).click();
    }

    public void enterNewContactLastName() {
        getSearchContext().findElement(newcontactlnameField).click();
    }

    public void enterNewContactEmail() {
        getSearchContext().findElement(newcontactemailField).click();
    }

    public void enterNewContactMobile() {
        getSearchContext().findElement(newcontactmobileField).click();
    }

    public void enterNewContactSMS() {
        getSearchContext().findElement(newcontactsmsChkbox).click();
    }

    public void clickNewContactCancel() {
        getSearchContext().findElement(newcontactcancelButton).click();
    }

    public void clickNewContactCreate() {
        getSearchContext().findElement(newcontactcreateButton).click();
    }
}
