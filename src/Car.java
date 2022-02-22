package src;

public class Car {
    private final String model;
    private final int year;
    private final String color;
    private final String plate;
    private final int seats;
    private int taken_seats;
    protected int[] passengers;
    

    public Car(int ID) {
        model = GenerateData.getModel(ID);
        year = GenerateData.getYear();
        color = GenerateData.getColor(ID);
        plate = GenerateData.getPlate();
        seats = 2;//GenerateData.getSeats();
        taken_seats = 0; 
        //vetor com ids de passageiros no carro
        passengers = new int[seats];
        
    }

    public boolean takeSeat(Passenger passenger) {
        if(taken_seats < seats){
            passengers[taken_seats++] = passenger.getID();
            return true;
        }
        return false;
    }

    public String getModel() {
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
        return "Car: "+model+" "+year+" "+color+" Seats: "+seats+ " Taken seats: "+taken_seats+" Passengers IDs: "+passengers[0]+" "+passengers[1];
    }
}
