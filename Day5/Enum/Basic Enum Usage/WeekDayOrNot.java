package day4;

import java.util.Scanner;

public class  WeekDayOrNot{
	
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    String day=scanner.nextLine();
		
		Day today=Day.valueOf(day);
		
		switch(today){
		case Saturday:
			System.out.println("It's a weekend");
			break;
		case Sunday:
			System.out.println("It's a weekend");
			break;
		default:
			System.out.println("It's a weekday");
		}
		
	}

}
