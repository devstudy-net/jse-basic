package net.devstudy.basic.game;

import java.util.Scanner;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class TicTacToe {
	public static char NO_WINNER = 0;
	public static char EMPTY = ' ';
	public static char HUMAN = 'X';
	public static char COMPUTER = 'O';

	// public static boolean isHuman = true;

	public static char[][] gameTable = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };

	public static void main(String[] args) {
		System.out.println("A new game started!");
		while (true) {
			printGameTable();
			System.out.println("Please type number");
			int number = readHumanTurn();
			if (!handleHumanTurn(number)) {
				break;
			}
		}
	}

	public static void printGameTable() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + gameTable[i][j]);
				if (j != 2) {
					System.out.print(" |");
				}
			}
			System.out.println();
			if (i != 2) {
				for (int j = 0; j < 3; j++) {
					System.out.print("---");
					if (j != 2) {
						System.out.print("-");
					}
				}
				System.out.println();
			}
		}
		System.out.println();
	}

	public static boolean handleHumanTurn(int number) { // set X, check winner,
														// check draw
		makeTurn(number, /* isHuman ? */HUMAN/* : COMPUTER */);
		// isHuman = !isHuman;
		char winner = getWinner();
		if (winner != NO_WINNER) {
			if (winner == HUMAN) {
				System.out.println("Game over: You win!");
			} else {
				System.out.println("Game over: Computer wins!");
			}
			printGameTable();
			return false;
		}
		if (isDraw()) {
			System.out.println("Game over: Draw!");
			printGameTable();
			return false;
		}
		//TODO
		
		return true;
	}

	public static void makeTurn(int number, char ch) {
		int i = (number - 1) / 3;
		int j = number - i * 3 - 1;
		gameTable[i][j] = ch;
	}

	public static char getWinner() {
		// Check rows
		for (int i = 0; i < 3; i++) {
			if (gameTable[i][0] == gameTable[i][1] && gameTable[i][1] == gameTable[i][2] && gameTable[i][2] != EMPTY) {
				return gameTable[i][0];
			}
		}
		// Check columns
		for (int j = 0; j < 3; j++) {
			if (gameTable[0][j] == gameTable[1][j] && gameTable[1][j] == gameTable[2][j] && gameTable[2][j] != EMPTY) {
				return gameTable[0][j];
			}
		}
		// Check not main diagonal
		if (gameTable[0][2] == gameTable[1][1] && gameTable[1][1] == gameTable[2][0] && gameTable[2][0] != EMPTY) {
			return gameTable[0][2];
		} else
		// Check main diagonal
		if (gameTable[0][0] == gameTable[1][1] && gameTable[1][1] == gameTable[2][2] && gameTable[2][2] != EMPTY) {
			return gameTable[0][0];
		}
		return NO_WINNER;
	}

	public static boolean isCellFree(int number) {
		int i = (number - 1) / 3;
		int j = number - i * 3 - 1;
		return gameTable[i][j] == EMPTY;
	}

	@SuppressWarnings("resource")
	public static int readHumanTurn() {
		while (true) {
			String input = new Scanner(System.in).nextLine();
			if (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '9') {
				System.out.println("Invalid input: Please type any of 1,2,3,4,5,6,7,8,9 number");
			} else {
				int number = Integer.parseInt(input);
				if (isCellFree(number)) {
					return number;
				} else {
					System.out.println("Cell is not free! Type other number");
				}
			}
		}
	}

	public static boolean isDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameTable[i][j] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
}
