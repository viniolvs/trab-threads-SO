package src;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Client> clients;
    private ArrayList<Book> books;
    private ArrayList<Loan> loans;

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
    
    public void loanBook (Book book, Client client){
        if (clients.contains(client) && books.contains(book)){       
            if (client.getLoans()<=1) {
                loans.add(new Loan(book, client));
                client.addLoan();
            }
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
