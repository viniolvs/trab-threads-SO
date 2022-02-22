package src;

public class Driver extends User {
    private final String driver_license;
    private final String bank_account;
    private final Car car;
    private boolean online;
    
    public Driver(int ID){
        super(ID);
        car = new Car(ID);
        driver_license = GenerateData.getDriverLicense();
        bank_account = GenerateData.getBankAccount();
        online = true;
    }

    public boolean getStatus() {
        return online;
    }
    public void setOffline() {
        online = false;
    }
    public void setOnline() {
        online = true;

    }
    public Car getCar() {
        return car;
    }
    protected String getLicense() {
        return driver_license;
    }
    protected String getBankAccouunt() {
        return bank_account;
    }

    @Override
    public String toString() {
        return "Driver: "+getName()+" ";
    }
}