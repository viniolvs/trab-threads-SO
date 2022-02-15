package src;

public class Car {
    private String model;
    private int year;
    private String color;
    private String plate;
    private int seats;
    private Driver driver;
    

    public Car(Driver driver, int ID) {
        this.driver = driver;
        model = GenerateData.getModel(ID);
        year = GenerateData.getYear();
        color = GenerateData.getColor(ID);
        plate = GenerateData.getPlate();
        seats = 3;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getTitle() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getPlate(){
        return plate;
    }
    public String getColor() {
        return color;
    }
    public int getSeats() {
        return seats;
    }
}
