package Day3;
import java.util.*;
 interface Animal
{
  void Eat();
  void Sleep();
}
class Dog implements Animal {
    public void Eat()
    {
        System.out.println("Dog is Eating...");
    }
    public  void Sleep()
    {
        System.out.println("Dog is Sleeping...");
    }
}
class Cat implements Animal {
   public void Eat()
    {
        System.out.println("Cat is Eating...");
    }
  public void Sleep()
    {
        System.out.println("Cat is Sleeping...");
    }
}
public class BasicInterface {
    public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.Eat();
       d1.Sleep();
       Cat c1 = new Cat();
       c1.Eat();
       c1.Sleep();
    }
}
