package mains;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import src.*;


public class MultiThread {
    public static void main(String[] args) {
        
        long begin = System.currentTimeMillis();
        Semaphore sem = new Semaphore(1);            
        Application app = new Application();
       
        for (int i = 0; i < 40; i++) {
            app.addPassenger(new Passenger(i));
        }
    
        for (int i = 40; i < 60; i++) {
            app.addDriver(new Driver(i));
        }
       

        int i = 0;
        ExecutorService executor = Executors.newCachedThreadPool();
        for (i = 0; i + 2 < 6; i++) {
                executor.execute(new TakeRideThread(app, app.getPassengers().get(i), app.getDrivers().get(0), sem));                
                executor.execute(new TakeRideThread(app, app.getPassengers().get(i+1), app.getDrivers().get(0), sem));
                executor.execute(new TakeRideThread(app, app.getPassengers().get(i+2), app.getDrivers().get(0), sem));
            }
        
            /*executor.execute(new TakeRideThread(app, app.getPassengers().get(i), app.getDrivers().get(0), sem));                
            executor.execute(new TakeRideThread(app, app.getPassengers().get(i+1), app.getDrivers().get(0), sem));
            executor.execute(new TakeRideThread(app, app.getPassengers().get(i+2), app.getDrivers().get(0), sem));
            */
            executor.shutdown();


        System.out.println("========================");
        for (int j = 0; j < 1; j++) {
            System.out.println(app.getDrivers().get(j%20).toString()+" "+app.getDrivers().get(j%20).getCar().toString());
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
    
}
