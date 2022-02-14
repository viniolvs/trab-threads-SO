package mains;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import src.*;


public class MultiThread {
    public static void main(String[] args) {
        
        long begin = System.currentTimeMillis();
        int ID = 0;
        Semaphore sem = new Semaphore(1);
        //Semaphore sem = new Semaphore(1);
            
       
        LibraryManager library = new LibraryManager();      
        for (int i = 0; i < 10; i++) {
            library.addBook(new Book(i));
        }
        for (int i = 0; i < 20; i++) {
            library.addClient(new Client(i));
        }
        

        ExecutorService executor = Executors.newFixedThreadPool(5);
        int i=0;
        //for (int i = 0; i < 10; i++) {
                executor.execute(new LoanThread(library, library.getBooks().get(i), library.getClients().get(i),sem));
                executor.execute(new LoanThread(library, library.getBooks().get(i), library.getClients().get(i+10),sem));
        //}
        executor.shutdown();



        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
    
}
