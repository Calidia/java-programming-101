import java.util.Scanner;

public class OddN
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n;
		int sum = 0;
		int rem;
		
		System.out.print("Please enter a number: ");
		n = in.nextInt();
		
		rem = n % 2;
		
		if (rem == 0)
		{
			n ++;
		}
		
		for (int i = 1; i <= n; i += 2)
		{
			//rem = i % 2;
			//if (rem == 1)
			//{
				sum += i;
			//}
			System.out.println();
		}
			
		System.out.println("The sum of the odd numbers up to " + n + " is: " + sum);
	}
}