package mains;

import src.*;

public class SingleThread {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        Application app = new Application();

        for (int i = 0; i < 20; i++) {
            if (i<10)
                app.addCar(new Car(new Driver(i), i));
            app.addPassenger(new Passenger(i));
        }
    
        for (int i = 0; i < 10; i++) {
            app.takeRide(app.getCars().get(i), app.getPassengers().get(i));
        }


       
       
    
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
