package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer =
		JOptionPane.showInputDialog("Do you know how press a button?.");

		// 2. If they say "yes", tell them they will rule the world.
if (answer.equalsIgnoreCase("Yes")) {
JOptionPane.showMessageDialog(null, "good jub");
}
		// 3. Otherwise, wish them good luck washing dishes.
else{
JOptionPane.showMessageDialog(null,"Rip you");	
	
}
	}
}

