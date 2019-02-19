package methodwriting;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot x = new Robot();

	public static void main(String[] args) {
		{
			x.setSpeed(100);
			x.penDown();
		}
		String color = JOptionPane.showInputDialog(null, "Which of the three color do you want? Red? Blue? Green?");
			if (color.equalsIgnoreCase("Red")) {
				x.setPenColor(255,0,0);
			}
			if (color.equalsIgnoreCase("Blue")){
				x.setPenColor(0,255,0);
			}
			if (color.equalsIgnoreCase("Green")) {
				x.setPenColor(0,0,255);
			}
		String draw = JOptionPane.showInputDialog(null, "Which shape do you want to draw? Square? Triangle? Circle?");

		if (draw.equalsIgnoreCase("Square")) {
			drawSquare();
		}
		if (draw.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		if (draw.equalsIgnoreCase("Circle")) {
			drawCircle();
		}
	}

	private static void drawCircle() {
		for (int i = 0; i < 20; i++) {
			x.turn(10);
			x.move(10);
			x.move(10);
			x.turn(10);
		}
	}

	private static void drawTriangle() {
		x.turn(75);
		x.move(100);
		x.turn(-150);
		x.move(100);
		x.turn(-105);
		x.move(50);

	}

	private static void drawSquare() {
		for (int i = 0; i < 5; i++) {
			x.move(50);
			x.turn(90);

		}
	}
}
