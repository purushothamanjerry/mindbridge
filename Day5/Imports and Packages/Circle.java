package shapes;

import static java.lang.Math.PI;

public class Circle {

	int radius;

	 public Circle(int radius) {
		this.radius=radius;
	}
	
	public void areaofcircle() {
	double area=PI*radius*radius;
	
	System.out.printf("Area of Circle"+" "+"%.2f",area);
	
	}
	
}
