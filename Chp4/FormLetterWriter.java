
public class FormLetterWriter
{
	public static void displaySolution(String lname)
	{
		// Display Dear Mr. or Ms.
		System.out.println("Dear Mr. or Ms. " + lname);
		System.out.println("Thank you for your recent order.");
	}
	
	public static void displaySolution(String lname, String fname)
	{
		System.out.println("Dear Mr. or Ms. " + fname + " " + lname);
		System.out.println("Thank you for your recent order.");
	}

	public static void main(String[] args)
	{
		System.out.println("Test of single parameter method.");
		displaySolution("Hatcher");
		displaySolution("Hatcher", "James");
	}

}