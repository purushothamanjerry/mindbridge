package Day3;

abstract class Shape1
{
    abstract void calculateArea();
}

class Circle extends Shape1
{
   double r;
   Circle(int r)
   {
       this.r=r;
   }
    @Override
    void calculateArea() {
        System.out.println("Area of Circle is "+(3.14*r*r));
    }
}

class Rectangle1 extends Shape1
{
    double length;
    double width;
    Rectangle1(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
   void calculateArea()
   {
       System.out.println("Area of Rectangle : "+(length*width));
   }
}
public class AbstractClass1 {
    public static void main(String[] args) {
       Circle ci = new Circle(5);
       ci.calculateArea();
       Rectangle1 r1 = new Rectangle1(6,7);
       r1.calculateArea();
    }
}
