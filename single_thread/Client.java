package single_thread;

public class Client{
    private int accountID;
    private int balance;

    public Client(){
        this.accountID = 0;
        this.balance = 0;
    }
    public Client(int accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
