package multi_thread;

import single_thread.Client;
import single_thread.ReadFile;



//lê do arquivo o client passado
public class ReaderThread extends Thread{
    private Client client;


    public ReaderThread(Client client){
        super();
        this.client = client;
    }

    public synchronized void run() {
        ReadFile read = new ReadFile();
        client = read.doItAll(client.getAccountID());
        if (client.getAccountID() == -1)
            System.out.println("Id not found");
        else
            System.out.println("Reader["+Thread.currentThread().getName()+"] = Client ID = "+client.getAccountID()+" Client balance = "+client.getBalance());
    }
}
