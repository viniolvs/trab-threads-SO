package multi_thread;

import single_thread.Client;
import single_thread.WriteFile;


public class WriterThread extends Thread{
    private final Client client;


    public WriterThread(Client client){
        super();
        this.client = client;
    }

    public synchronized void run() {
        WriteFile writeFile = new WriteFile();
        writeFile.doItAll(client.getAccountID(), client.getBalance());
    }
}
