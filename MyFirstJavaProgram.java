package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot bb8=new Robot();
		bb8.penDown();
		bb8.setPenWidth(50);
		bb8.setPenColor(Color.CYAN);
for (int i = 0; i < 4; i++) {
	bb8.move(300);
	bb8.turn(90);
}

	
		
		
	}
}
