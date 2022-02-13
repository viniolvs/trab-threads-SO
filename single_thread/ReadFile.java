package single_thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class ReadFile {
    private Scanner input;
    
    public void openFile() {
        try {
            input = new Scanner(new File("clients.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }


    public Client searchClientRecord(int accountID) {
        Client client = new Client(-1);
        int ID=-1; int balance; 
        try {
            while(input.hasNext() && ID != accountID){
                ID = input.nextInt();
                balance = input.nextInt();
                if (ID == accountID){
                    client.setAccountID(ID);
                    client.setBalance(balance);
                }
            }
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed");
            input.close();
            System.exit(1);
        }
        return client;
    }

    public void closeFile() {
        if (input!=null)
            input.close();
    }

    public Client doItAll(int accountID) {
        Client client = new Client(0);
        openFile();
        client = searchClientRecord(accountID);
        closeFile();
        return client;
    }
}
