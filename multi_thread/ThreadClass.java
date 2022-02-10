package multi_thread;

import single_thread.Client;
import single_thread.GenerateNotes;
import single_thread.MoneyCounter;
import single_thread.WriteFile;


public class ThreadClass extends Thread{
    private int accountID;


    public ThreadClass(int accountID){
        super();
        this.accountID = accountID;
    }

    public void run() {
        //aqui é o que a thread vai fazer
        Client client = new Client();
        int balance = MoneyCounter.countMoney(GenerateNotes.generateNotes());
        client.setBalance(balance);
        client.setAccountID(accountID);

        WriteFile writeFile = new WriteFile();
        writeFile.doItAll(client.getAccountID(), client.getBalance());
    }
}
