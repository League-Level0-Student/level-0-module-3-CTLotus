package methodwriting;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot x = new Robot();
	x.setSpeed(100);
	x.penDown();
	
	drawSquare();
	for (int i = 0; i < 5; i++) {
		x.move(50);
		x.turn(90);
		
	}
	
	drawTriangle();
	x.turn(75);
	x.move(100);
	x.turn(-150);
	x.move(100);
	x.turn(-105);
	x.move(50);
	
	drawCircle();
	for (int i = 0; i < 20; i++) {
		x.turn(10);
		x.move(10);
		x.move(10);
		x.turn(10);
	}
	int ask = JOptionPane.showOptionDialog(null, "What shape do you want?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Sqaure", "Triangle", "Circle" }, null);};
	
	
private static void drawCircle() {
	// TODO Auto-generated method stub
	
}

private static void drawTriangle() {
	// TODO Auto-generated method stub
	
}

private static void drawSquare() {
	// TODO Auto-generated method stub
	
}
}
