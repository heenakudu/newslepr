import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practiceses {
    @Test
    public void Shufflearray()
    {
      int[] Digits={1,2,3};
      int[] Res = new int[3];
        for(int i=0;i>=Digits.length;i++){

          if(Digits[i]>9){
              int res=Digits[i]%10;
          }
          else {
              Res[i]=Res[i]+1;
          }

      }
for(int i=0;i>=Res.length;i++){
    System.out.println(Res[i]);
}
    }
}
