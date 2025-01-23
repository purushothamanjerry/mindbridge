package Day17;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void findMaxNumber(int num1,int num2)
    {
        BinaryOperator<Integer> binaryOperator = (n1,n2)-> (n1>n2)?n1:n2 ;
        System.out.println("Largest Number in ("+num1+","+num2+") :"+binaryOperator.apply(num1,num2));
    }
    public static void main(String[] args) {
        int num1 =10,num2=20;
        findMaxNumber(num1,num2);
    }
}
