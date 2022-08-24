
public class Map {

	// private variables.
	// x and y will store map size.
	private int x;
	private int y;

	// currentX and currentY will store player's current location.
	private int currentX;
	private int currentY;

	// message will store the hints given to the user to guide them.
	private String message;

	// will store whether treasure has been found or not.
	private boolean foundTreasure;

	// will store whether player has been taken to random location.
	private boolean randomCoordinates;

	// getters and setters for the private variables.
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isFoundTreasure() {
		return foundTreasure;
	}

	public void setFoundTreasure(boolean foundTreasure) {
		this.foundTreasure = foundTreasure;
	}

	public boolean isRandomCoordinates() {
		return randomCoordinates;
	}

	public void setRandomCoordinates(boolean randomCoordinates) {
		this.randomCoordinates = randomCoordinates;
	}

	// method for moving player across the map.
	public void move(String direction) {
		// if statement checking if user's direction equals to 'n'.
		if (direction.equals("n")) {
			// if statement checking if player's currentY location is equal to the map size.
			if (this.currentY == this.y) {
				// setting randomCoordinates to false just to be sure so that we can use that
				// variable later on to check if player has landed on one of the forest's
				// pitfalls.
				randomCoordinates = false;
				// check() method is run to check if current location is where the treasure is
				// buried.
				check();
				// if statement for when treasure is not found.
				if (foundTreasure == false) {
					// checking coordinates to see if current location is the coordinates that
					// will randomly transport the player to a random coordinate on the map.
					randomCoordinates();
					// message method is run to determine which message should be displayed to
					// player. The message depends on player's current position.
					message();
					// if statement that runs when the player does not fall onto a pitfall.
					if (isRandomCoordinates() == false) {
						// player is told their current location and that they cannot go further as
						// they are now at the edge of the map.
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY
								+ ". \nYou are now at the edge of the map. You cannot go north.");
						// a message is displayed in console that gives the player hints on where the
						// treasure is.
						System.out.println(message);
					}
				}
			} else {
				// resetting randomCoordinates boolean values.
				randomCoordinates = false;
				// if currentY does not equal to map size, 1 is added to currentY value.
				this.currentY++;
				// method to check if treasure has been found.
				check();
				// if treasure has not been found, coordinates are checked to see if they equal
				// the forest's pitfalls.
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					// if coordinates are not pitfalls, hint message is printed out to the console
					// and the player's current coordinates.
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY);
						System.out.println(message);
					}
				}
			}
		} else if (direction.equals("s")) {
			if (this.currentY == 0) {
				randomCoordinates = false;
				check();
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY
								+ ". \nYou are now at the edge of the map. You cannot go south.");
						System.out.println(message);
					}
				}
			} else {
				randomCoordinates = false;
				this.currentY--;
				check();
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY);
						System.out.println(message);
					}
				}
			}
		} else if (direction.equals("e")) {
			if (this.currentX == this.x) {
				randomCoordinates = false;
				check();
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY
								+ ". \nYou are now at the edge of the map. You cannot go east.");
						System.out.println(message);
					}
				}
			} else {
				randomCoordinates = false;
				this.currentX++;
				check();
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY);
						System.out.println(message);
					}
				}
			}
		} else if (direction.equals("w")) {
			if (this.currentX == 0) {
				randomCoordinates = false;
				check();
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY
								+ ". \nYou are now at the edge of the map. You cannot go west.");
						System.out.println(message);
					}
				}
			} else {
				randomCoordinates = false;
				this.currentX--;
				check();
				if (foundTreasure == false) {
					randomCoordinates();
					message();
					if (isRandomCoordinates() == false) {
						System.out.println("Your current location is X: " + currentX + " & " + "Y: " + currentY);
						System.out.println(message);
					}
				}
			}
		}
	}

	// checks whether treasure has been found. If currentX = 4 and currentY = 5,
	// then treasure has been found.
	public void check() {
		if (currentX == 4 && currentY == 5) {
			// true is assigned to foundTreasure variable if the coordinates match the
			// treasure coordinates.
			foundTreasure = true;
		} else {
			// false is assigned if treasure has not been found.
			foundTreasure = false;
		}
	}

	// method to check if player's current coordinates match the forest's pitfalls.
	// If they do, currentX and currentY are set to random number generated by
	// Math.random() method.
	public void randomCoordinates() {
		if (currentX == 3 && currentY == 1) {
			this.setCurrentX(((int) (Math.random() * 11)));
			this.setCurrentY(((int) (Math.random() * 11)));
			randomCoordinates = true;
		} else if (currentX == 1 && currentY == 5) {
			this.setCurrentX(((int) (Math.random() * 11)));
			this.setCurrentY(((int) (Math.random() * 11)));
			randomCoordinates = true;
		} else if (currentX == 2 && currentY == 8) {
			this.setCurrentX(((int) (Math.random() * 11)));
			this.setCurrentY(((int) (Math.random() * 11)));
			randomCoordinates = true;
		} else if (currentX == 5 && currentY == 6) {
			this.setCurrentX(((int) (Math.random() * 11)));
			this.setCurrentY(((int) (Math.random() * 11)));
			randomCoordinates = true;
		} else if (currentX == 7 && currentY == 7) {
			this.setCurrentX(((int) (Math.random() * 11)));
			this.setCurrentY(((int) (Math.random() * 11)));
			randomCoordinates = true;
		} else if (currentX == 8 && currentY == 3) {
			this.setCurrentX(((int) (Math.random() * 11)));
			this.setCurrentY(((int) (Math.random() * 11)));
			randomCoordinates = true;
		}
	}

	// hint messages are generated depending on the currentX value.
	public String message() {
		switch (currentX) {
		case 0:
		case 1:
		case 2:
			message = "To find the treasure, maybe try going east...";
			break;
		case 3:
		case 4:
		case 5:
			message = "Almost there, the treasure is nearby...";
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			message = "To find the treasure, maybe try going west...";
			break;
		}
		return message;
	}

	// used to create game map, takes in an x value and a y value which is the size
	// of the map.
	// used to create game map.
	public Map(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
