package CentralizaData;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.http.Header;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.path.json.JsonPath.given;

public class RestAssuredTest {
    @Test
    public void GetBookDetails() {
        RestAssured.baseURI = "https://demoqa.com/BookStore";
        Response response = RestAssured.given().header("Content-Type", "application/json").when().get("/v1/Books");
        JsonPath js=response.jsonPath();
        String publish_date= js.getString("books[0].publish_date");
        System.out.println(publish_date);

    }
}

