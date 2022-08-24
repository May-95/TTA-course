
public class Character {

	// variables storing player's characteristics. Variables are private.
	private String name;
	private int maxHP;
	private int currentHP;
	
	
	// character constructor to build main player of the game
	Character(String name, int maxHP, int currentHP) {
		this.name = name;
		this.maxHP = maxHP;
		this.currentHP = currentHP;
	}

	// getters and setters for player
	public String getName() {
		return name;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

}
