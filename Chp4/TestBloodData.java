
// TestBloodData.java

public class TestBloodData
{
	public static void main(String[] args)
	{
			BloodData testBlood1 = new BloodData();
	
			System.out.println("The blood type for testBlood1 is " + testBlood1.getBloodType());
			System.out.println("The rh factor for testBlood1 is " + testBlood1.getRhFactor());
	
			String testType = "T";
			char testRh = '=';
	
			BloodData testBlood2 = new BloodData(testType, testRh);
	
			System.out.println("The blood type for testBlood2 is " + testBlood2.getBloodType());
			System.out.println("The rh factor for testBlood2 is " + testBlood2.getRhFactor());
	}


}