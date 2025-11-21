package CentralizaData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class basetestagain {
    protected WebDriver driver;
    public void Launchdriver(String Browser){
        if(Browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
        else if(Browser.equalsIgnoreCase("edge")){
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    public void OpenURL(String URL){
        driver.get("dhchfv");
    }
}
