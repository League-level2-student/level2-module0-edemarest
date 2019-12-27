package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
		Robot[] bots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < bots.length; i++) {
			bots[i] = new Robot();
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for(int i = 0; i < bots.length; i++) {
			bots[i].moveTo(400, 550);
			bots[i].setSpeed(50);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while (!(bots[0].getY() < 0 || bots[1].getY() < 0 || bots[2].getY() < 0 || bots[3].getY() < 0 || bots[4].getY() < 0)){
		for(int i = 0; i < bots.length; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt(50-1);
			bots[i].move(randomNum);
		}	
	}
	int winner = 0;
	for(int i = 0; i < bots.length; i++) {
		if(bots[i].getY() > 0) {
			winner = i;
		}
	}
	
	JOptionPane.showMessageDialog(null, "Robot #" + winner + " wins the race!");
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
