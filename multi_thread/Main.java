package multi_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {
        int i=0;
        int ID=0;
        while(i++<10){
            long begin = System.currentTimeMillis();
            
            ExecutorService executor = Executors.newCachedThreadPool();
            for (int j = 0; j < 4; j++) {
                executor.execute(new ThreadClass(ID++));
            }
            executor.shutdown();
            long end = System.currentTimeMillis();
            System.out.println("Levou "+(end-begin)+" milisegundos");
        }
    }
    
}
