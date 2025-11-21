package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class DynamicPayload {

    @Test(dataProvider="Bookdata",dataProviderClass = Payload.class)

    public void AddBook(String a,String b,String c,String d){
      RestAssured.baseURI="http://216.10.245.166";
String response=given().log().all().header("Content-Type","application/json").body(Payload.AddBook(a,b,c,d))
        .when()
        .log().all()
        .post("Library/Addbook.php")
        .then()
        .assertThat().statusCode(200)
        .extract().response().asString();
      JsonPath js=new JsonPath(response);
   String ID=js.getString("ID");
   System.out.println(response);
  }
}
