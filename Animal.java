package day2;

public class Animal {

	
	    public void speak() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void speak() {
	        System.out.println("Dog says: Woof Woof");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void speak() {
	        System.out.println("Cat says: Meow Meow");
	    }
	

	    public static void main(String[] args) {
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();

	        myDog.speak();
	        myCat.speak();
	    }
	}

	

