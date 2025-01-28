package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student { 
	private String name;
    private int grade;

    public Student(String name, int grade) { 
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() { 
        return grade;
    }

    public void setGrade(int grade) { 
        this.grade = grade; 
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }

    @Override
    public String toString() {
        return name +":"+ grade; 
    }
}

public class PassingGrades {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); 

        students.add(new Student("John", 75));
        students.add(new Student("Alice", 55));
        students.add(new Student("Mark", 88));

        printGrade(students, s -> s.getGrade()>60); 
    }

    public static void printGrade(List<Student> students, Predicate<Student> predicate) { 
        for (Student student : students) { 
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }
}
