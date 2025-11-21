package CentralizaData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.Payload;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestExampleAssured {

   public  static void main(String[] args){
       RestAssured.baseURI="https://rahulshettyacademy.com/";
  String response=given().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.AddPlace()).when().post("maps/api/place/add/json").
          then().log().all().assertThat().statusCode(200).header("Server"," Apache/2.4.52 (Ubuntu)").body("scope",equalTo("APP")).extract().response().asString();
       JsonPath js=new JsonPath(response);
       String paceid=js.getString("place_id");
       System.out.println(paceid);
       given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
               .body("{\n" +
                       "\"place_id\":\""+paceid+"\",\n" +
                       "\"address\":\"70 Summer walk, USA\",\n" +
                       "\"key\":\"qaclick123\"\n" +
                       "}").when().put("/maps/api/place/update/json")
              /* .body("{\n" +
               "  \"place_id\": \"" + paceid + "\",\n" +
               "  \"address\": \"70 Summer walk, USA\",\n" +
               "  \"key\": \"qaclick123\"\n" +
               "}").when().put("/maps/api/place/update/json")*/
               .then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
               String getrs=given().queryParam("place_id",paceid).queryParam("key","qaclick123").header("Content-Type","application/json").when().log().all().get("/maps/api/place/get/json").then().log().all().extract().response().asString();

       JsonPath js2=new JsonPath(getrs);
        String Adress= js2.getString("name");
        System.out.println(Adress);


   }




}