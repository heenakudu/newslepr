package CentralizaData;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Chatgptex {
    @Test
    public void JsonEx(){
      /*  RestAssured.baseURI="https://jsonplaceholder.typicode.com";
        Response response=given().when().get("/users/1");*/
        String response="{\n" +
                "  \"employees\": [\n" +
                "    { \"id\": 10, \"name\": \"John Doe\" },\n" +
                "    { \"id\": 25, \"name\": \"Jane Smith\" },\n" +
                "    { \"id\": 150, \"name\": \"Alice Brown\" },\n" +
                "    { \"id\": 320, \"name\": \"Bob White\" }\n" +
                "  ]\n" +
                "}\n";
    /*
{
  "employees": [
    { "id": 10, "name": "John Doe" },
    { "id": 25, "name": "Jane Smith" },
    { "id": 150, "name": "Alice Brown" },
    { "id": 320, "name": "Bob White" }
  ]
}

*/

//$.employees[?(@.id >=15 && @.id<=300)].id
        //$.employees[?(@.id >= 15 && @.id <= 300)].id
        JsonPath js=new JsonPath(response);
        //List<String> ElectList=js.getList("products.findAll{it.category=='Electronics'}.name");
 String sActivw=js.getString("employees.findAll{it.id>15 && it.id<300}.name");
        //List<String> lst=js.getList("users.role");
       // int nikrole=js.getInt("project.team.find{it.name=='Rahul'}.tasksCompleted");
//assert sActivw==5:"its not 5";
    System.out.println(sActivw);


//assert nikrole==5:"Not a Match";
       // String sActive = js.getString("users.find { it.id == 2 }.name");
        //assert sActivw==6 : "not 5!";
        //String city=js.getString("address.city");
        //String skills=js.getString("skills");
        //Verify if there is a user with the role "Tester"




    }
}
