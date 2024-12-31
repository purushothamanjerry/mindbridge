package Day3;
interface Vehicles
{
    void start();
}
interface FourWheeler extends Vehicles
{
   void turnOnMusic();
}
interface twoWheeler extends Vehicles
{
    void petrolCheck();
}
class car implements FourWheeler
{
   public void start()
    {
        System.out.println("Car is Starting...");
    }
   public void turnOnMusic()
    {
        System.out.println("Music Start to Play...");
    }
}
class Bike implements twoWheeler
{
    public void start()
    {
        System.out.println("Bike is Starting...");
    }
    public void petrolCheck()
    {
        System.out.println("Tank Full...");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
          FourWheeler c1 = new car();
          c1.start();
          c1.turnOnMusic();
          twoWheeler t1 = new Bike();
          t1.start();
          t1.petrolCheck();
    }
}
