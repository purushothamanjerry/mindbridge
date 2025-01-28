package day7;

class SharedPrinter {

    public synchronized void printString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + str);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void printCountdown(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + ": Countdown " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void staticPrintString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void staticPrintCountdown(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + ": Countdown " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ObjectAndMethodLocking {

    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread t1 = new Thread(() -> printer.printString("jerry"));
        Thread t2 = new Thread(() -> printer.printCountdown(5));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread t3 = new Thread(() -> SharedPrinter.staticPrintString("tom"));
        Thread t4 = new Thread(() -> SharedPrinter.staticPrintCountdown(5));

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program execution completed.");
    }
}
