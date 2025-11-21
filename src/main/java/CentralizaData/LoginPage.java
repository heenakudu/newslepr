package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private WebDriver driver;
    private By usernameField = By.id("Username");
    private By PasswordField = By.id("Password");
    private By LoginBtnField = By.id("loginbtn");

    public LoginPage(WebDriver driver) {
       // this.driver = driver;
        super(driver);

        WaitForPageLoad();
    }

    @Override
    public String getPageTitle() {
        return "";
    }

    public void EnterUsername(String Username) {
        driver.findElement(usernameField).sendKeys(Username);
    }

    public void EnterPassword(String Password) {
        driver.findElement(PasswordField).sendKeys(Password);
    }

    public void Login_Click() {
        driver.findElement(LoginBtnField).click();
    }

    public HomePage LoginPAgeClick(String Username, String Password){
        EnterUsername(Username);
        EnterPassword(Password);
        Login_Click();
        return new HomePage(driver);
    }


}