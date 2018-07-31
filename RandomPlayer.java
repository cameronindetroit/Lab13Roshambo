package co.grandcircus.roshambo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);

	}

	@Override
	public Roshambo generateRoshambo() {
		int min = 1;
		int max = 3;
		int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);

		switch (randomNumber) {

		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.ROCK;
		case 3:
			return Roshambo.SCISSORS;
		default:
			return null;

		}

	}

}
