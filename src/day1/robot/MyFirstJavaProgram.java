package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Dalek = new Robot();
Dalek.moveTo(900, 500);
Dalek.penDown();
Dalek.setPenColor(Color.MAGENTA);
for (int i = 0; i < 8; i++) {
Dalek.turn(45);
Dalek.move(150);
}
}}