package co.grandcircus.roshambo;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Class variables
		String rockPlayer = "Chris";
		String randomPlayer = "Dave";
		int opponent;
		String userInput = "";
		String playAgain = "yes";

		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Welcome
		System.out.println("Welcome to Rock Paper Scissors!");

		// Ask Player to enter name
		System.out.print("Enter you name: ");
		String userName = Validator.getStringWithValidInformation(scnr, "");

		// Set Players
		RockPlayer player1 = new RockPlayer(rockPlayer);
		HumanPlayer player2 = new HumanPlayer(userName, scnr);
		RandomPlayer player3 = new RandomPlayer(randomPlayer);

		do {

			// Select Opponent
			opponent = Validator.getInt(scnr, "Would you like to play against Player 1 or Player 2? ", 1, 2);
			scnr.reset();

			// Conditional to choose opponent
			if (opponent == 1) {

				userInput = Validator.getString(scnr, " Player 1: Rock, Paper, or Scissors?");

				// Generate result
				Roshambo humanChoice = player2.generateRoshambo();
				Roshambo playerChoiceRock = player1.generateRoshambo();

				// Print results to screen
				System.out.println(userName + " Plays " + humanChoice);
				System.out.println("The computer plays " + playerChoiceRock);

				if (humanChoice == Roshambo.PAPER && playerChoiceRock == Roshambo.ROCK) {

					System.out.println("You won!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRock == Roshambo.ROCK) {

					System.out.println("Sorry the computer beat you.");

				} else if (humanChoice == Roshambo.ROCK && playerChoiceRock == Roshambo.ROCK) {

					System.out.println("Draw!");

				}

				playAgain = Validator.YesOrNo(scnr, "Would you like to play again? (yes or no)");

			} else if (opponent == 2) {
				userInput = Validator.getString(scnr, "Player 2: Rock, Paper, or Scissors?");

				// Generate result
				Roshambo humanChoice = player2.generateRoshambo();
				Roshambo playerChoiceRandom = player3.generateRoshambo();

				// Print results
				System.out.println(userName + " Plays " + humanChoice);
				System.out.println("The other computer plays " + playerChoiceRandom);

				if (humanChoice == Roshambo.PAPER && playerChoiceRandom == Roshambo.ROCK) {

					System.out.println("You won!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRandom == Roshambo.ROCK) {

					System.out.println("Sorry the computer beat you.");

				} else if (humanChoice == Roshambo.ROCK && playerChoiceRandom == Roshambo.ROCK) {

					System.out.println("Draw!");

				} else if (humanChoice == Roshambo.SCISSORS && playerChoiceRandom == Roshambo.PAPER) {
					System.out.println("You won!");

				} else if (humanChoice == Roshambo.PAPER && playerChoiceRandom == Roshambo.SCISSORS) {
					System.out.println("Sorry the computer beat you.");

				} else if (humanChoice == Roshambo.PAPER && playerChoiceRandom == Roshambo.PAPER) {
					System.out.println("Draw!");

				}

				playAgain = Validator.YesOrNo(scnr, "Would you like to play again? (yes or no)");
			}
		} while (playAgain.toLowerCase().equals("yes"));

		System.out.println("Exit Program");

	}

}
