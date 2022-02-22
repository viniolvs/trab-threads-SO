package src;

public class Car {
    private final String model;
    private final int year;
    private final String color;
    private final String plate;
    private final int seats;
    

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

    @Override
    public String toString() {
        return "Car: "+model+" "+year+" "+color+" Seats: "+seats;
    }
}
