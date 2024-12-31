package Day3;
class Employee
{
    public void CalculateSalary()
    {
        System.out.println("Calculating Employee Salary...");
    }
}
class Manager extends Employee
{
   public void CalculateSalary()
   {
       System.out.println("Manager Annual Salary is 10LPA...");
   }
}
class Developer extends Employee
{
    public  void CalculateSalary()
    {
        System.out.println("Developer Annual Salary is 5LPA...");
    }
}
public class RumTimePolymorphism {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.CalculateSalary();
        Manager m1 = new Manager();
        m1.CalculateSalary();
        Developer d1 = new Developer();
        d1.CalculateSalary();;
    }
}
