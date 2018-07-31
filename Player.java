package co.grandcircus.roshambo;

public abstract class Player {

	// Class variabl
	private String name;

	// getter
	public String getName() {
		return name;
	}

	// return one of ROCK, PAPER, SCISSOR
	abstract public Roshambo generateRoshambo();

	// constructor
	public Player(String name) {
		this.name = name;
	}

	public String toString() {
		return "Player + name";
	}

}
