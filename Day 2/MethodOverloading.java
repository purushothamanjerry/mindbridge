package Day2;
class Calculator
{
    public double area(int r)
    {
        return 3.14*r*r;
    }
    public double area(double length,int width)
    {
        return length*width;
    }
    public double area(int base,int height)
    {
        return 0.5*base*height;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator num = new Calculator();
        double circle = num.area(5);
        System.out.println("Area of circle : "+circle);
        double rectangle = num.area(5,6);
        System.out.println("Area of Rectangle : "+rectangle);
        double triangle = num.area(5,9);
        System.out.println("Area of Triangle : "+triangle);
    }
}
