package day6;


class Student implements Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
            Student originalStudent = new Student("John Doe", 20);
            System.out.println("Original Student: " + originalStudent);

            Student clonedStudent = (Student) originalStudent.clone();
            System.out.println("Cloned Student: " + clonedStudent);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException occurred: " + e.getMessage());
        }
    }
}
