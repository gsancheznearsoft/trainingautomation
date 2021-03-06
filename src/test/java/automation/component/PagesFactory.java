package automation.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagesFactory {
    private WebDriver _webDriver;

    public PagesFactory(WebDriver webDriver) {
        _webDriver = webDriver;
        PageFactory.initElements(_webDriver, this);
    }

    protected WebDriver getWebDriver() {
        return _webDriver;
    }

    public HomePage homePage() {
        return new HomePage(getWebDriver(), this);
    }

    public LoginPage loginPage() {
        return new LoginPage(getWebDriver(), this);
    }

    public ShoppingCartPage shoppingCartPage() {
        return new ShoppingCartPage(getWebDriver(), this);
    }

    public DressDetailsPage dressDetailsPage() {
        return new DressDetailsPage(getWebDriver(), this);
    }

    public MyAccountPage myAccountPage() {
        return new MyAccountPage(getWebDriver(), this);
    }

    public OrderHistoryPage orderHistoryPage() {
        return new OrderHistoryPage(getWebDriver(), this);
    }

}