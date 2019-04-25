package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafffiti {
	public static void main(String[] args) {
		Robot robo = new Robot("mini");	
		robo.setSpeed(1000);
		robo.turn(-90);
		robo.penDown();
		
		for(int i=0; i<180; i++) {
			robo.move(2);
			robo.turn(1);
		}
		}
	}


