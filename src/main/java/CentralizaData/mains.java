package CentralizaData;

public class mains {
    public static void main(String[] args){
        Encap ec=new Encap(1000.0);
        ec.deposit(500);

       System.out.println(ec.getbalance());


    }
}
