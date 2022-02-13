package multi_thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import single_thread.Client;


public class Main {
    public static void main(String[] args) {
        
        long begin = System.currentTimeMillis();

               
        /*ExecutorService executor = Executors.newCachedThreadPool();
        for (int j = 0; j < 4; j++) {
            Client client = new Client(j);
            executor.execute(new WriterThread(client));    
        }
        executor.shutdown();*/
        for (int i = 0; i < 100; i++) {
            Client client = new Client(i);
            WriterThread writer = new WriterThread(client);
            ReaderThread reader = new ReaderThread(client);
            
            writer.start();
            reader.start();
            try {
                writer.join();
                reader.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
        


        
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
    
}
