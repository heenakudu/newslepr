package packageprt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ps4 extends constrtest{
    public ps4(int a) {
        super(a);
    }

    @Test
    public void jjvj(){
        constrtest cs=new constrtest(10);
        int a=6;
        System.out.println(cs.increment());
        System.out.println(cs.decrement());

    }

}
