package CentralizaData;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.util.List;

public class ToolsQA {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://demoqa.com/BookStore";

        // Perform a GET request to the "/v1/Books" endpoint
        Response response = RestAssured.given()
                .when()
                .get("/v1/Books");

        // Extract and parse the list of book titles using JSONPath
        List<String> bookTitles = response.jsonPath().getList("books.title");
        //List<String> titles = response.jsonPath().getList("store.book.title");

        // Print the list of book titles
        System.out.println("Book Titles: " + bookTitles);

        long restime= response.time();
        // Optional: Verify response status code
        int statusCode = response.getStatusCode();
        //System.out.println("Status Code: " + restime);

        // Optional: Verify response status line
        String statusLine = response.getStatusLine();
        //System.out.println("Status Line: " + statusLine);

        // Optional: Extract specific headers
        String contentType = response.getHeader("Content-Type");
        //System.out.println("Content-Type: " + contentType);
    }
}
