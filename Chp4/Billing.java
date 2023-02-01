import java.util.Scanner;

public class Billing
{
	public static final double TAX_PCNT = .08;
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		double bookPrice, bookQuantity, coupon;
		
		System.out.println("Please enter the price of a single book: ");
		bookPrice = keyboard.nextDouble();
		System.out.println("Your total bill is: " + computeBill(bookPrice) + " for one book.");
		
		System.out.println("Please enter the quantity of books you would like: ");
		bookQuantity = keyboard.nextDouble();			
		System.out.println("Your total bill for " + bookQuantity + " books is " + computeBill(bookPrice, bookQuantity));
		
		
		System.out.println("Please enter a coupon value: ");
		coupon = keyboard.nextDouble();
		System.out.println("Your total bill for " + bookQuantity + " books with a coupon value of $" + coupon + " is " + computeBill(bookPrice, bookQuantity, coupon));
		
	}
	
	public static double computeBill(double price)
	{
		double total, tax;
		
		// Add 8% tax
		tax = price * TAX_PCNT;
		// Return total
		total = price + tax;
		return total;
	}
	
	public static double computeBill(double price, double quantity)
	{
		double total, tax;
		
		// Multiply both values, Add 8% Tax
		tax = (price * quantity) * TAX_PCNT; 
		
		// Return total
		total = (price * quantity) + tax;
		return total;
	}
	
	public static double computeBill(double price, double quantity, double couponValue)
	{
		double total, tax;
		
		// Multiply both values, subtract coupon value
		// Then add 8% Tax
		tax = ((price * quantity) - couponValue) * TAX_PCNT;
		
		// Return total
		total = ((price * quantity) - couponValue) + tax;
		return total;
	}
}