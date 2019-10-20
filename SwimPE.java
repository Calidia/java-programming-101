import java.util.Scanner;

public class SwimPE
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Declaring constants
		double EXCAVATION_COST = 20.0;
		double LINING_COST = 10.0;
		double TILING_COST = 20.0;
		double PUMPS_FILTERS = 2000.0;
		
		//User input
		System.out.print("Please enter the lenght of the pool: ");
		double lenght = in.nextDouble();
		System.out.print("Please enter the width of the pool: ");
		double width = in.nextDouble();
		System.out.print("Please enter the depth of the pool: ");
		double depth = in.nextDouble();
		
		//Calculating the price 
		double excavation = lenght * width * depth * EXCAVATION_COST;
		double surfaceArea = (lenght * width) + (2 * (depth * width)) + (2 * (lenght * depth));
		double lining = surfaceArea * LINING_COST;
		double tiling = surfaceArea * TILING_COST;
		double total = excavation + tiling + lining + PUMPS_FILTERS;
		
		//Prints the total price
		System.out.println("Estimate cost: " + total + " pounds");
	}
}	