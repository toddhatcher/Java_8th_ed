// RandomGuess.java

import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args){

        // Display two output boxes in sequence.
        // First box asks user to think of a number between 1-10.
        JOptionPane.showMessageDialog(null, "Please think of a number between 1 and 10.");
        // Display randomly generated number.
        JOptionPane.showMessageDialog(null,"The number is "+
        (1 + (int)(Math.random() * 10)));
    }
}