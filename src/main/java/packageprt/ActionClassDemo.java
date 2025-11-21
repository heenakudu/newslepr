package packageprt;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;


public class ActionClassDemo {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Iterating
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Removing an element
        arrayList.remove("Banana"); // Removes "Banana"
        System.out.println("After removal: " + arrayList);
}
}
