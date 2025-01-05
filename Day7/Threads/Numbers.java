package day7;

public class Numbers implements Runnable {
	String name;
	public Numbers(String name) {
	this.name=name;
	}
	
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

	
}

