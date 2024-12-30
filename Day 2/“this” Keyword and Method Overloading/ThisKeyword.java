package Day2;
class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void DisplayEmployeeDetails()
    {
        System.out.println("*****************************************");
        System.out.println("Employee Details");
        System.out.println("Employee Id : "+this.id);
        System.out.println("Employee name : "+this.name);
        System.out.println("Employee salary : "+this.salary);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Employee emp1 = new Employee(33,"KavinKumar",30000);
        Employee emp2 = new Employee(44,"Teddy",25000);
        emp1.DisplayEmployeeDetails();
        emp2.DisplayEmployeeDetails();
    }
}
