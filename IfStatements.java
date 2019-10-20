public class IfStatements 
{
	public static void main(String[] args) 
	{
		int a = 0;
		
		// If-else-if statements
		System.out.println("Case 1 - if - else");
		if (a >= 0) {
			System.out.println("a >= 0");
		} else if (a == 0) {
			System.out.println("a=0");
		} else {
			System.out.println("a < 0");
		}
		
		// If statements
		System.out.println("Case 2 - no else parts");
		if (a >= 0) {
			System.out.println("a >= 0");
		}
		if (a == 0) {
			System.out.println("a=0");
		}
	}
}
