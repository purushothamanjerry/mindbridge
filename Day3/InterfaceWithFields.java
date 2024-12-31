package Day3;
interface Constants
{
    static final double PI = 3.14;
}
class circle1 implements Constants
{
    int r;
    circle1(int r)
    {
        this.r=r;
    }
    void CalculateArea()
    {
        System.out.println("Area of Circle : "+(PI*r*r));
    }
}
public class InterfaceWithFields {
    public static void main(String[] args) {
        circle1 cir = new circle1(5);
        cir.CalculateArea();
    }
}
