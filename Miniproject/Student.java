package StudentManagement;

public class Student {
	
	private int  id;
	private String name;
	private int age;
	private char grade;
	private String email;
	public Student(int id, String name, int age, char grade, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Id:"+id+" "+"Name:"+name+" "+"Age:"+age+" "+"Grade:"+grade+" "+"Email:"+email;
	}
	
	

}
