package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Type3 {
    public static void main(String[] args) {
        Students stu = new Students("Kavin",89);
        Students stu1= new Students("Kumar",99);
        List<Students> list = new ArrayList<>();
        list.add(stu);
        list.add(stu1);

       list.forEach(Students::DisplayStudentsMarksDetails);
    }
}
