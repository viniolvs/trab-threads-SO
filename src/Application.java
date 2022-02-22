package src;

import java.util.ArrayList;

public class Application {
    private final ArrayList<Passenger> passengers;
    private final ArrayList<Driver> drivers;
    private final ArrayList<Ride> rides;

    public Application(){
        passengers = new ArrayList<Passenger>(); //registered passengers
        drivers = new ArrayList<Driver>(); //registered drivers
        rides = new ArrayList<Ride>(); //online rides
    }

    //driver makes your car available to passengers
    public void newRide (Driver driver){
        if (verifieDriver(driver)) {
            Ride ride = new Ride(driver);
            addRide(ride);   
        }
    }

    //passenger take an available ride
    public boolean takeRide(Passenger passenger) {

        if(!verifiePassenger(passenger)){
            System.out.println("Passenger not registered!");
            return false;
        }
        else if(rides.size()<=0){
            System.out.println("No available rides!");
            return false;
        }
        else{
            int index = searchAvailableCar();
            if (index!=-1){
                boolean test = rides.get(index).takeSeat(passenger);
                if(test){
                    System.out.println("Ride take succesfully!");
                    return true;
                }
                else{
                    System.out.println("Failure!");
                    return false;
                }
            }
            else
                System.out.println("All available cars are full!");
                return false;
        }
    }

    //find an available car in registered rides, returns index to rides list
    private int searchAvailableCar() {
        int index=-1;
        for (Ride ride : rides) {
            if (!ride.fullCar())
            {
                return ++index;
            }
            index++;
        }
        return 0;
    }

    private void addRide(Ride ride) {
        rides.add(ride);
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

    public ArrayList<Ride> getRides() {
        return rides;
    }

    private boolean verifieDriver(Driver driver) {
        return drivers.contains(driver);
    }

    private boolean verifiePassenger(Passenger p){
        return passengers.contains(p);
    }

}
