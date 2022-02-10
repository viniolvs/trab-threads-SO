package single_thread;
import java.io.Serializable;

public class Client implements Serializable{
    private int account;
    private String name;
    private int balance;

    public Client(){
        this.account = 0;
        this.name = "";
        this.balance = 0;
    }
    public Client(int account, String name, int balance){
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //Deposita uma quantidade passada como notas
    public void depositNotes(MoneyNote[] notes) {
        
    }


    public void withdrawMoney(int ammount) {
        
    }
}