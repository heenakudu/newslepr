package Loginstep;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class Loginstepdef {

    WebDriver driver;

    @Given("the users are on the Login page")
    public void User_On_LoginPage() {
        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuduh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();  // Automatically manages the driver version
        driver = new ChromeDriver();
        driver.get("http://yourwebsite.com/login"); // Replace with your website's URL
        System.out.println("User on the login page");
    }

    @When("the user enters the input {string} and {string}")
    public void the_user_enters_the_input_and(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        // Add actual input logic here (e.g., sending keys to username and password fields)
    }

    @Then("user should see DashBoard")
    public void Dashbord() {
        // Verify that the user is redirected to the dashboard page

            System.out.println("User on the Dashboard");
        // Close the browser
    }
}
