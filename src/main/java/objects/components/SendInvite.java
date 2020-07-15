package objects.components;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class SendInvite {
    private WebDriver webDriver;

    private By searchContext;

    private By editinviteinfoButton = By.xpath("//*[@id=\"app\"]/section[2]/div[2]/div[1]/div/div[1]/div/a");

    private By editcontactButton = By.xpath("//*[@id=\"app\"]/section[2]/div[2]/div[2]/div/div[1]/div/a");

    private By editinviterequestButton = By.xpath("//*[@id=\"app\"]/section[2]/div[3]/div[1]/div/div[1]/div/a");

    private By editaddtloptionsButton = By.xpath("//*[@id=\"app\"]/section[2]/div[3]/div[2]/div/div[1]/div/a");

    private By editinviteButton = By.xpath("//*[@id=\"send-invite-form\"]/a");

    private By sendinviteButton = By.xpath("//*[@id=\"send-invite-btn\"]");

    @Inject
    public SendInvite(WebDriver webDriver) {
        this(webDriver, By.id("app"));
    }

    public SendInvite(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void clickEditInviteInfo() {
        getSearchContext().findElement(editinviteinfoButton).click();
    }

    public void clickEditContact() {
        getSearchContext().findElement(editcontactButton).click();
    }

    public void clickEditInviteRequest() {
        getSearchContext().findElement(editinviterequestButton).click();
    }

    public void clickEditAddtlOptions() {
        getSearchContext().findElement(editaddtloptionsButton).click();
    }

    public void clickEditInvite() {
        getSearchContext().findElement(editinviteButton).click();
    }

    public void clickSendInvite() { getSearchContext().findElement(sendinviteButton).click(); }
}
