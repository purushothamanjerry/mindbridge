/*Write a program that accepts a Consumer<Student> to increase each student's grade by 10.
Define a Student class and modify a list of Student objects.
Input:
  John: 70
  Alice: 60
Output :
  John: 80
  Alice: 70*/

package Day16;
import java.util.*;
import java.util.function.Consumer;

class MStudent {
    private String name;
    private int grade;

    public MStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void increaseGrade(int increment) {
        this.grade += increment;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class ModifyStudentGrades {

    ModifyStudentGrades(){
        List<MStudent> list = new ArrayList<>();
        MStudent s1 = new MStudent("sanji", 90);
        MStudent s2 = new MStudent("kavin", 80);
        MStudent s3 = new MStudent("jeeva", 60);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);
        Consumer<MStudent> consumergrade = (studentGrade) -> studentGrade.increaseGrade(10);
        list.forEach(consumergrade);
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ModifyStudentGrades modifyStudentGrades = new ModifyStudentGrades();
    }
}
