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


    public Client readClientRecord() {
        Client client = new Client();
        try {
            while(input.hasNext()){
                client.setAccountID(input.nextInt());
                client.setBalance(input.nextInt());
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
}
