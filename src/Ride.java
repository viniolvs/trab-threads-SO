package src;

public class Ride {
    private final Car car;
    private Passenger[] passengers;
    private int seats_taken;

    public Ride(Car car){
        this.car = car;
        passengers = new Passenger[car.getSeats()];
        seats_taken = 0;
    }

    public Car getCar() {
        return car;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public int getSeatsTaken() {
        return seats_taken;
    }

    public boolean takeSeat(Passenger passenger) {
        if (seats_taken >= car.getSeats()){
            return false;
        }
        else {
            passengers[seats_taken++] = passenger;
            return true;
        }
    }
}
