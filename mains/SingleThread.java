package mains;

import src.*;

public class SingleThread {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        
        Application app = new Application();
        
        for (int i = 0; i < 40; i++) {
            app.addPassenger(new Passenger(i));
        }
    
        for (int i = 40; i < 50; i++) {
            app.addDriver(new Driver(i));
        }

        for (int i=0; i < 10; i++) {
            app.newRide(app.getDrivers().get(i));
        }

        for (int i = 0; i < 40; i++) {
            app.takeRide(app.getPassengers().get(i%10));
        }
       
        for (int i = 0; i < 10; i++) {
            System.out.println("Ride "+i+": ");
            app.getRides().get(i).printString();
        }

        
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
