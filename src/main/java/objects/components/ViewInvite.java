package objects.components;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class ViewInvite {
    private WebDriver webDriver;

    private By searchContext;

    private By viewinviteButton = By.xpath("//*[@id=\"view-new-invite-btn\"]");

    @Inject
    public ViewInvite(WebDriver webDriver) {
        this(webDriver, By.id("app"));
    }

    public ViewInvite(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void clickViewInvite() {
        getSearchContext().findElement(viewinviteButton).click();
    }
}
