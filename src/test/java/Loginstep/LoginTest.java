package Loginstep;

import CentralizaData.BaseTest;
//import CentralizaData.LoginPageObjectClass;
import com.google.gson.JsonObject;
import io.opentelemetry.sdk.logs.data.Body;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.bouncycastle.asn1.cms.CMSAttributes.contentType;

public class LoginTest  {
@Test
    public void healthcheckup(){
    JSONObject bookingdates = new JSONObject();
    bookingdates.put("checkin", "2013-02-23");
    bookingdates.put("checkout", "2014-10-23");

    JSONObject body = new JSONObject();
    body.put("firstname", "jonn");
    body.put("lastname", "wick");
    body.put("totalprice", 125);
    body.put("depositpaid", true);
    body.put("bookingdates", bookingdates);
    body.put("additionalneeds", "Breakfast");

    Response response = RestAssured
            .given().auth().preemptive().basic("admin","password123")
            .body(body.toString()) // 🔥 Important: call `toString()` here
            .contentType(ContentType.JSON)
            .when()
            .post("https://restful-booker.herokuapp.com/booking/203");


    System.out.println("Response: " + response.asString());


      /*{
    "firstname": "Sally",
    "lastname": "Brown",
    "totalprice": 111,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2013-02-23",
        "checkout": "2014-10-23"
    },
    "additionalneeds": "Breakfast"
}*/

}



}
