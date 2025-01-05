package day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int a=s.nextInt();
            int b =s.nextInt() ;

            int c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Program executed.");
        }
    }
}
