package Day18;

import java.util.Arrays;

public class Student {

    private String name;
    private String department;
    private int[] marks; 
    private char grade;

    public Student(String name, String department, int[] marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int calculateTotal() {
        return Arrays.stream(marks).sum(); 
    }
    public double getAverage() {
        return Arrays.stream(marks).average().orElse(0.0);
       }

    public String getGrade() {
        //double avgMarks = Arrays.stream(marks).average().orElse(0.0);
    	double avgMarks =getAverage();
        if (avgMarks >= 90)
            return "A";
        else if (avgMarks >= 80)
            return "B";
        else if (avgMarks >= 70)
            return "C";
        else
            return "D";
    }
    

    @Override
    public String toString() {
        return "Name='" + name + "', Department='" + department + "', Marks=" + Arrays.toString(marks) 
                + ", TotalMarks=" + calculateTotal() + ", Grade=" + getGrade();
    }
}
