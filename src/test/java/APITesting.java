import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.bidi.browsingcontext.ReadinessState;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.directory.SearchResult;
import java.util.List;
import java.util.Map;

public class APITesting {
    @Test
    public void getAllProducts(){
        Response PrResponse = RestAssured.given().when().get("https://automationexercise.com/api/productsList")
                .then().statusCode(200).extract().response();
        int Statuscode=PrResponse.getStatusCode();
        //List<String> Products = PrResponse.jsonPath().getList();
        //System.out.println(PrResponse.asString());
        List<Map<String,Object>> lst=PrResponse.jsonPath().getList("products");
        List<String> ProductNames=PrResponse.jsonPath().getList("products.name");
        String PrFirstName=PrResponse.jsonPath().getString("products[1].name");
        String Nested=PrResponse.jsonPath().getString("products[1].category.usertype.usertype");
        System.out.println(Nested);
        System.out.println("GIT TEST NOW");


    }
    @Test
    public void getSearchproduct(){
Response SearchProduct=RestAssured.given().formParam("search_product","top").when().post("https://automationexercise.com/api/searchProduct")
        .then().statusCode(200).extract().response();
System.out.println(SearchProduct.asString());
    }
    @Test
    public void getSearchproductFail(){
        Response Searchfail=RestAssured.given().when().post("https://automationexercise.com/api/searchProduct").then().statusCode(200).extract().response();
//        long ActualTime=Searchfail.getTime();
//        Assert.assertTrue(ActualTime>2000,"Response time too high");
        System.out.println(Searchfail.asString());
    }
    @Test
    public void LoginRegisterUser(){
        Response SenLogInfo=RestAssured.given()
                .formParam("name","Heena")
                .formParam("email","heenak124@gmail.com")
                .formParam("password","Heena123")
                .formParam("title","miss")
                .formParam("birth_date","29")
                .formParam("birth_month","07")
                .formParam("birth_year","1995")
                .formParam("firstname","Heena")
                .formParam("lastname","kudu")
                .formParam("company","Synechron")
                .formParam("address1","Vasai")
                .formParam("address2","vasai")
                .formParam("country","India")
                .formParam("zipcode","401207")
                .formParam("state","Maharashtra")
                .formParam("city","vasai")
                .formParam("mobile_number","9168070897")
                .when().post("https://automationexercise.com/api/createAccount").then().statusCode(200).extract().response();
        System.out.println(SenLogInfo.asString());
    }

    @Test
    public void GetAccountDet(){
        Response Getdata=RestAssured.given()
                .formParam("email","heenak124@gmail.com")
                .when().get(" https://automationexercise.com/api/getUserDetailByEmail")
                .then().statusCode(200).extract().response();
        //change
        System.out.println(Getdata.asString());
    }
    @Test
    public void VerifyLogin(){
        Response response=RestAssured.given()
                .formParam("email","heenak124@gmail.com")
                .formParam("password","Heena123")

                .when().post("https://automationexercise.com/api/verifyLogin")
                .then().statusCode(200).extract().response();
        System.out.println(response.asPrettyString());
    }

    @Test
    public void ModifyUserDetail(){
        Response response= RestAssured.given()
                .formParam("name","Heena_Updated")
                .formParam("email","heenak124@gmail.com")
                .formParam("password","Heena123")
                .formParam("title","miss")
                .formParam("birth_date","29")
                .formParam("birth_month","07")
                .formParam("birth_year","1995")
                .formParam("firstname","Heena")
                .formParam("lastname","kudu")
                .formParam("company","Productbased")
                .formParam("address1","Vasai")
                .formParam("address2","vasai")
                .formParam("country","India")
                .formParam("zipcode","401207")
                .formParam("state","Maharashtra")
                .formParam("city","vasai")
                .formParam("mobile_number","9168070897")
                .when().put("https://automationexercise.com/api/updateAccount")
                .then().statusCode(200)
                .extract().response();
        System.out.println(response.asPrettyString());

    }

    @Test
    public void DeleteUser(){
        Response response=RestAssured.given()
                .formParam("email","heenak124@gmail.com")
                .formParam("password","Heena123")
                .when().delete("https://automationexercise.com/api/deleteAccount")
                .then().statusCode(200)
                .extract().response();

        String resmsg=response.getBody().asString();
        System.out.println(resmsg);

    }

    @Test
    public void GetCon(){
        Response res=RestAssured.given().when().get("https://automationexercise.com/api/productsList")
                .then().statusCode(200).extract().response();
        List<Map<String,Object>> lst=res.jsonPath().getList("products.findAll{it.id>=10 && it.id<=25}");
        System.out.println(lst);
 }

    @Test
    public void Jsonschemaex() {
        System.out.println("FOUND? " +
                getClass().getClassLoader().getResource("schemas/UserSchema.json"));
        String json="{\n" +
                "  \"$schema\": \"http://json-schema.org/draft-07/schema#\",\n" +
                "  \"type\": \"object\",\n" +
                "  \"properties\": {\n" +
                "    \"data\": {\n" +
                "      \"type\": \"object\",\n" +
                "      \"properties\": {\n" +
                "        \"id\": { \"type\": \"integer\" },\n" +
                "        \"email\": { \"type\": \"string\" },\n" +
                "        \"first_name\": { \"type\": \"string\" },\n" +
                "        \"last_name\": { \"type\": \"string\" }\n" +
                "      },\n" +
                "      \"required\": [\"id\", \"email\", \"first_name\", \"last_name\"]\n" +
                "    },\n" +
                "    \"support\": {\n" +
                "      \"type\": \"object\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"required\": [\"data\"]\n" +
                "}\n";

        RestAssured.given()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("resources/User.json"));
    }
}
