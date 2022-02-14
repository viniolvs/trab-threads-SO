package src;

public class Loan {
    protected final Book book;
    protected final Client client;

    protected Loan(Book book, Client client){
        this.book = book;
        this.client = client;
    }
    protected Book getBook() {
        return book;
    }
    protected Client getClient() {
        return client;
    }
}