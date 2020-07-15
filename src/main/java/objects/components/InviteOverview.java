package objects.components;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class InviteOverview {
    private WebDriver webDriver;

    private By searchContext;

    private By userprofileButton = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/a");

    private By myprofileOption = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/ul/li/div/div[1]/a");

    private By logoutOption = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/ul/li/div/div[2]/a");

    @Inject
    public InviteOverview(WebDriver webDriver) {
        this(webDriver, By.id("app"));
    }

    public InviteOverview(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void hoverUserProfile() { getSearchContext().findElement(userprofileButton).click(); }

    public void clickMyProfile() {
        getSearchContext().findElement(myprofileOption).click();
    }

    public void clickLogout() { getSearchContext().findElement(logoutOption).click(); }
}
