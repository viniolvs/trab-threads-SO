package single_thread;

public class Client{
    private int accountID;
    private int balance;

    public Client(int accountID){
        this.accountID = accountID;
        this.balance = GenerateBalance.getBalance();
    }
    public Client(int accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }
    protected void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
