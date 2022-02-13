package mains;

public class SingleThread {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        

        long end = System.currentTimeMillis();
        System.out.println("Levou "+(end-begin)+" milisegundos");
    }
}
