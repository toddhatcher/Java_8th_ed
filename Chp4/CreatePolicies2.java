// CreatePolicies.java

public class CreatePolicies2
{
	public static void main(String[] args)
	{
		CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
		CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
		CarInsurancePolicy2 third = new CarInsurancePolicy2java(789, 12, "Newcastle");
		
		first.display();
		second.display();
		third.display();
	}
}