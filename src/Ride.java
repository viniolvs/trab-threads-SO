package src;

public class Ride {
    private final Driver driver;
    private Passenger[] passengers;
    private int seats_taken;
    double price;

    public Ride(Driver driver){
        this.driver = driver;
        passengers = new Passenger[driver.getCar().getSeats()];
        seats_taken = 0;
    }

    public Car getCar() {
        return driver.getCar();
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getSeatsTaken() {
        return seats_taken;
    }

    //pega um assento de um objeto Ride
    public boolean takeSeat(Passenger passenger) {
        if (seats_taken >= getCar().getSeats() || passenger.getBalance() < price){
            return false;
        }
        else {
            passenger.setBalance(price);
            passengers[seats_taken++] = passenger;
            return true;
        }
    }
}
