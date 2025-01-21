package Day15.Lambda;

import java.util.*;
import java.util.stream.Collectors;

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

public class StudentGroupBy {

    public StudentGroupBy() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vishnu", 8.32, "IT"));
        students.add(new Student(2, "Priyan", 8.01, "CSE"));
        students.add(new Student(3, "Shan", 7.67, "CSE"));
        students.add(new Student(4, "Pavi", 9.90, "IT"));
        students.add(new Student(5, "Gogul", 6.32, "EEE"));
        students.add(new Student(6, "Praveen", 7.32, "IT"));

        Map<String, Optional<Student>> topScorersByDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getCgpa))
                ));

        topScorersByDept.forEach((department, student) -> {
            student.ifPresent(s -> System.out.println(department + " - Top Scorer: " + s));
        });
    }

    public static void main(String[] args) {
        new StudentGroupBy();
    }
}
