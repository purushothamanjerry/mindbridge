package Day17;
import java.lang.Math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class StaticMethodReference {

    public static void FindSquareRoot(List<Integer> list)
    {
        DoubleFunction<Double> doubleFunction=Math::sqrt;
        for(int list1 : list)
        {
            double res = doubleFunction.apply(list1);
            System.out.println("SquareRoot "+list1+" : "+doubleFunction.apply(list1));
        }
    }

//    public static void sqrt()
//    {
//
//    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
 FindSquareRoot(list);
    }
}
