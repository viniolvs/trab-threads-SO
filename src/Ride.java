package src;

public class Ride {
    private final Driver driver;
    private final Passenger[] passengers;
    private int seats_taken;
    double price;

    public Ride(Driver driver){
        this.driver = driver;
        passengers = new Passenger[getCar().getSeats()];
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

    public boolean fullCar() {
        if (seats_taken >= getCar().getSeats())
            return true;
        else
            return false;
    }

    //pega um assento de um objeto Ride
    public boolean takeSeat(Passenger passenger) {
        if ( fullCar() || passenger.getBalance() < price){
            return false;
        }
        else {
            passenger.pay(price);
            passengers[seats_taken] = passenger;
            seats_taken++;
            return true;
        }
    }

    public void printString() {
        System.out.println(driver.toString());
        if (seats_taken>0){
            for (int i = 0; i < seats_taken; i++) {
                System.out.println(passengers[i].toString());
            }
        }
        
    }
}
