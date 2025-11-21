package org.example;

import io.restassured.path.json.JsonPath;

import java.util.Map;

public class JsonArray {
    public  static void main(String[] args){
        JsonPath js=new JsonPath(Payload.CoursePrice());
       int count= js.getInt("courses.size()");
        System.out.println(count);
        int getpAmount=js.getInt("dashboard.purchaseAmount");
        System.out.println(getpAmount);
        String Firstcourse=js.getString("courses[0]");
        //Map<String, Object> firstCourse = js.getMap("courses[0]");
String firsttitle= js.getString("courses[0].title");
        // Print the first object
        System.out.println("First title: " + firsttitle);
        for(int i=0;i<count;i++){
            String title= js.getString("courses["+i+"].title");
            System.out.println("title:"+title);
            String price= js.getString("courses["+i+"].price");
            System.out.println("price:"+price);
            String copies= js.getString("courses["+i+"].copies");
            System.out.println("copies:"+copies);
        }
    }
}
