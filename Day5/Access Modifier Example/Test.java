import day4.Person;

public class TestAccess extends Person {
	
	public Test(String name, int age, String address, int salery) {
		super(name, age, address, salery);
	}


	public static void main(String[] args) {
		
		Test p =new Test("Tom", 21, "Chennai",65000);
		

	
	System.out.println(p.name);
	System.out.println(p.age);
	//System.out.println(p.salery);
	//System.out.println(p.address);
	
	}
}
