package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String gar =JOptionPane.showInputDialog("Do you know how to write code?");
		if (gar.equals("yes"))
			{
			JOptionPane.showMessageDialog(null,"YOU RULE THE WORLD!!");
			
			}
		else{
		JOptionPane.showMessageDialog(null, "Good luck washing dishes");
		}
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}



