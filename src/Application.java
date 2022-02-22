package src;

import java.util.ArrayList;

public class Application {
    private final ArrayList<Passenger> passengers;
    private final ArrayList<Driver> drivers;

    public Application(){
        passengers = new ArrayList<Passenger>(); //registered passengers
        drivers = new ArrayList<Driver>(); //registered drivers
    }


    //passenger take an available ride
    public boolean takeRide(Driver driver, Passenger passenger) {
        boolean full = false;
        for (Driver aux : drivers) {
            if (driver.getID() == aux.getID()){
                full = driver.getCar().takeSeat(passenger);
            }
        }
        if (!full){
            System.out.println("Car already full!");
            return false;
        }
        return true;
    }
    
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
    
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public ArrayList<Driver> getDrivers() {
        return drivers;
    }
}
