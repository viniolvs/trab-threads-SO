package src;

public class Passenger extends User{
    private String credit_card;
    public Passenger(int ID) {
        super(ID);
        credit_card = GenerateData.getCreditCard();
    }
    
    protected String getCreditCard() {
        return credit_card;
    }
}
