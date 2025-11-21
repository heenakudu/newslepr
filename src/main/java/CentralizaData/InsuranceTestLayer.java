package CentralizaData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InsuranceTestLayer {
    private WebDriver driver;

    @BeforeMethod
    public void Setup(){
        driver=new ChromeDriver();
        // driver.get("abc.com");
        driver.manage().window().maximize();
    }
    @Test
    public void InsuranceTest(){
        //driver=new ChromeDriver();
        InsuranceHomePage HomePage=new InsuranceHomePage(driver);

        ;
        Assert.assertTrue(HomePage.getWelcomemsg().contains("gdg"),"doesnt contain");
     HomePage.getPageTitle();
     HomePage.GetClaimDetails();
     HomePage.PlicyoverviewLink();

     PolicyOverViewPage page=new PolicyOverViewPage(driver);
     page.IsPolicyDetailsDisplayed();

     Assert.assertTrue(page.IsPolicyDetailsDisplayed(),"Not displayed");
     ClaimsDetailsStaus stat=new ClaimsDetailsStaus(driver);
     Assert.assertNotNull(stat,"dhwdh");
    }

    @AfterMethod
    public void TearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
