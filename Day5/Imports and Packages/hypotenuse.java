package shapes;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class hypotenuse {
int a;
int b;
	public hypotenuse(int a,int b) {
		this.a=a;
		this.b=b;
	}
	double calculatehypotenuse() {
		double c=sqrt(pow(a,2)+pow(b,2));
		return c;
	}
	public static void main(String[] args) {
		
		hypotenuse h=new hypotenuse(2,4);
		
		System.out.printf("%.2f",h.calculatehypotenuse());
	}
}
