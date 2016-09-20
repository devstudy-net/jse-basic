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
	public static char NO_WINNER = 0;
	public static char EMPTY = ' ';
	public static char HUMAN = 'X';
	public static char COMPUTER = 'O';
	public static char[][] gameTable = new char[SIZE][SIZE];

	public static void init() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				gameTable[i][j] = EMPTY;
			}
		}
	}

	public static void makeComputerTurn(JLabel cells[][]) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (gameTable[i][j] == EMPTY) {
					gameTable[i][j] = COMPUTER;
					cells[i][j].setText(String.valueOf(gameTable[i][j]));
					return;
				}
			}
		}
	}
	
	public static boolean isCellFree(int i, int j) {
		return gameTable[i][j] == EMPTY;
	}
	
	public static void makeHumanTurn(int i, int j, JLabel cells[][]) {
		gameTable[i][j] = HUMAN;
		cells[i][j].setText(String.valueOf(gameTable[i][j]));
	}
	
	public static char findWinner(JLabel cells[][]) {
		int count = 0;
		int[][] winCells = new int[5][2];
		char ch = NO_WINNER;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if(gameTable[i][j] != EMPTY) {
					if(gameTable[i][j] != ch) {
						ch = gameTable[i][j];
						count = 1;
						winCells[count-1][0] = i;
						winCells[count-1][1] = j;
					} else {
						count++;
						winCells[count-1][0] = i;
						winCells[count-1][1] = j;
						if(count == 5) {
							for(int k=0;k<5;k++) {
								int row = winCells[k][0];
								int col = winCells[k][1];
								cells[row][col].setForeground(Color.RED);
								cells[row][col].setFont(new Font(Font.SERIF, Font.BOLD, 35));
							}
							return ch;
						}
					}
				}
			}
		}
		
		return NO_WINNER;
	}
}
