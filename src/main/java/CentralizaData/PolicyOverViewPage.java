package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PolicyOverViewPage extends InsuranceBaseClass{
    private WebDriver driver;
    private By PolicyDetails=By.id("");

    public PolicyOverViewPage(WebDriver driver){
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }

    public Boolean IsPolicyDetailsDisplayed(){
        return driver.findElement(PolicyDetails).isDisplayed();
    }
}
