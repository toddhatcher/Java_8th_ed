
// IncreasedProduction.java

public class IncreasedProduction
{
    public static void main(String[] args)
    {
        // Compute and display a workers output for 24 months.
        // Assume 4000 parts per month with a 6% increase each month.
        final double MAX_MONTHS = 24.00;
        final double PARTS_PER_MONTH = 4000.00;
        final double PARTS_PER_MONTH_FOR_RAISE = 7000.00;
        final double PERCENT_OF_INCREASE = .06;

        // Start monthlyPartToal off with base parts per month.
        double monthlyPartTotal = PARTS_PER_MONTH;
        double monthlyIncrease = 0.00;
        boolean raiseMessageOn = true;
        
        System.out.println("A workers part production for 24 Months. ");

        for(int i = 1; i <= MAX_MONTHS; ++i)
        {
            // Display the current month and montly part production, expectation
            System.out.printf("For month " + i 
                + " the part total is: %.2f%n", monthlyPartTotal);

            // Also display the month in which 7000 units is reached. 
            if(monthlyPartTotal >= 7000)
            {   
                while(raiseMessageOn == true)
                {
                    System.out.println("Employee reached 7000 parts per month "
                     + "in month " + i);
                    System.out.println("Employee qualifies for a raise.");
                    raiseMessageOn = false; // Turn off message after 1 time.
                }
            }
            
            // Calc for next month.
            monthlyIncrease = monthlyPartTotal * PERCENT_OF_INCREASE;
            monthlyPartTotal = monthlyPartTotal + monthlyIncrease;
        }
    }
}
