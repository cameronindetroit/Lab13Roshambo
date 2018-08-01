package co.grandcircus.roshambo;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Class variables
		String userInput;
		String rockComputer = "Siri";
		String randomComputer = "Kortana";
		int opponent;
		String playAgain = "yes";

		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Welcome
		System.out.print("Welcome to Rock, Paper, Scissor!\nEnter your name:");

		// Ask Player to enter name
		String userName = Validator.getStringWithValidInformation(scnr, "");

		// Set Players
		RockPlayer player1 = new RockPlayer(rockComputer);
		HumanPlayer player2 = new HumanPlayer(userName, scnr);
		RandomPlayer player3 = new RandomPlayer(randomComputer);

		do {

			// Select Opponent
			opponent = Validator.getInt(scnr, "Would you like to play against Player 1 or Player 2? ", 1, 2);
			scnr.reset();

			// Conditional to choose opponent
			if (opponent == 1) {

				userInput = Validator.getStringExtended(scnr, "Rock, Paper, or Scissors?");

				// Generate result
				Roshambo humanChoice = player2.generateRoshambo();
				Roshambo playerChoiceRock = player1.generateRoshambo();

				// Print results to screen
				System.out.println(userName + " Plays " + humanChoice);
				System.out.println(rockComputer + " plays " + playerChoiceRock);

				if (humanChoice == Roshambo.PAPER && playerChoiceRock == Roshambo.ROCK) {

					System.out.println("You won!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRock == Roshambo.ROCK) {

					System.out.println("Sorry" + rockComputer + " beat you.");

				} else if (humanChoice == Roshambo.ROCK && playerChoiceRock == Roshambo.ROCK) {

					System.out.println("Draw!");

				}

				playAgain = Validator.YesOrNo(scnr, "Would you like to play again? (yes or no)");

			} else if (opponent == 2) {
				userInput = Validator.getString(scnr, "Rock, Paper, or Scissors?");

				// Generate result
				Roshambo humanChoice = player2.generateRoshambo();
				Roshambo playerChoiceRandom = player3.generateRoshambo();

				// Print results
				System.out.println(userName + " Plays " + humanChoice);
				System.out.println(randomComputer + " plays " + playerChoiceRandom);

				if (humanChoice == Roshambo.PAPER && playerChoiceRandom == Roshambo.ROCK) {

					System.out.println("You won!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRandom == Roshambo.PAPER) {
					System.out.println("You won!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRandom == Roshambo.PAPER) {

					System.out.println("You won!");

				} else if (humanChoice == Roshambo.ROCK && playerChoiceRandom == Roshambo.ROCK) {

					System.out.println("Draw!");

				} else if (humanChoice == Roshambo.PAPER && playerChoiceRandom == Roshambo.PAPER) {
					System.out.println("Draw!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRandom == Roshambo.SCISSORS) {
					System.out.println("Draw!");

				} else {
					System.out.println("Sorry" + randomComputer + " beat you.");

				}

				playAgain = Validator.YesOrNo(scnr, "Would you like to play again? (yes or no)");

			}

		} while (playAgain.toLowerCase().equals("yes"));

		System.out.println("Exit Program");

	}
}
