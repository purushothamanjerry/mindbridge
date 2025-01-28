/*Create a BiConsumer<Integer, Integer> that takes two numbers and prints their sum.
Input:
3, 5
Output :
Sum of 3 and 5 is 8*/

package Day16;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerProblem {
    BiConsumerProblem(){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(10,20);
        map.put(20,30);
        map.put(30,40);
        BiConsumer<Integer,Integer> biConsumer = (num1,num2) -> System.out.println(num1+" + "+num2+" = "+(num1+num2));
        map.forEach(biConsumer);
    }

    public static void main(String[] args) {
        BiConsumerProblem biConsumerProblem = new BiConsumerProblem();
    }
}
