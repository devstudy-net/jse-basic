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
		return true;
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
		return false;
	}

	public static int readHumanTurn() {
		// validate + check free
		new Scanner(System.in).nextInt();
		return 1;
	}

	public static boolean isDraw() {
		return false;
	}

}
