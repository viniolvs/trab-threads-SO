package src;

public class Book {
    private int bookID;
    private String title;
    private int year;
    private String author;
    private int edition;

    public Book(int ID) {
        bookID = ID;
        title = GenerateData.getTitle(ID);
        year = GenerateData.getYear();
        edition = GenerateData.getEdition();
        author = GenerateData.getAuthor(ID);
    }

    public int getID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor(){
        return author;
    }
    public int getEdition() {
        return edition;
    }
}
