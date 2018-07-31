package co.grandcircus.roshambo;

import java.util.Scanner;

public class HumanPlayer extends Player {

	// Class variables
	private Scanner scnr;

	// constructor
	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;

	}

	// Roshambo generator
	@Override
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringWithValidInformation(scnr, "");

		switch (choice.toUpperCase()) {

		case "PAPER":
			return Roshambo.PAPER;
		case "ROCK":
			return Roshambo.ROCK;
		case "SCISSORS":
			return Roshambo.SCISSORS;
		default:
			return null;

		}

	}

}
