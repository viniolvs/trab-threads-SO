package mains;

import src.*;
import java.util.concurrent.Semaphore;
import java.lang.InterruptedException;
public class LoanThread implements Runnable{
    Semaphore sem;
    private final LibraryManager library;
    private Book book;
    private Client client;

    public LoanThread(LibraryManager library, Book book, Client client,Semaphore sem){
        this.library = library;
        this.book = book;
        this.client = client;
        this.sem = sem;
    }

    public void run(){
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            System.err.println("Interrupted Exception Loan Thread");
        }
        boolean aux = library.verifieLoan(book);
        
        if(aux == false){
            library.loanBook(book, client);
            System.out.println("Loaned "+book.getTitle()+" to Client "+client.getName());
        }
        else
            System.out.println("Book already loaned!");
        sem.release();
    }
}