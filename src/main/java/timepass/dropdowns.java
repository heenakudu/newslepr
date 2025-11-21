package timepass;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class dropdowns {
    @Test
   public void GetBookingIDs(){
        Response response= RestAssured.given().when().get("https://restful-booker.herokuapp.com/booking");
        response.print();
        Assert.assertEquals(response.getStatusCode(),200,"Status code doesnt match");
        List<Integer> BookingIDs=response.jsonPath().getList("bookingid");
        Assert.assertFalse(BookingIDs.isEmpty(),"List is empty");
   }
   @Test
   public Response CreateBookingAndgetID(){
       JSONObject body=new JSONObject();
       body.put("firstname","heena");
       body.put("lastname","kudu");
       body.put("totalprice","200");
       body.put("depositpaid",true);
       JSONObject bookingdates=new JSONObject();
       bookingdates.put("checkin","2024-01-01");
       bookingdates.put("checkout","2024-01-01");
       body.put("bookingdates",bookingdates);
       body.put("additionalneeds","Breakfast");

       Response response=RestAssured.given().contentType(ContentType.JSON).body(body.toString()).when().post("https://restful-booker.herokuapp.com/booking")
               .then().statusCode(200).extract().response();
       response.print();
       return response;
   }
   @Test
   public void GetBooking(){
        Response response=CreateBookingAndgetID();
        int BookingID=response.jsonPath().getInt("bookingid");
        Response response1=RestAssured.given().get("https://restful-booker.herokuapp.com/booking/4547");
        response1.print();
   }
   @Test
   public void UpdateBooking(){
       JSONObject body=new JSONObject();
       body.put("firstname","John");
       body.put("lastname","kapse");
       body.put("totalprice",300);
       body.put("depositpaid",true);
       JSONObject bookingdates=new JSONObject();
       bookingdates.put("checkin","2024-01-01");
       bookingdates.put("checkout","2024-01-01");
       body.put("bookingdates",bookingdates);
       body.put("additionalneeds","Lunch");
       Response response=RestAssured.given().contentType(ContentType.JSON)
               .auth().preemptive().basic("admin","password123").body(body.toString()).when().put("https://restful-booker.herokuapp.com/booking/2888");
       response.print();
   }
   @Test
public void PartialUpdateBooking(){
       Response check = CreateBookingAndgetID();
       check.print();
       int book=check.jsonPath().getInt("bookingid");
       JSONObject body=new JSONObject();
       body.put("firstname","Tim");
       body.put("lastname","john");
        Response response=RestAssured.given().contentType(ContentType.JSON).body(body.toString()).accept(ContentType.JSON).header("cookie","token=abc123")
               .auth().preemptive().basic("admin","password123").when().patch("https://restful-booker.herokuapp.com/booking/"+book);
        response.print();
}
@Test
public void Delete(){
    Response check = CreateBookingAndgetID();
    check.print();
    int book=check.jsonPath().getInt("bookingid");
    System.out.println(book);
    //check.print();
    Response response=RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).header("cookie","token=abc123")
            .auth().preemptive().basic("admin","password123").when().delete("https://restful-booker.herokuapp.com/booking/"+book);
    response.print();

}

}
