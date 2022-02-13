package mains;

import src.*;

public class LoanThread implements Runnable{

    private static LibraryManager library;
    private Book book;
    private Client client;

    public LoanThread(LibraryManager library,Book book, Client client){
        LoanThread.library = library;
        this.book = book;
        this.client = client;
    }

    public void run(){
        library.loanBook(book, client);
    }
    
}