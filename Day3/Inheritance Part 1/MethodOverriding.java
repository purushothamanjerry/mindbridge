package Day3;
class Vehicle
{
    public void Start()
    {
        System.out.println("Starting Vehicles...");
    }
}
class Car extends Vehicle
{
    @Override
    public void Start() {
        super.Start();
        System.out.println("Starting Car...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
      Car c1 = new Car();
      c1.Start();
    }
}
