package Day15.Lambda;


import java.util.ArrayList;
import java.util.List;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' +
                ", cgpa=" + cgpa + ", department='" + department + '\'' + '}';
    }
}

public class FindStudents {

    public static List<Student> findStudentsByLetter(List<Student> students, char letter) {
        return students.stream()
                .filter(student -> student.getName().startsWith(String.valueOf(letter))) 
                .collect(Collectors.toList()); 
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vishnu", 8.32, "IT"));
        students.add(new Student(2, "Priyan", 8.01, "CSE"));
        students.add(new Student(3, "krishanan", 7.67, "CSE"));
        students.add(new Student(4, "Pavi", 9.90, "IT"));
        students.add(new Student(5, "Arjun", 6.32, "EEE"));
        students.add(new Student(6, "Praveen", 7.32, "IT"));

        char letter = 'P'; 
        List<Student> filteredStudents = findStudentsByLetter(students, letter);

        System.out.println("Students whose names start with '" + letter + "':");
        filteredStudents.forEach(System.out::println);
    }
}
