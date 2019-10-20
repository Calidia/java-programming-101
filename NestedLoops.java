import java.util.Scanner;

public class NestedLoops
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number for length: ");
		int length = in.nextInt();
		System.out.println();
		System.out.print("Please enter a number for height: ");
		int height = in.nextInt();
		
		for (int i = 0; i < height; i++)
		{
			System.out.println();
			for (int j = 0; j < length; j++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
}