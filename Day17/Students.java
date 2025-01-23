package Day17;
public class Students {
    String name;
    double grade;
    String dept;
    int marks;
    Students(String name, double grade)
    {
        this.name=name;
        this.grade=grade;
    }
    Students(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    Students(String name, double grade, String dept)
    {
        this.name=name;
        this.grade=grade;
        this.dept=dept;
    }

    public Students() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getGrade() {
        return grade;
    }

    public Students setGrade(double grade) {
        this.grade = grade;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public  void DisplayStudentsMarksDetails()
 {
     System.out.println("Name : "+this.name+" Marks : "+this.marks);
 }

    @Override
    public String toString() {
        return
                "[name='" + name + '\'' +
                        ", grade=" + grade +"]";
    }
}
