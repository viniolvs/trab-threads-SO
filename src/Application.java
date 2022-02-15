package src;

import java.util.ArrayList;

public class Application {
    private final ArrayList<Passenger> passengers;
    private final ArrayList<Car> cars;
    private final ArrayList<Ride> rides;

    public Application(){
        passengers = new ArrayList<Passenger>();
        cars = new ArrayList<Car>();
        rides = new ArrayList<Ride>();
    }

    public boolean takeRide (Car car, Passenger passenger){
        if (verifieCar(car) && verifiePassenger(passenger)) {
            Ride ride = new Ride(car);
            if(ride.takeSeat(passenger)){
                addRide(ride);
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
    
    public void addCar(Car car) {
        cars.add(car);
    }

    private void addRide(Ride ride) {
        rides.add(ride);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    private boolean verifieCar(Car car) {
        return cars.contains(car);
    }

    private boolean verifiePassenger(Passenger p){
        return passengers.contains(p);
    }

}
