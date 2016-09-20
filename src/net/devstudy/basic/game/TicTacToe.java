package net.devstudy.basic.game;

import java.util.Random;
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
		startGame();
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

	public static void startGame() {
		if (new Random().nextBoolean()) {
			makeComputerTurn();
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

	public static boolean handleHumanTurn(int number) {
		makeTurn(number, HUMAN);
		if (getWinner() == HUMAN) {
			System.out.println("Game over: You win!");
			printGameTable();
			return false;
		}
		if (isDraw()) {
			System.out.println("Game over: Draw!");
			printGameTable();
			return false;
		}
		makeComputerTurn();
		if (getWinner() == COMPUTER) {
			System.out.println("Game over: Computer wins!");
			printGameTable();
			return false;
		}
		if (isDraw()) {
			System.out.println("Game over: Draw!");
			printGameTable();
			return false;
		}
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

	public static void makeComputerTurn() {
		if (tryWin(COMPUTER)) {
			return;
		}
		if (tryWin(HUMAN)) {
			return;
		}
		if (tryWinOnNextTurn()) {
			return;
		}
		makeRandomComputerTurn();
	}

	public static boolean tryWin(char ch) {
		for (int i = 0; i < 3; i++) {
			if (trySetToRow(i, ch)) {
				return true;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (trySetToCol(i, ch)) {
				return true;
			}
		}
		if (trySetToNotMainDiagonal(ch)) {
			return true;
		}
		if (trySetToMainDiagonal(ch)) {
			return true;
		}
		return false;
	}

	public static void makeRandomComputerTurn() {
		int[] freeCells = new int[9];
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameTable[i][j] == EMPTY) {
					freeCells[count++] = i * 3 + j + 1;
				}
			}
		}
		int index = new Random().nextInt(count);
		makeTurn(freeCells[index], COMPUTER);
	}

	public static boolean trySetToRow(int row, char ch) {
		int res = 0;
		int emptyI = -1;
		int emptyJ = -1;
		for (int j = 0; j < 3; j++) {
			if (gameTable[row][j] == ch) {
				res++;
			} else if (gameTable[row][j] == EMPTY) {
				emptyI = row;
				emptyJ = j;
			}
		}
		return handleTrySetResult(res, emptyI, emptyJ);
	}

	public static boolean trySetToCol(int col, char ch) {
		int res = 0;
		int emptyI = -1;
		int emptyJ = -1;
		for (int i = 0; i < 3; i++) {
			if (gameTable[i][col] == ch) {
				res++;
			} else if (gameTable[i][col] == EMPTY) {
				emptyI = i;
				emptyJ = col;
			}
		}
		return handleTrySetResult(res, emptyI, emptyJ);
	}

	public static boolean trySetToMainDiagonal(char ch) {
		int res = 0;
		int emptyI = -1;
		int emptyJ = -1;
		for (int i = 0; i < 3; i++) {
			if (gameTable[i][i] == ch) {
				res++;
			} else if (gameTable[i][i] == EMPTY) {
				emptyI = emptyJ = i;
			}
		}
		return handleTrySetResult(res, emptyI, emptyJ);
	}

	public static boolean trySetToNotMainDiagonal(char ch) {
		int res = 0;
		int emptyI = -1;
		int emptyJ = -1;
		for (int i = 0; i < 3; i++) {
			if (gameTable[i][3 - i - 1] == ch) {
				res++;
			} else if (gameTable[i][3 - i - 1] == EMPTY) {
				emptyI = i;
				emptyJ = 3 - i - 1;
			}
		}
		return handleTrySetResult(res, emptyI, emptyJ);
	}

	public static boolean handleTrySetResult(int res, int emptyI, int emptyJ) {
		if (res == 2 && emptyI != -1 && emptyJ != -1) {
			gameTable[emptyI][emptyJ] = COMPUTER;
			return true;
		} else {
			return false;
		}
	}

	public static int[][] getVariants(int i, int j) {
		if (i == 0) {
			if (j == 0) {
				return new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 } };
			} else if (j == 1) {
				return new int[][] { { 0, 2 }, { 1, 1 }, { 0, 0 } };
			} else {
				return new int[][] { { 1, 2 }, { 1, 1 }, { 0, 1 } };
			}
		} else if (i == 1) {
			if (j == 0) {
				return new int[][] { { 0, 0 }, { 1, 1 }, { 2, 0 } };
			} else if (j == 1) {
				return new int[][] { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 2 }, { 2, 1 }, { 2, 0 }, { 1, 0 }, { 0, 0 } };
			} else {
				return new int[][] { { 2, 2 }, { 1, 1 }, { 0, 2 } };
			}
		} else {
			if (j == 0) {
				return new int[][] { { 1, 0 }, { 1, 1 }, { 2, 1 } };
			} else if (j == 1) {
				return new int[][] { { 1, 1 }, { 2, 2 }, { 2, 0 } };
			} else {
				return new int[][] { { 1, 2 }, { 2, 1 }, { 1, 1 } };
			}
		}
	}

	public static boolean tryWinOnNextTurn() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameTable[i][j] == COMPUTER) {
					int[][] variants = getVariants(i, j);
					int rowIndex = new Random().nextInt(variants.length);
					for (int k = 0; k < variants.length; k++) {
						int number = variants[rowIndex][0] * 3 + variants[rowIndex][1] + 1;
						if (isCellFree(number)) {
							makeTurn(number, COMPUTER);
							return true;
						}
						rowIndex++;
						if (rowIndex >= variants.length) {
							rowIndex = 0;
						}
					}
				}
			}
		}
		return false;
	}
}
