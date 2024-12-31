package Day3;
class Calculator
{
    void add(int num1,int num2)
    {
        System.out.println("Sum of two integer values "+(num1+num2));
    }
    void add(double num1,double num2)
    {
        System.out.println("Sum of two Double values "+(num1+num1));
    }
    void add(int num1,int num2,int num3)
    {
        System.out.println("Sum of three integer values "+(num1+num2+num3));
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
      Calculator cal1 = new Calculator();
      cal1.add(10,20);
      cal1.add(34.2,434.5);
      cal1.add(23,45,34);
    }
}
