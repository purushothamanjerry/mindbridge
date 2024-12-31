package Day3;
class Animal1
{
    void Speak()
    {
        System.out.println("Each animal will give each sound");
    }
}
class Dog1 extends Animal1
{
    void Speak()
    {
        System.out.println("Dog will Bark");
    }
}
class Cat1 extends Animal1
{
    void Speak()
    {
        System.out.println("Cat will Meow");
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args) {
        Animal1 sound1 = new Animal1();
        Dog1 sound2 = new Dog1();
        Cat1 sound3 = new Cat1();
        sound1.Speak();
        sound2.Speak();
        sound3.Speak();

    }
}

