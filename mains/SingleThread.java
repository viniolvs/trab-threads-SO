package mains;

import src.*;

public class SingleThread {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        
        Application app = new Application();
        int ID = 0;

        for (; ID < 40; ID++) {
            app.addPassenger(new Passenger(ID));
        }
        
        for (; ID < 60; ID++) {
            app.addDriver(new Driver(ID));
        }

        
        for (int i = 0; i < 40; i++) {
            app.takeRide(app.getDrivers().get(i%20), app.getPassengers().get(i));
            System.out.println(app.getDrivers().get(i%20).toString()+" "+app.getDrivers().get(i%20).getCar().toString());    
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
