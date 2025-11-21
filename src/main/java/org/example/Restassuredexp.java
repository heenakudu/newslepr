package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class Restassuredexp {
    public static void main(String[] args) {
        // Set the base URI for the REST API
//        RestAssured.baseURI=" https://rahulshettyacademy.com";
//        given().log().all().queryParam("key","qaclick123").header("Content-type","application/json").body("{\n" +
//                "  \"location\": {\n" +
//                "    \"lat\": -38.383494,\n" +
//                "    \"lng\": 33.427362\n" +
//                "  },\n" +
//                "  \"accuracy\": 50,\n" +
//                "  \"name\": \"Frontline house\",\n" +
//                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
//                "  \"address\": \"29, side layout, cohen 09\",\n" +
//                "  \"types\": [\n" +
//                "    \"shoe park\",\n" +
//                "    \"shop\"\n" +
//                "  ],\n" +
//                "  \"website\": \"http://google.com\",\n" +
//                "  \"language\": \"French-IN\"\n" +
//                "}\n").when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200);

        RestAssured.baseURI= "https://rahulshettyacademy.com";
        RequestSpecification httpRequest = RestAssured.given();
        //Passing the resource details
        //Retrieving the response body using getBody() method
        Response response = RestAssured
                .given()
                .queryParam("key", "qaclick123")    // Query param
                .header("Content-Type", "application/json") // Header
                .body(Payload.AddPlace())
                .when()
                .post("maps/api/place/add/json");//send post req
        response
                .then()
                .log().ifValidationFails()       // Log full response
                .assertThat()            // Validate
                .statusCode(200).body("scope",equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)");        // Assert status code
        //ResponseBody body = response.body();
        //Converting the response body to string object
       // String rbdy = body.asString();
        //Creating object of JsonPath and passing the string response body as parameter
        //JsonPath jpath = new JsonPath(rbdy);
        //Storing publisher name in a string variable
        String title=response.jsonPath().getString("place_id");

        System.out.println("The Placeid is - "+title);

    }
}