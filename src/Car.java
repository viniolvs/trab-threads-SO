package src;

public class Car {
    private String model;
    private int year;
    private String color;
    private String plate;

    public Car(int ID) {
        model = GenerateData.getModel(ID);
        year = GenerateData.getYear();
        color = GenerateData.getColor(ID);
        plate = GenerateData.getPlate();
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
}
