package Day1;
import java.util.*;
public class BitwiseOperatorsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int left = no1 << 2;
        int right = no1 >> 2;
        System.out.println("Left : " + left);
        System.out.println("Right : " + right);

        int no2 = sc.nextInt();
        ;
        int result = no1 ^ no2;
        System.out.println(no1 + "^" + no2 + " = " + result);
    }
}
