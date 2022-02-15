package src;


public class Client{
    private String name;
    private int clientID;
    private int loans;

    public Client(int ID){
        name = GenerateData.getName(ID);
        clientID = ID;
        loans = 0;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return clientID;
    }
    public int getLoans(){
        return loans;
    }
    public void addLoan() {
        loans++;
    }
    
}
