package CentralizaData;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.apache.http.Header;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.path.json.JsonPath.given;

public class API_Testing {
    @Test
    public void Teststatuscode(){
        RestAssured.baseURI="https://demoqa.com/BookStore";

        Response response=RestAssured.given().when().get("/v1/Books");
        int Statuscode= response.getStatusCode();
        Assert.assertEquals(Statuscode /*actual value*/, 200 /*expected value*/,
                "Correct status code returned");
    }

    @Test
    public void Headerres(){
        RestAssured.baseURI="https://demoqa.com/BookStore";
        Response response=RestAssured.given().when().get("/v1/Books");
        Headers  allheaders=response.headers();
        String Server=response.getHeader("Server");
        System.out.println(allheaders);
    }

    @Test
    public void PayloadBody(){
        RestAssured.baseURI="https://demoqa.com/BookStore";
        Response response=RestAssured.given().when().get("/v1/Books");
        ResponseBody body = response.getBody();
        String resbody=response.getBody().asString();
        Headers headers=response.getHeaders();
        System.out.println(body.asString());
        Assert.assertEquals(resbody.equals("A Working Introduction") /*Expected value*/, true /*Actual Value*/, "Response body contains Hyderabad");
    }

    @Test
    public void first(){
        RestAssured.baseURI="https://demoqa.com/BookStore";

        Response response=RestAssured.given().when().get("/v1/Books");
        String Publisher=response.jsonPath().getString("books[0]");
        System.out.println(Publisher);
    }
    @Test
    public void Second(){

        //{
        //  "id": 1,
        //  "name": "John Doe",
        //  "email": "john.doe@example.com"
        //}
        Response response =RestAssured.given()
                .when()
                .get("https://api.example.com/users/1");

        // Extracting values
        int id = response.jsonPath().getInt("id");
        String name = response.jsonPath().getString("name");
        String email = response.jsonPath().getString("email");

        // Printing values
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

}
