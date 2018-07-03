//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String user = JOptionPane.showInputDialog("Guess a number..any number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int num = Integer.parseInt(user);
			// 5. if the guess is correct
			if (num ==46) {
				JOptionPane.showInputDialog("You win!");
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			if (num > 46) {
				JOptionPane.showInputDialog("Too High");
			
			JOptionPane.showInputDialog("You Lose!");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
			if (num < 46) {
				JOptionPane.showInputDialog("Too Low");
			
			JOptionPane.showInputDialog("You Lose!");
			}	
			// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


