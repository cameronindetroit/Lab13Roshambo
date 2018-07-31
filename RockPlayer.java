package co.grandcircus.roshambo;

public class RockPlayer extends Player {

	// Constructor
	public RockPlayer(String name) {
		super(name);

	}

	// Roshambo generator
	@Override
	public Roshambo generateRoshambo() {

		return Roshambo.ROCK;
	}

}
