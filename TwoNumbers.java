import java.util.Scanner;
import javax.swing.JOptionPane;

public class TwoNumbers {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1 = Integer.parseInt(
			JOptionPane.showInputDialog("Please enter the first number: "));
		int num2 = Integer.parseInt(
			JOptionPane.showInputDialog("Please enter the second number: "));

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null,"The first number is greater than the second one.","Maximum of Two Numbers", JOptionPane.PLAIN_MESSAGE);
		} else if (num1 == num2) {
			JOptionPane.showMessageDialog(null,"The numbers are equal.","Maximum of Two Numbers", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,"The second number is greater than the first one.","Maximum of Two Numbers", JOptionPane.PLAIN_MESSAGE);
		}
	}

}