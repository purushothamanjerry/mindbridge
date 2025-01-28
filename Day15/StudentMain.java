package Day15.Lambda;

import java.util.ArrayList;
import java.util.Collections;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' +
                ", cgpa=" + cgpa + ", department='" + department + '\'' + '}';
    }
}

public class StudentMain {

    public StudentMain() {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(1, "Vishnu", 8.32, "IT"));
        stu.add(new Student(2, "Priyan", 8.01, "CSE"));
        stu.add(new Student(3, "Shan", 7.67, "CSE"));
        stu.add(new Student(4, "Pavi", 9.90, "IT"));
        stu.add(new Student(5, "Gogul", 6.32, "EEE"));
        stu.add(new Student(6, "Praveen", 7.32, "IT"));


        Collections.sort(stu, (student1, student2) -> Double.compare(student2.getCgpa(), student1.getCgpa()));

        stu.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new StudentMain();
    }
}
