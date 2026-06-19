/*
* This program generates a random number from 1-10 and then
* have the user try to guess that number 
* Eliana Tristan 
* JDk version 26
 */
package guessinggame;
import javax.swing.JOptionPane;

public class GuessingGame {
    public static void main(String[] args) {
         // generates a random number from 1 to 10 
       int computerNumber = (int) (Math.random() * 10 + 1);
        // display the correct guess for testing purposes 
       System.out.println("The correct guess would be " + computerNumber);
       int userAnswer = 0;
       int count = 0;
       while (computerNumber != userAnswer) {
           count++;
       String response = JOptionPane.showInputDialog(null, 
               "Enter a guess between 1 and 10");
       // takes the user answers string and converts it into an int
       userAnswer = Integer.parseInt(response);
       
       String result = null;
       if (userAnswer == computerNumber) {
           result = "Correct";
       } else {
           if (userAnswer <= 0 || userAnswer > 10) {
               result = "Invalid guess";
           } else if(userAnswer > computerNumber) {
               result = "Too High";
           } else {
               result = "Too Low";
           }
       }
       JOptionPane.showMessageDialog(null, result
           + "\nTry number " + count);
       }
       if (count == 1) {
            JOptionPane.showMessageDialog(null, "You are correct, wow you're amazing!");
       } else if (count < 3) {
           JOptionPane.showMessageDialog(null, "Amaizng!");
       } else if (count < 5) {
           JOptionPane.showMessageDialog(null, "Great Job!");
       } else {
           JOptionPane.showMessageDialog(null, "You need some practice");
         
           
       }
       
        
    }
  
}
