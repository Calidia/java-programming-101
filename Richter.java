import java.util.Scanner;

public class Richter {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		double richter = in.nextDouble();
		
		if (richter >= 8.0) {
			System.out.println("Most structures fall.");
		} else if (richter >= 7.0) {
			System.out.println("Many buildings fall.");
		} else if (richter >= 6.0) {
			System.out.println("Many buildings considerably damaged.");
		} else if (richter >= 4.5) {
			System.out.println("Damage to poorly constructed buildings.");
		} else {
			System.out.println("No destruction to buildings.");
		}
			
	}
}