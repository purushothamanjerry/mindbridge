package Day3;

import java.awt.color.ICC_ColorSpace;

interface Printer
{
    void print();
}
interface Scanners
{
    void scan();
}
 class AllInOne implements Printer,Scanners{
   public void print()
   {
       System.out.println("Interface Printer Method Running in class AllInOne");
   }
   public void scan()
   {
       System.out.println("Interface Scanner Method Running in class AllInOne");
   }
}
public class MultipleInterface {
    public static void main(String[] args) {
      AllInOne a1 = new AllInOne();
      a1.print();
      a1.scan();
    }
}
