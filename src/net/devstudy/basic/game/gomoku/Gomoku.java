package net.devstudy.basic.game.gomoku;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class Gomoku {
	public static int SIZE = 15;
	public static int WIN_COUNT = 5;

	public static char NO_WINNER = 0;
	public static char EMPTY = ' ';
	public static char HUMAN = 'X';
	public static char COMPUTER = 'O';

	public static char[][] gameTable = new char[SIZE][SIZE];
	public static JLabel cells[][];

	public static int count = 0;
	public static int[][] winningCoordinates = new int[WIN_COUNT][2];

	public static void init() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				gameTable[i][j] = EMPTY;
			}
		}
	}

	public static void makeTurn(int i, int j, char figure) {
		gameTable[i][j] = figure;
		drawFigure(i, j);
	}

	public static void drawFigure(int i, int j) {
		cells[i][j].setText(String.valueOf(gameTable[i][j]));
	}

	public static boolean isCellFree(int i, int j) {
		return gameTable[i][j] == EMPTY;
	}

	public static void makeHumanTurn(int i, int j) {
		makeTurn(i, j, HUMAN);
	}

	public static boolean hasEmptyCells() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (gameTable[i][j] == EMPTY) {
					return true;
				}
			}
		}
		return false;
	}

	public static void clear() {
		count = 0;
	}

	public static void addWinningCoordinate(int row, int col) {
		winningCoordinates[count][0] = row;
		winningCoordinates[count][1] = col;
		count++;
	}

	public static void markWinningCombinationByRedColor() {
		for (int k = 0; k < 5; k++) {
			int row = winningCoordinates[k][0];
			int col = winningCoordinates[k][1];
			cells[row][col].setForeground(Color.RED);
			cells[row][col].setFont(new Font(Font.SERIF, Font.BOLD, 35));
		}
	}
	
	public static void makeComputerTurn() {
		// FIXME !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (gameTable[i][j] == EMPTY) {
					makeTurn(i, j, COMPUTER); // !IMPORTANT
					return;
				}
			}
		}
		// FIXME !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public static boolean findWinnerByRow(char figure) {
		// FIXME !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		for (int i = 0; i < SIZE; i++) {
			clear();
			int count = 0;
			for (int k = 0; k < WIN_COUNT; k++) {
				if(gameTable[i][k] == figure) {
					addWinningCoordinate(i, k);
					count++;
				}
			}
			if(count == 5) {
				markWinningCombinationByRedColor();
				return true;
			}
		}
		return false;
		// FIXME !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public static boolean findWinner(char figure) {
		// FIXME !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if (findWinnerByRow(figure)) {
			return true;
		}
		return false;
		// FIXME !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public static void main(String[] args) {
		GUIGomoku.main(args);
	}
}
