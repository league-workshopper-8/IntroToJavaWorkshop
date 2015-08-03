package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot Robit = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		Robit.setSpeed(31999);

		// 5. Set the pen width to 5
Robit.setPenWidth(500);
		// 6. Do steps #6 to #8 four times...
for (int i = 0; i < 4; i++) {
	Robit.setRandomPenColor();
	Robit.turn(90);
}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
drawSquare();
	
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
	Robit.penDown();
	Robit.setPenColor(Color.cyan);
	Robit.move(100);
	Robit.turn(90);
	Robit.move(100);
	Robit.turn(90);
	Robit.move(100);
	Robit.turn(90);
	Robit.move(100);
		JOptionPane.showMessageDialog(null, "NOOOOOO! THIS CANNOT BE!!!!!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
