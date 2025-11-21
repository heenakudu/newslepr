package CentralizaData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClaimsDetailsStaus extends InsuranceBaseClass{

      private List<WebElement> ClaimsDetails;
      private By ClaimStatusApproved= By.id("dgdg");

      public ClaimsDetailsStaus(WebDriver driver){
         super(driver);
      }
    @Override
    public String getPageTitle() {
        return "";
    }
    public String GetclaimDet(){
        return driver.findElement(ClaimStatusApproved).getText();
    }

}
