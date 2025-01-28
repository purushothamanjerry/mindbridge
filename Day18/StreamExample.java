package Day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExample {

    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();

        Student stu1 = new Student("Barani", "Computer Science", new int[]{85, 90, 78, 88, 92});
        Student stu2 = new Student("Aadhi", "Mathematics", new int[]{70, 75, 80, 65, 60});
        Student stu3 = new Student("Vijay", "Physics", new int[]{89, 95, 90, 99, 91});
        Student stu4 = new Student("Ganesh", "Mathematics", new int[]{85, 80, 75, 70, 65});
        Student stu5 = new Student("Kavin", "Computer Science", new int[]{90, 90, 98, 92, 97});
        Student stu6 = new Student("Sanjay", "Physics", new int[]{45, 55, 40, 29, 49});
        Student stu7 = new Student("Udhaya", "Mathematics", new int[]{75, 70, 80, 78, 85});
        Student stu8 = new Student("Jerry", "Computer Science", new int[]{80, 85, 88, 75, 90});
        Student stu9 = new Student("Tom", "Physics", new int[]{60, 65, 70, 75, 80});
        Student stu10 = new Student("Arjun", "Mathematics", new int[]{55, 60, 65, 70, 75});

        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);
        stuList.add(stu5);
        stuList.add(stu6);
        stuList.add(stu7);
        stuList.add(stu8);
        stuList.add(stu9);
        stuList.add(stu10);

        stuList.forEach(System.out::println);
        System.out.println("________________________________________________________________________");
        System.out.println("\nTop 3 Students based on average marks:");
        top_three(stuList); 

        System.out.println("________________________________________________________________________");
        System.out.println("average marks for each department.");
        average_marks(stuList);

        System.out.println("________________________________________________________________________");
        System.out.println("Top students in each department");
        top_students(stuList);

        System.out.println("________________________________________________________________________");
        System.out.println("Count of students failed in each department:");
        failed(stuList);
        
    }

    public static void top_three(List<Student> students) {
        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getAverage(), s1.getAverage())) // Sort based on average marks
                .limit(3) 
                .forEach(System.out::println); 
    }
    
    public static void average_marks(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, 
                        Collectors.averagingDouble(Student::getAverage) 
                ))
                .forEach((department, averageMarks) ->System.out.println(department + " : " + averageMarks));


    }   public static void top_students(List<Student> students) {
        students.stream()
        .collect(Collectors.groupingBy(
                Student::getDepartment, 
                Collectors.collectingAndThen(
                        Collectors.maxBy((s1, s2) -> Double.compare(s1.getAverage(), s2.getAverage())), 
                        student -> student.orElse(null) 
                )
        ))
        .forEach((department, topStudent) -> {
            if (topStudent != null) {
                System.out.println(department + " : " + topStudent.getName() + " average marks " + topStudent.getAverage());
            }
        });
}
    public static void failed(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, 
                        Collectors.filtering(student -> student.getAverage() < 50, Collectors.counting()) 
                ))
                .forEach((department, count) -> System.out.println(department + " : " + count + " failed"));
    }


    }
