//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot z = new Robot();
		//3. Ask the user what color they would like the robot to draw
	for (int i = 0; i < 5; i++) {
			
		
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("blue")){
			
		}
		else	{
			boolean colour = color.equals("red");
			
		}
	}
		z.setSpeed(80);
		z.penDown();
		z.setPenWidth(69);
		z.move(100);
		z.turn(40);
		z.move(100);
		z.turn(90);
		z.move(100);
		z.turn(50);
		z.move(100);
		z.turn(90);
		z.move(150);
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
