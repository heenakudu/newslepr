package packageprt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ps1 {
    @BeforeMethod

    public void name(){
    System.out.println("parent beformethod");
}
    @Test
    public void name465(){
        System.out.println("parent" );
    }

}
