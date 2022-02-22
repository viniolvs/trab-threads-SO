package mains;

import src.*;
import java.util.concurrent.Semaphore;
import java.lang.InterruptedException;


public class TakeRideThread implements Runnable{
    private Semaphore sem;
    private final Application app;
    private final Passenger passenger;
    private final Driver driver;

    public TakeRideThread(Application app, Passenger passenger, Driver driver, Semaphore sem){
        this.app = app;
        this.passenger = passenger;
        this.sem = sem;
        this.driver = driver;
    }

    public void run(){
        /*try {
            sem.acquire();
        } catch (InterruptedException e) {
            System.err.println("Interrupted Exception TakeRide Thread");
        }*/
        boolean aux = app.takeRide(driver, passenger);
        
        /*if(aux == true){
            System.out.println("Ride take succesfully!");
            //System.out.println("Passenger "+passenger.getName()+" taked one seat");
        }*/
        //sem.release();
    }
}