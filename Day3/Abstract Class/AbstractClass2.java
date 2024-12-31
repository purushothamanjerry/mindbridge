package Day3;

abstract class Appliance
{
    abstract void turnOn();
    void turnOff()
    {
        System.out.println("Appliance is Turning Off...");
    }
}
class Fan extends Appliance
{
    public void turnOn()
    {
        //super.turnOff();
        System.out.println("Fan is Turning On...");
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
         Fan f1 = new Fan();
         f1.turnOff();
        f1.turnOn();
    }
}
