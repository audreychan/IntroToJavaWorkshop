package section2;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		robot.hide();
		robot.moveTo(30, 550);
		for(int i = 15; i < 150; i += 10) {
			drawStar(i);
			robot.moveTo(robot.getX() + 15 + i / 2, robot.getY() - 15 - i / 2);
			robot.setRandomPenColor();
		}
		

	}

	private void drawStar(int starSize) {
		robot.penDown();
		robot.setSpeed(500000);
		for(int i = 0; i < 5; i ++) {
			robot.move(starSize);
			robot.turn(144);
		}
			
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



