package objects.components;

import com.google.inject.Inject;
import org.openqa.selenium.*;


public class Dashboard {
    private WebDriver webDriver;

    private By searchContext;

    private By createnewinviteButton = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[1]/a");

    private By userprofileButton = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/a");

    private By myprofileOption = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/ul/li/div/div[1]/a");

    private By logoutOption = By.xpath("//*[@id=\"main-app\"]/div[1]/div/header/nav/div[2]/ul/li[2]/ul/li/div/div[2]/a");

    @Inject
    public Dashboard(WebDriver webDriver) {
        this(webDriver, By.id("main-app"));
    }

    public Dashboard(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void clickCreateNewInvite() { getSearchContext().findElement(createnewinviteButton).click(); }

    public void hoverUserProfile() { getSearchContext().findElement(userprofileButton).click(); }

    public void clickMyProfile() {
        getSearchContext().findElement(myprofileOption).click();
    }

    public void clickLogout() { getSearchContext().findElement(logoutOption).click(); }
}
