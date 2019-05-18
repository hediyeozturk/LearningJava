package learnJava.hafta3.robot;

import java.awt.Color;

public class testRobot {

	public static void main(String[] args) {
		 Robot robot =new Robot();
		 robot.color=Color.BLUE;
		 robot.height=100;
		 
		 robot.Konus();
		 robot.Zipla(5);
		 robot.AdimAt(5, Yon.Ileri);
		 robot.AdimAt(3, Yon.Geri);
		 robot.Zipla(5);


	}

}
