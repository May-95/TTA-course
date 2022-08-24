import java.util.Scanner;

public class TreasureGame {

	public static void main(String[] args) {
		// welcome message to the player.
		System.out.println("Welcome to the Treasure game.");

		// creating scanner object so we can take in user's input.
		Scanner input = new Scanner(System.in);

		// player asked for their name.
		System.out.println("Enter your player name.");

		// player's name stored in variable called name.
		String name = input.nextLine();

		// converting name to make the first letter always capital and the rest of the
		// letters lower case.
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

		// new main character created from the Character class. Player's name is set
		// using user's input that was stored in 'name'.
		Character mainPlayer = new Character(name, 100, 100);
		
		// welcome message to player. Lets player know their current health points.
		System.out.println("Welcome, " + mainPlayer.getName() + ". You have 100 health points. ");

		// Game map is created with the x and y values for the map.
		Map gameMap = new Map(10, 10);

		// prints to the console the size of the map.
		System.out.print("The map is " + gameMap.getX() + " by " + gameMap.getY() + ". ");

		// random x and y values are generated using Math.random and stored in
		// variables.
		int randomX = (int) (Math.random() * 11);
		int randomY = (int) (Math.random() * 11);

		// the random numbers for x and y are set as current values for the player's
		// location.
		gameMap.setCurrentX(randomX);
		gameMap.setCurrentY(randomY);

		// player is told their current position on the map.
		System.out.println(
				"Your current position is X: " + gameMap.getCurrentX() + " &" + " Y: " + gameMap.getCurrentY() + "\n");

		// player is given their instructions.
		System.out.println("In this forest, there is deeply buried treasure. But beware " + mainPlayer.getName()
				+ ", there are pitfalls in this forest that will take you to random locations. Each fall will impact your current health points. When you hit 0 health points, it is game OVER. Your target is to find that buried treasure before you run out.");

		// game loop. A do-while loop used so that the game runs at least once and while
		// the
		// condition remains true. User is going to be prompted as long as they have not
		// found the treasure and have health points.
		do {
			// If player's currentHP is less than or equal to 0, they get a message saying
			// 'game over'.
			if (mainPlayer.getCurrentHP() <= 0) {
				System.out.println("GAME OVER.");
				break;
			} // if player's currentHP is more than 0, the game continues.
			else {
				// user is asked to decide which direction they want to go in.
				System.out.println(
						"Which direction do you want to go in? Type in N for north, E for east, S for south, and W for west.");
				// user's input is stored in direction variable. toLowerCase() method used to
				// make comparisons easier.
				String direction = input.nextLine().toLowerCase();

				// move method uses the direction variable to move the player in the direction
				// player has chosen.
				gameMap.move(direction);

				// if player has fallen in one of the forest's pitfalls, and their currentHP is
				// more than 0. A message is printed out telling them that they have fallen in
				// and
				// have been transported to a random location on the map.
				if (gameMap.isRandomCoordinates() == true && mainPlayer.getCurrentHP() > 0) {
					System.out.println(
							"You have fallen in one of the magical pitfalls of the forest. You have been transported to a random location on the map.");

					// player's currentHP is set by deducting 20 from their currentHP.
					mainPlayer.setCurrentHP(mainPlayer.getCurrentHP() - 20);

					// player's currentHP is printed out to them.
					System.out.println("Your current health is " + mainPlayer.getCurrentHP() + ".");

					// if player has more than 0 currentHP, their current location is printed out
					// and a message hinting to where the treasure might be.
					if (mainPlayer.getCurrentHP() != 0) {
						System.out.println("Your current location is X: " + gameMap.getCurrentX() + " & " + "Y: "
								+ gameMap.getCurrentY());
						gameMap.message();
						System.out.println(gameMap.getMessage());
					}
				}

				// if the treasure has been found, a message is printed to the console telling
				// the player that they have found the treasure and that the game is over.
				if (gameMap.isFoundTreasure() == true) {
					System.out.print("You have found the treasure, " + mainPlayer.getName() + ". GAME OVER.");
				}

				// adding line break so there is space between each loop.
				System.out.println();
			}
			// loop will stop only when treasure has been found or when player's health
			// points are at 0 or less.
		} while (gameMap.isFoundTreasure() == false || mainPlayer.getCurrentHP() == 0);

		input.close();

	}

}
