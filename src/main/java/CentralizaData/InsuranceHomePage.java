package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceHomePage extends InsuranceBaseClass{

    private WebDriver driver;
    private By WElcmmsgField=By.id("wlcm");
    private By PlicyoverviewLink=By.id("linkp");
    private By ClaimDetails=By.id("claimsd");
    public InsuranceHomePage(WebDriver driver){
        super(driver);

    }
    public String getWelcomemsg(){
        return driver.findElement(WElcmmsgField).getText();
    }
    public void PlicyoverviewLink(){
         driver.findElement(PlicyoverviewLink).click();
    }
    public void GetClaimDetails(){
         driver.findElement(ClaimDetails).click();
    }
    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }
}
