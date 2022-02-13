package multi_thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import single_thread.Client;


public class Main {
    public static void main(String[] args) {
        
        long begin = System.currentTimeMillis();
        

        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
    
}
