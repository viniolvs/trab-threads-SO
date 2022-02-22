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

    protected void pay(double price){
        balance-= price;
    }

    @Override
    public String toString() {
        return "Passenger: "+getName()+" ";
    }
}
