package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Robit = new Robot();

	
	void go() {
	 // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible

		// 4. make a variable to hold the length of the triangle and set it to 50
int length=50;
		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	iluminati(100);
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void iluminati(int length) {
		Robit.penDown();
		for (int i = 0; i < 3; i++) {
			
		
		Robit.setRandomPenColor();
		Robit.move(100);
        Robit.turn(360/3);		
		}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
