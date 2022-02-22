package src;


public class User{
    private final String name;
    private final int ID;
    private final String CPF;

    public User(int ID){
        name = GenerateData.getName(ID);
        this.ID = ID;
        CPF = GenerateData.getCPF();
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public String getCPF() {
        return CPF;
    }
    
}
