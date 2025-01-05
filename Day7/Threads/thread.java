package day7;

public class thread {
    public static void main(String[] args) {
        Numbers number = new Numbers("Thread One");
        Squares square = new Squares("Thread Two");
        
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(square);

        t1.start(); 
        t2.start(); 

        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Both threads have finished execution.");
    }
}
