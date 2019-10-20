import java.util.Scanner;

public class LegalDM {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Declaring variables
		int day;
		int month;
		
		//Asking for the needed information
		System.out.println("Enter a number for the day: ");
		day = in.nextInt();
		System.out.println("Enter a number for the month: ");
		month = in.nextInt();
		
		
		
		if ((month >= 1) && (month <= 12)) {
			if ((month == 2)  && ((day >= 1) && (day <= 28))) {
				System.out.println(day + "." + month + "is a legal date.");
			} else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && ((day >= 1) && (day <= 30))) {
				System.out.println(day + "." + month + " is a legal date.");
			} else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day >= 1) && (day <= 31)) {
				System.out.println(day + "." + month + " is a legal date.");
			} else {
				System.out.println(day + "." + month + " is not a legal date.");
			}
		} else {
			System.out.println(day + "." + month + " is not a legal date.");
		}
	}
}