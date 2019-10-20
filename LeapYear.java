import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = in.nextInt();
		
		//% is the remainder operator,
		//!= is the not equals operator
		
		if ((year % 100 == 0) && (year % 400 != 0)) {
			System.out.println("Not a leap year.");
		} else if (year % 4 != 0) {
			System.out.println("Not a leap year.");
		} else {
			System.out.println("Leap year.");
		}
	}

}