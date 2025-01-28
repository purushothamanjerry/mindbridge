package day6;


class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class Clone {
    public static void main(String[] args) {
        try {
            Student s = new Student("Purushothaman", 20);
            System.out.println("Original Student: " + s);

            Student clonedStudent = (Student) s.clone();
            System.out.println("Cloned Student: " + clonedStudent);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException occurred: " + e.getMessage());
        }
    }
}
