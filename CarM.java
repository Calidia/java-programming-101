import java.util.Scanner;

public class CarM
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Declaring variables
		double totalMileage;
		double distanceToWork;
		int weeksWorkedPerYear;
		int daysWorkedPerWeek;
		
		//Inputting the required information 
		System.out.print("Please enter the car's total mileage for this year: ");
		//Why if I enter the requested number with space it outputs the next two questions together?
		totalMileage = in.nextDouble();
		System.out.print("Please enter the distance to work: ");
		distanceToWork = in.nextDouble();
		System.out.print("Please enter the weeks worked for this year: ");
		weeksWorkedPerYear = in.nextInt();
		System.out.print("Please enter the days worked per week: ");
		daysWorkedPerWeek = in.nextInt();
		
		//Calculates the miles that weren't for commuting to work
		double totalDistancePerDay = distanceToWork * 2.0;
		int totalDaysWorked = weeksWorkedPerYear * daysWorkedPerWeek;
		double milesWork = totalDistancePerDay * totalDaysWorked; 
		double milesOutOfWork = totalMileage - milesWork;
		double result = milesOutOfWork/100; 	//I am not sure if I am using the correct way to turn it into a proportion
		
		//Outputs the information
		System.out.print("The proportion of your car's mileage in a year not to commute to work is: " + result); 
	}
}