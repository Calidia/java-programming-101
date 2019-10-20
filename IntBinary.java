import java.util.Scanner;

public class IntBinary {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num;
		int rem;
		String binary = "";
		
		System.out.println("Please enter a number: ");
		num = in.nextInt();
		
		while (num != 0) {
			rem = num % 2; 
			if (rem == 1) {
				binary = "1" + binary;
			} else {
				binary = "0" + binary;
			}
			num = num/2;
		}
		
		System.out.println("The binary number is: " + binary);
	}
}