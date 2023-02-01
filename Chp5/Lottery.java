
// Lottery.java

import java.util.*;

public class Lottery {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int correctGuesses = 0;
        int userGuess1 = 0;
        int userGuess2 = 0;
        int userGuess3 = 0;
        int userAward = 0;

        // Generate 3 random numbers between 0-9
        int numGen1 = (int)(Math.random() * 10);
        int numGen2 = (int)(Math.random() * 10);
        int numGen3 = (int)(Math.random() * 10);

        // Ask user to guess 3 numbers between 0-9
        System.out.println("Please guess the first number between 0 and 9: ");
        userGuess1 = keyboard.nextInt();
        System.out.println("Please guess the second number between 0 and 9: ");
        userGuess2 = keyboard.nextInt();
        System.out.println("Please guess the third number between 0 and 9: ");
        userGuess3 = keyboard.nextInt();

        // Grade users guesses
        if(userGuess1 == numGen1 || userGuess1 == numGen2 || userGuess1 == numGen3)
        {
            // Increment correct guesses.
            correctGuesses++;
        }

        if(userGuess2 == numGen1 || userGuess2 == numGen2 || userGuess2 == numGen3)
        {
            // Increment correct guesses.
            correctGuesses++;
        }

        if(userGuess3 == numGen1 || userGuess3 == numGen2 || userGuess3 == numGen3)
        {
            correctGuesses++;
        }

        if(userGuess1 == numGen1 && userGuess2 == numGen2 && userGuess3 == numGen3)
        {
            correctGuesses++;
        }

        // Display user guesses
        System.out.println("The user's first guess was " + userGuess1);
        System.out.println("The user's second guess was " + userGuess2);
        System.out.println("The user's third guess was " + userGuess3);

        System.out.println("\nThe correct three numbers are: " + numGen1 + " " + numGen2 + " " + numGen3);

        // Award user points
        if(correctGuesses == 1)
        {
            userAward = 10;
        }
        else if(correctGuesses == 2)
        {
            userAward = 100;
        }
        else if(correctGuesses == 3)
        {
            userAward = 1000;
        }
        else if(correctGuesses == 4)
        {
            userAward = 1000000;
        }
        else 
        {
            userAward = 0;
        }

        System.out.println("You have won $" + userAward);
    }
}