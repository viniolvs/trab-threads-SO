package single_thread;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.FormatterClosedException;

public class WriteFile {
    private Formatter output;
    
    public void openFile() {
        try {
            FileWriter fileWriter = new FileWriter("clients.txt",true);
            output = new Formatter(fileWriter);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e){
            System.out.println("File not found.");
        }
        
    }

    public void addRecord(int account, int balance) {
        try {
            output.format("%d %d\n", account, balance);
        } catch (FormatterClosedException e) {
            System.out.println("Error writing on file");
        }
        
    }

    public void closeFile() {
        if (output!=null)
            output.close();
    }

    public void doItAll(int account, String name, int balance) {
        openFile();
        addRecord(account, balance);
        closeFile();
    }
}
