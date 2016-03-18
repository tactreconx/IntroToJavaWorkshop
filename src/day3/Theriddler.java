package day3;

import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
		String Rule = JOptionPane.showInputDialog("What room can no one enter?");
		if (Rule.equals("A Mushroom")) {

			JOptionPane.showMessageDialog(null, "Your Right!");
			score++;

		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect. The correct answer is a Mushroom.");
		}
		
		}
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	
	}
