package day7;

public class Person {

	String name;
	double salery;
	public Person() {
	}
	public Person(String name,double salery) {
	this.name=name;
	this.salery=salery;
	}
	public double bonus() {
		return salery/0.10;
	}
	
	
	
}
