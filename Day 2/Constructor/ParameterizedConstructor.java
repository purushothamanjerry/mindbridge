package day2;
class Student
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void DisplayStudentDetails()
    {
        System.out.println("********************************");
        System.out.println("Student Name : "+this.name);
        System.out.println("Student age : "+this.age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
     Student std1 = new Student("Purushothaman",21);
     Student std2 = new Student("Jerry",20);
     std1.DisplayStudentDetails();
     std2.DisplayStudentDetails();
    }
}
