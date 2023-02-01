
// RockPaperScissors.java
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userChoice = 0;
        int winner = 888;

        // Genereate random numbers between 1-3 for Rock, Paper, or Scissors
        int numGen1 = ((int)(Math.random() * 100) % 3 + 1);

        System.out.println("Test Line: Computers number is: " + numGen1);

        // Ask user for input between 1-3 for Rock, Paper, or Scissors
        System.out.println("Please enter 1 for Rock, 2 for Paper, or 3 for Scissors.");
        userChoice = keyboard.nextInt();

        // Determine the winner
        winner = determineWinner(userChoice, numGen1);

        // Display the results
        if(winner == 0)
        {
            System.out.println("The user is the winner with #" + userChoice);
        }
        else if(winner == 1)
        {
            System.out.println("The computer is the winner with #" + numGen1);
        }
        else if(winner == 2)
        {
            System.out.println("Tie game. The user chose #" + userChoice + " and the computer chose #" + numGen1);
        }
        else
        {
            // Error
            System.out.println("Error with returned number from the determineWinner method.");
        }
        
    }

    
    // Return 0 if user wins. Return 1 if computer wins. 
    public static int determineWinner(int usersNum, int computersNum)
    {   
        int winner = 999;

        System.out.println("Test line: usersNum is " + usersNum);
        System.out.println("Test line: computersNum is " + computersNum);

        if(usersNum == 1 && computersNum == 3)
        {
            // Users rock beats computers paper.
            winner = 0;
        }
        else if(usersNum == 1 && computersNum == 2)
        {
            // Computers paper beats users rock.
            winner = 1;
        }
        else if(usersNum == 1 && computersNum == 1)
        {
            // Both user and computer entered rock. Tie.
            winner = 2;
        }

        if(usersNum == 2 && computersNum == 1)
        {
            // Users paper beats computers rock.
            winner = 0;
        }
        else if(usersNum == 2 && computersNum == 3)
        {
            // Computers scissors beats users paper.
            winner = 1;
        }
        else if(usersNum == 2 && computersNum == 2)
        {
            // Both user and computer entered paper. Tie.
            winner = 2;
        }

        if(usersNum == 3 && computersNum == 1)
        {
            // Computers rock beats users Scissors 
            winner = 1;
        }
        else if(usersNum == 3 && computersNum == 2)
        {
            // Users Scissors beats computers Paper.
            winner = 0;
        }
        else if(usersNum == 3 && computersNum == 3)
        {
            // Bother user and computer entered scissors. Tie.
            winner = 2;
        }

        return winner;
    }
}
