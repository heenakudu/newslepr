package CentralizaData;

public class Encap {
    private Double Balance;

    public Encap(Double balance){
        this.Balance=balance;
    }
    public double getbalance(){
        return Balance;
    }
    public void deposit(double amount) { // Method to modify balance
        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
}
