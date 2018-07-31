package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/thanos.png");		
		
		JOptionPane.showMessageDialog(null, "Defeat Thanos to save half the universe!", "Avenger", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	    int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int thanosHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttack = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int thanosAttack = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
        while(playerHealth > 0 && thanosHealth > 0) {
        	
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		int attack = JOptionPane.showOptionDialog(null, "Do you want to attack with a punch or a swing of Stormbreaker?", "Attack type", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Punch!", "Stormbreaker Swing!"}, null);
		
		// 9. If they typed in "yell":
		if(attack == 0) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			playerAttack = new Random().nextInt(11);
			//-- Subtract that number from the dragon's health variable 
			thanosHealth -= playerAttack;
		}
		// 10. If they typed in "kick":
		else if(attack == 1) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			playerAttack = new Random().nextInt(26);
			//-- Subtract that number from the dragon's health variable 
			thanosHealth -= playerAttack;
		}
		JOptionPane.showMessageDialog(null, "You dealt " + playerAttack + " damage!");
			
		int ranStone = new Random().nextInt(6);
		switch(ranStone) {
		case 0:
			JOptionPane.showMessageDialog(null, "Thanos attacked with the Power Stone");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Thanos attacked with the Space Stone");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Thanos attacked with the Reality Stone");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Thanos attacked with the Soul Stone");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Thanos attacked with the Time Stone");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Thanos attacked with the Mind Stone");
			break;
		}
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		thanosAttack = new Random().nextInt(35);
		// 12. Subtract this number from the player's health
		playerHealth -= thanosAttack;
		JOptionPane.showMessageDialog(null, "Thanos dealt " + thanosAttack + " damage!");
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth <= 0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "Oh no! You were killed by Thanos in battle. You were unable to save Spiderman.");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		else if(thanosHealth <= 0){
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null, "Good job! You saved half the universe from turning to dust.");
		}
	   //  15.  Else
		else {
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			JOptionPane.showMessageDialog(null, "Your health: " + playerHealth + "\n" + "Thanos' Health: " + thanosHealth);
		}
        }
		}
	}

