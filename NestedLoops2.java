import java.util.Scanner;

public class NestedLoops2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number for length: ");
		int length = in.nextInt();
		System.out.println();
		System.out.print("Please enter a number for height: ");
		int height = in.nextInt();
		
		for (int i = 1; i <= height; i++)
		{
			System.out.println();
			for (int j = 1; j <= length; j++)
			{
				if(((j ==1) || (j == length)) || ((i == 1) || (i == height)))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}