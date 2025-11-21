public interface Payment {
    public void Nommethod();
    public static void Paymenthod(){
        System.out.println("this is static method");
    }
    default String SecMethod(){
        return "Hello World!";
    }
}
