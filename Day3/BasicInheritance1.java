package Day3;
class Person
{
  String name;
  int age;
  Person(String name,int age)
  {
      this.name=name;
      this.age=age;
  }
  void DispalyPersonDetails()
  {
      System.out.println("Person Name : "+name);
      System.out.println("Person Age : "+age);
  }
}
class Student extends Person
{
  int roolNo;
  double Marks;

  Student(String name,int age,int roolNo,double Marks)
  {
      super(name,age);
      this.roolNo=roolNo;
      this.Marks=Marks;
  }
  void DisplayStudentDetails()
  {
      DispalyPersonDetails();
      System.out.println("Student RollNo : "+roolNo);
      System.out.println("Student Mark : "+Marks);
  }
}
public class BasicInheritance1 {
    public static void main(String[] args) {
     Student s1 = new Student("Kavin",20,33,150);
     s1.DisplayStudentDetails();
    }
}
