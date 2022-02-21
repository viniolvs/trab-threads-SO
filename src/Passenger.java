package src;

public class Passenger extends User{
    private double balance;

    public Passenger(int ID) {
        super(ID);
        balance = GenerateData.getBalance();
    }
    
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double price){
        balance-= price;
    }
}
