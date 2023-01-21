
// QuizScoreStatistics
import java.util.Scanner;

public class QuizScoreStatistics
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int average = 0;
        int userScore = 0;
        int scoreCounter = 0;
        int scoreTotal = 0;
        int score1 = 0;
        int scoreHighest = 0; // Scores higher than zero will be new high score.
        int scoreLowest = 99; // Scores less than 99 will be the new low score.

        // Allow user to enter quiz scores until 99 is entered.
        // While score != 99
        while(userScore != 99)
        {
            // Ask user for quiz score
            System.out.println("Please enter a quiz score or 99 to exit. ");
            userScore = keyboard.nextInt();

            // If score is less than 0 or more than 10, give error and exclude
            if(userScore < 0 || userScore > 10)
            {
                System.out.println("The entered value isn't a valid score.");
            }
            else
            {
                // Score is valid.
                
                // Increase score entry counter
                scoreCounter += 1;
                // Save score somehwere?
                score1 = userScore;

                // Check if score1 is highest or lowest
                if(score1 > scoreHighest)
                {
                    // score1 is highest score yet
                    scoreHighest = score1;
                }
                if(score1 < scoreLowest)
                {
                    // score1 is lowest score yet
                    scoreLowest = score1;
                }

                // Add score 1 to scoreTotal for later average calculation.
                scoreTotal += score1;

            }
        }
        // After all scores have been entered, display the number of score
        // entries
        System.out.println("The number of score entries are: " + scoreCounter);
            
        // Display highest score
        System.out.println("The high score is: " + scoreHighest);

        /// Display lowest score
        System.out.println("The low score is: " + scoreLowest);
        
        // Calculate average
        average = scoreTotal / scoreCounter;

        // Display average
        System.out.println("The average score is: " + average);
    }
}