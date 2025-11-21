package CentralizaData;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public  abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
    }


    public abstract String getPageTitle();

    public void WaitForPageLoad(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d){
                return ((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete");
            }
        });
    }
}
