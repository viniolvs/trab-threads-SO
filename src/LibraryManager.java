package src;

import java.util.ArrayList;

public class LibraryManager {
    private final ArrayList<Client> clients;
    private final ArrayList<Book> books;
    private final ArrayList<Loan> loans;

    public LibraryManager(){
        clients = new ArrayList<Client>();
        books = new ArrayList<Book>();
        loans = new ArrayList<Loan>();
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Loan> getLoans() {
        return loans;
    }
    public void addClient (Client client) {
        clients.add(client);
    }
    public void addBook(Book book) {
        books.add(book);
    }
    
    public boolean loanBook (Book book, Client client){
        
        if(verifieLoan(book) == true){
            return false;
        }
        else{
            loans.add(new Loan(book, client));
            return true;
        }
    }

    public boolean verifieLoan(Book book) {
        for (Loan loan : loans) {
            if (book.getID() == loan.getBook().getID())
                return true;
        }
        return false;
    }
}
