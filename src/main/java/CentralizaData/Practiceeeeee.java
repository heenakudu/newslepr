package CentralizaData;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.apache.http.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v127.page.model.WebAppManifest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practiceeeeee {
    private WebDriver driver;
    @BeforeMethod
  public void Setup(){
      driver=new ChromeDriver();
  }
  @Test
  public void InsuranceTest(){

  }

  public void TearDown(){
        if(driver!=null){
            driver.quit();
        }
  }
}
















































