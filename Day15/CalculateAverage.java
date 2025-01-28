package Day15.Lambda;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double cgpa;
    private String department;

    public Student(int id, String name, double cgpa, String department) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class CalculateAverage {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vishnu", 8.32, "IT"));
        students.add(new Student(2, "Priyan", 8.01, "CSE"));
        students.add(new Student(3, "Krishnan", 7.67, "CSE"));

        
        double averageGpa = students.stream()
                .mapToDouble(Student::getCgpa) 
                .average()                    
                .orElse(0.0);                 

        System.out.printf("The average GPA is: %.2f%n", averageGpa);
    }
}
