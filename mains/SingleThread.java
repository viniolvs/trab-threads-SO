package mains;

import src.*;

public class SingleThread {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        LibraryManager library = new LibraryManager();

        //for (int i = 0; i < 100; i++) {
            library.addBook(new Book(0));
            library.addClient(new Client(0));
        //}
        library.loanBook(library.getBooks().get(0), library.getClients().get(0));
        if(library.verifieLoan(library.getBooks().get(0)))
            System.out.println("Loan executed");
       
    
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
