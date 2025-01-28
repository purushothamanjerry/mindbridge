package Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class InstanceMethodReference {

    public static void main(String[] args) {
        List<Students> name = new ArrayList<>();
        Students stu = new Students("Kavin",0.0);
        Students stu1 = new Students("Kumar",0.0);
        Students stu2= new Students("Teddy",0.0);
        name.add(stu);
        name.add(stu1);
        name.add(stu2);
//         List<Double> grades = new ArrayList<>();
//         grades.add(70.0);
//        grades.add(80.0);
//        grades.add(90.0);
        for(Students ref:name)
        {
            System.out.println(ref);
        }
        System.out.println("-----------------------------------------------------");
        BiFunction<Students,Double,Students> biFunction = (stud,grade)-> stud.setGrade(grade);
        System.out.println(biFunction.apply(stu,70.0));
        System.out.println(biFunction.apply(stu1,70.0));
        System.out.println(biFunction.apply(stu2,70.0));


    }
}
