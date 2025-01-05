package day7;


public class Squares implements Runnable {
    
	String name;
	
	public  Squares(String name) {
		this.name=name;
	}
	@Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + (i * i));
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}