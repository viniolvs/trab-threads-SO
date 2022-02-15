package src;

public class Driver extends User {
    private String driver_license;
    private String bank_account;
    
    public Driver(int ID){
        super(ID);
        driver_license = GenerateData.getDriverLicense();
        bank_account = GenerateData.getBankAccount();
    }

    protected String getLicense() {
        return driver_license;
    }
    protected String getBankAccouunt() {
        return bank_account;
    }

}