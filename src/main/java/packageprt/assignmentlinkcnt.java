package packageprt;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentlinkcnt {
    public static void main(String[] args){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

        System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
       WebElement elcheckbox=driver.findElement(By.xpath("//label[@for='benz']"));
        if(elcheckbox.isSelected())
        {
            elcheckbox.getText();
        }

        WebElement Dropdown= driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(Dropdown);
        s.selectByVisibleText(elcheckbox.getText());
//6,11
        driver.findElement(By.id("name")).sendKeys(s.getFirstSelectedOption().getText());
        driver.findElement(By.id("alertbtn")).click();
        String Expected= driver.switchTo().alert().getText().substring(6,13);
        System.out.println(Expected);
        driver.switchTo().alert().accept();
       if(Expected.equals(elcheckbox.getText())){
           System.out.println("Match");
       }
       else {
           System.out.println("Not a Match");
       }


    }
}
