package src;


public class User{
    private String name;
    private int ID;
    private String CPF;

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
