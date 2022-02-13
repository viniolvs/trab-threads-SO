package src;

public class Client{
    private String name;
    private int clientID;
    private Book[] loans;

    public Client(int ID){
        name = GenerateData.getName(ID);
        clientID = ID;
    }
    
}
