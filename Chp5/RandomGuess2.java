// RandomGuess2.java

import javax.swing.JOptionPane;

public class RandomGuess2 {
    public static void main(String[] args){
        String userGuessString = "";
        int userGuessInt = 0;
        int generatedInt = 0;

        // Ask Player to enter a number between 1 and 10.
        userGuessString = JOptionPane.showInputDialog(null, "Please enter a number between 1 and 10.");

        // Convert user guess string to an integer.
        userGuessInt = Integer.parseInt(userGuessString);
        
        // Generate random int
        generatedInt = (1 + (int)(Math.random() * 10));

        // Evaluate users guess.
        if(userGuessInt == generatedInt)
        {
            JOptionPane.showMessageDialog(null, "You guessed the number correctly!");
        }
        // Display if users guess is high or low from actual number.
        else if(userGuessInt > generatedInt)
        {
            JOptionPane.showMessageDialog(null, "Your guess was too high.");
        }
        else if(userGuessInt < generatedInt)
        {
            JOptionPane.showMessageDialog(null, "Your guess was too low");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter a number between 1 and 10.");
        }
        // Display randomly generated number.
        JOptionPane.showMessageDialog(null,"The number is "+ generatedInt);
    }
}