package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private By WelcomeMessage= By.id("WEcomeid");
    private By ProfileLink=By.id("ProfileLink");
    private By Logout=By.id("Logout");

    public HomePage(WebDriver driver){
        super(driver);
        OpenPage();
    }
    public void OpenPage(){

        WaitForPageLoad();
    }
    public String getWelcomeMessage(){
        return driver.findElement(WelcomeMessage).getText();
    }
    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }
}
