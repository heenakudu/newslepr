package CentralizaData;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import  org.testng.annotations.Test;

import org.junit.runner.Request;

public class Restassur2 {
    @Test
    public void nfhfhf(){
        RestAssured.baseURI = "https://demoqa.com/BookStore";

        // Send a GET request
        Response response = RestAssured.given().when().get("/v1/Books");

        // Extract the status code
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        // Extract a specific header
        String header = response.getHeader("Content-Type");
        System.out.println("Content-Type Header: " + header);

        // Extract and print all headers
        Headers allHeaders = response.headers();
        System.out.println("Headers:");
        allHeaders.forEach(h -> System.out.println(h.getName() + ": " + h.getValue()));

        // Extract the body
        ResponseBody<?> resBody = response.getBody();

        // Convert the body to a String and print it
        String responseBody = resBody.asString();
        System.out.println("Response Body:");
        System.out.println(responseBody);
    }

    @Test
    public void GetBookDetails(){
        RequestSpecification request = RestAssured.given()
                .baseUri("https://demoqa.com/BookStore/v1/Books");

        // Send a GET request
        Response response = RestAssured.given().baseUri("https://demoqa.com/BookStore/v1/Books").when().get();

        String ContentType=response.getHeader("Content-Type");
String firstbooktitle=response.jsonPath().getString("books[0].subTitle");

        // Retrieve the status code
        //int statusCode = response.getStatusCode();

        // Print the status code for verification
        System.out.println( firstbooktitle);

        // Assert that the correct status code is returned
        //Assert.assertEquals(statusCode, 200, "Correct status code returned");
        System.out.println(ContentType);
    }

    @Test
    public void Sendqueryparam(){
        Response response=RestAssured.given().baseUri("https://demoqa.com/BookStore/v1/")
                .queryParam("ISBN","9781449325862").when().get("/Books");

        String title=response.jsonPath().getString("books[0].title");
        System.out.println(title);
    }
    @Test
    public void queryParameter() {
        //Defining the base URI
        RestAssured.baseURI= "https://bookstore.toolsqa.com/BookStore/v1";
        RequestSpecification httpRequest = RestAssured.given();
        //Passing the resource details
        Response res = httpRequest.queryParam("ISBN","9781449325862").get("/Book");
        //Retrieving the response body using getBody() method
        ResponseBody body = res.body();
        //Converting the response body to string object
        String rbdy = body.asString();
        //Creating object of JsonPath and passing the string response body as parameter
        JsonPath jpath = new JsonPath(rbdy);
        //Storing publisher name in a string variable
        String title = jpath.getString("title");
        System.out.println("The book title is - "+title);
    }
}
