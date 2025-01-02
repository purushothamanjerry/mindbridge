import java.util.*;
public class LogicRelational {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer Numbers : ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        boolean a = num1>num2;
        boolean b =num2<num1;
        if(a && b)
        {
            System.out.println(num1+" is greater");
        }
        else if(!(num2<num1))
        {
            System.out.println(num2+" is greater");
        }
        else {
            System.out.println("Both number are equal");
        }
    }
}
