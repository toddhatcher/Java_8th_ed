
// Population.java

public class Population
{
    public static void main(String[] args)
    {
        // Assume pop. of Mexico is 128 mil.
        // Assume pop. of US is 323 mil
        double annualIncrease = 0;
        double annualDecrease = 0;
        double currentPopMexico = 128_000_000;
        double currentPopUsa = 323_000_000;
        //double nextYearPopMexico = 0;
        //double nextYearPopUsa = 0;
        int counter = 0;
        
        System.out.println("Population program.\n");

        while(currentPopMexico < currentPopUsa)
        {
            // increment counter
            counter++;
            System.out.println("For year " + counter + " the populations are: ");
            // Calculate increase
            annualIncrease = currentPopMexico * 1.01;
            // Update Mexico population for next round of loop
            currentPopMexico = annualIncrease;
            // Calculate decrease
            annualDecrease = currentPopUsa * .15;
            // Update USA population
            currentPopUsa = currentPopUsa - annualDecrease;
            // Output result of Mexico
            System.out.printf("Mexico Pop: %20.2f\n", currentPopMexico);
            // Output result of USA
            System.out.printf("USA Pop: %20.2f\n", currentPopUsa);
            
            System.out.println("");
        }

        System.out.println("It will be " + counter + 
         " years until the population of Mexico surpases the " +
         "population of the United States.");
        // Assume 1.01 percent annual growth.

        
        // Assume 0.15 percent annual decline

        // Display populations each year for each country.

        // Display the number of years until Mexico surpases the US.
    }
}