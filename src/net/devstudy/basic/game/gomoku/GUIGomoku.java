package net.devstudy.basic.game.gomoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class GUIGomoku {
	private JLabel cells[][] = new JLabel[Gomoku.SIZE][Gomoku.SIZE];
	private JFrame jFrame;

	public GUIGomoku() {
		jFrame = new JFrame("Gomoku");
		createGameUITable();
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.pack();
	}

	private void createGameUITable() {
		jFrame.setLayout(new GridLayout(Gomoku.SIZE, Gomoku.SIZE));
		for (int i = 0; i < Gomoku.SIZE; i++) {
			for (int j = 0; j < Gomoku.SIZE; j++) {
				final int row = i;
				final int col = j;
				JLabel p = new JLabel();
				cells[i][j] = p;
				p.setPreferredSize(new Dimension(45, 45));
				p.setHorizontalAlignment(SwingConstants.CENTER);
				p.setVerticalAlignment(SwingConstants.CENTER);
				p.setFont(new Font(Font.SERIF, Font.PLAIN, 35));
				p.setForeground(Color.BLACK);
				p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				jFrame.add(p);
				p.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						handleHumanTurn(row, col);
					}
				});
			}
		}

		Gomoku.init();
		Gomoku.cells = cells;
	}
	
	private void show(){
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setLocation(dim.width / 2 - jFrame.getSize().width / 2, dim.height / 2 - jFrame.getSize().height / 2);
		jFrame.setVisible(true);
	}

	private void startNewGame() {
		Gomoku.init();
		for (int i = 0; i < Gomoku.SIZE; i++) {
			for (int j = 0; j < Gomoku.SIZE; j++) {
				cells[i][j].setText(String.valueOf(Gomoku.gameTable[i][j]));
				cells[i][j].setFont(new Font(Font.SERIF, Font.PLAIN, 35));
				cells[i][j].setForeground(Color.BLACK);
			}
		}
	}

	private void stopGame() {
		for (int i = 0; i < Gomoku.SIZE; i++) {
			for (int j = 0; j < Gomoku.SIZE; j++) {
				cells[i][j].removeMouseListener(cells[i][j].getMouseListeners()[0]);
			}
		}
	}

	private boolean isWinnerHuman() {
		if (Gomoku.findWinner(Gomoku.HUMAN)) {
			if (JOptionPane.showConfirmDialog(jFrame, "Game over: User win!\nNew game?") == JOptionPane.YES_OPTION) {
				startNewGame();
			} else {
				stopGame();
			}
			return true;
		}
		return false;
	}

	private boolean isWinnerComputer() {
		if (Gomoku.findWinner(Gomoku.COMPUTER)) {
			if (JOptionPane.showConfirmDialog(jFrame, "Game over: Computer wins!\nNew game?") == JOptionPane.YES_OPTION) {
				startNewGame();
			} else {
				stopGame();
			}
			return true;
		}
		return false;
	}

	private boolean isDraw() {
		if (Gomoku.hasEmptyCells()) {
			return false;
		} else {
			if (JOptionPane.showConfirmDialog(jFrame, "Game over: Draw!\nNew game?") == JOptionPane.YES_OPTION) {
				startNewGame();
			} else {
				stopGame();
			}
			return true;
		}
	}

	private void handleHumanTurn(int row, int col) {
		if (Gomoku.isCellFree(row, col)) {
			Gomoku.makeHumanTurn(row, col);
			if (isWinnerHuman()) {
				return;
			}
			if (isDraw()) {
				return;
			}
			Gomoku.makeComputerTurn();
			if (isWinnerComputer()) {
				return;
			}
			if (isDraw()) {
				return;
			}
		} else {
			JOptionPane.showMessageDialog(jFrame, "Cell is not free! Click on free cell!");
		}
	}

	public static void main(String[] args) {
		GUIGomoku w = new GUIGomoku();
		w.show();
	}

}
