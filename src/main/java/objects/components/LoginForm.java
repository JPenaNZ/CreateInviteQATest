package objects.components;

import com.google.inject.Inject;
import configs.User;
import configs.UserDummy;
import org.openqa.selenium.*;

public class LoginForm {
    private WebDriver webDriver;

    private By searchContext;

    private By loginInputField = By.xpath("//*[@id=\"login-username-input\"]");

    private By pwdInputField = By.xpath("//*[@id=\"login-password-input\"]");

    private By signinButton = By.xpath("//*[@id=\"login-btn\"]");

    private By forgotpwd = By.xpath("//*[@id=\"login-form\"]/h5/a");

    @Inject
    public LoginForm(WebDriver webDriver) {
        this(webDriver, By.id("login-form"));
    }

    public LoginForm(WebDriver webDriver, By searchContext)
    {
        this.webDriver = webDriver;
        this.searchContext = searchContext;
    }

    public void setSearchContext(By locator)
    {
        searchContext = locator;
    }

    private SearchContext getSearchContext()
    {
        return webDriver.findElement(searchContext);
    }

    public void enterLoginDetails(User user) {
        enterLoginDetails(user.getUsername(), user.getPassword());
    }

    public void enterLoginDetails(UserDummy userDummy) { enterLoginDetails(userDummy.getUsername(), userDummy.getPassword());
    }

    public void enterLoginDetails(String username, String password)
    {
        getSearchContext().findElement(loginInputField).sendKeys(username);
        getSearchContext().findElement(pwdInputField).sendKeys(password);
    }

    public void clickSignin() {
        getSearchContext().findElement(signinButton).click();
    }
}
