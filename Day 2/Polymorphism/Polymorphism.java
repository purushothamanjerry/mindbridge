package Day2;
class Calculate
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int[] a)
    {
        int sum=0;
        for(int b : a)
        {
            sum+=b;
        }
        return sum;
    }
    double add(double[] a)
    {
        double sum=0;
        for(double b:a)
        {
            sum=sum+b;
        }
        return sum;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Calculate num = new Calculate();
        System.out.println(num.add(5,10));
        System.out.println(num.add(600.0,400.0));
        int arr[]={10,20,30,40,100};
        System.out.println(num.add(arr));
        double arr1[]={34.0,56.0,234.4,89.43};
        System.out.println(num.add(arr1));
    }
}
