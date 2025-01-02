package day4;

public class Employee extends Person {
	
	

	public Employee(String name, int age, String address, int salery) {
		super(name, age, address, salery);
	}
	public static void main(String[] args) {
		
	
	

	Person p=new Person("jerry",21,"Erode",440000);
	System.out.println(p.name);
	System.out.println(p.age);
	//System.out.println(p.salery);
	System.out.println(p.address);
	

	}
}
