package Day17;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        String name ="kavin";
        System.out.println("Initial name : "+name);
        UnaryOperator<String> unaryOperator = (str)-> str.toUpperCase();
        System.out.print("After UnaryOperation : ");
        System.out.println(unaryOperator.apply(name));
    }
}
