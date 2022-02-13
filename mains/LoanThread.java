package mains;

import src.*;

public class LoanThread implements Runnable{
    private static LibraryManager library;
    private Book book;
    private Client client;

    public LoanThread(LibraryManager library, Book book, Client client){
        LoanThread.library = library;
        this.book = book;
        this.client = client;
    }

    public synchronized void run(){
        boolean aux = library.loanBook(book, client);
        if(aux){
            System.out.println("Loaned "+book.getTitle()+" to Client "+client.getName());
        }
        else
            System.out.println("Book already loaned!");
    }
}