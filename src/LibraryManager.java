package src;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Client> clients;
    private ArrayList<Book> books;

    public ArrayList<Client> getClients() {
        return clients;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addClient (Client client) {
        clients.add(client);
    }
    public void addBook(Book book) {
        books.add(book);
    }
}
