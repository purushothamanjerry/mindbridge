package day7.additionals;



class Arithmetic{
    int add(int number1, int number2){
        return number1+number2;
    }
}
class Adder extends Arithmetic{}

public class p7 {
    public static void main(String[] args) {
        Adder no = new Adder();
        System.out.println("My superclass is: " + no.getClass().getSuperclass().getName());
        System.out.println(no.add(10,10)+" "+ no.add(20,20)+" "+ no.add(30,30));
    }
}
