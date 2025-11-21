import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;



public class movecurser {
    @Test
    public void geeksforgeeks() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");
        Actions action=new Actions(driver);
        action.moveByOffset(460,540).click().build().perform();
       // driver.close();
    }
}
