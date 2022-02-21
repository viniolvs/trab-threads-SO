package src;

public class Driver extends User {
    private String driver_license;
    private String bank_account;
    private Car car;
    
    public Driver(int ID){
        super(ID);
        car = new Car(ID);
        driver_license = GenerateData.getDriverLicense();
        bank_account = GenerateData.getBankAccount();
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

}