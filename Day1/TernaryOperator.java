import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = sc.nextInt();
        System.out.println((num%2==0) ? "Even Number" : "Odd Number");

    }
}
