package src;

public class Loan {
    protected Book book;
    protected Client client;

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