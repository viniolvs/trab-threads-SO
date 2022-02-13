package mains;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import src.Client;


public class MultiThread {
    public static void main(String[] args) {
        
        long begin = System.currentTimeMillis();
        

        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
    
}
