package packageprt;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Locale;



public class Javastremes {
    @Test
    public void StreamFilter(){
        String str = "123cdjcb45";
        System.out.println(str.matches("\\d+"));
    }
}
