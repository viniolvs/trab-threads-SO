package src;

public class Car {
    private String model;
    private int year;
    private String color;
    private String plate;
    private int seats;
    

    public Car(int ID) {
        model = GenerateData.getModel(ID);
        year = GenerateData.getYear();
        color = GenerateData.getColor(ID);
        plate = GenerateData.getPlate();
        seats = GenerateData.getSeats();
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
