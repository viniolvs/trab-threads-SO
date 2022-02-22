package mains;

import src.*;

public class SingleThread {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        
        Application app = new Application();
        /*
        for (int i = 0; i < 40; i++) {
            app.addPassenger(new Passenger(i));
        }
    
        for (i = 40; i < 50; i++) {
            app.addDriver(new Driver(i));
        }

        for (i=0; i < 10; i++) {
            app.newRide(app.getDrivers().get(i));
        }

        for (int i = 0; i < 40; i++) {
            app.takeRide(app.getPassengers().get(i%10));
        }
       
        System.out.println(app.getRides().toString());

        
        
        */

        /*Driver driver = new Driver(0);
        Passenger passenger = new Passenger(0);
        Ride ride = new Ride(driver);

        System.out.println(driver.getCar().toString());

        app.addDriver(driver);
        app.addPassenger(passenger);
        app.newRide(driver);

        app.takeRide(passenger);

        app.getRides().get(0).printString();*/
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
