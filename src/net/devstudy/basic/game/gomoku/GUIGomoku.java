package net.devstudy.basic.game.gomoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
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
public class GUIGomoku extends JFrame {
	private static final long serialVersionUID = 1714372457079337160L;
	private JLabel cells[][] = new JLabel[Gomoku.SIZE][Gomoku.SIZE];

	public GUIGomoku() throws HeadlessException {
		super("Gomoku");
		createGameUITable();
	}

	public void createGameUITable() {
		setLayout(new GridLayout(Gomoku.SIZE, Gomoku.SIZE));
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
				add(p);
				p.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						handleHumanTurn(row, col);
					}
				});
			}
		}

		Gomoku.init();
	}

	public void startNewGame() {
		Gomoku.init();
		for (int i = 0; i < Gomoku.SIZE; i++) {
			for (int j = 0; j < Gomoku.SIZE; j++) {
				cells[i][j].setText(String.valueOf(Gomoku.gameTable[i][j]));
				cells[i][j].setFont(new Font(Font.SERIF, Font.PLAIN, 35));
				cells[i][j].setForeground(Color.BLACK);
			}
		}
	}

	public void stopGame() {
		for (int i = 0; i < Gomoku.SIZE; i++) {
			for (int j = 0; j < Gomoku.SIZE; j++) {
				cells[i][j].removeMouseListener(cells[i][j].getMouseListeners()[0]);
			}
		}
	}

	public void handleHumanTurn(int row, int col) {
		if (Gomoku.isCellFree(row, col)) {
			Gomoku.makeHumanTurn(row, col, cells);
			Gomoku.makeComputerTurn(cells);
			char ch = Gomoku.findWinner(cells);
			if (ch == Gomoku.HUMAN) {
				if (JOptionPane.showConfirmDialog(this, "Game over: User win!\nNew game?") == JOptionPane.YES_OPTION) {
					startNewGame();
				} else {
					stopGame();
				}
			} else if (ch == Gomoku.COMPUTER) {
				if (JOptionPane.showConfirmDialog(this, "Game over: Computer wins!\nNew game?") == JOptionPane.YES_OPTION) {
					startNewGame();
				} else {
					stopGame();
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "Cell is not free! Click on free cell!");
		}
	}

	public static void main(String[] args) {
		GUIGomoku w = new GUIGomoku();
		w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		w.setResizable(false);
		w.pack();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		w.setLocation(dim.width / 2 - w.getSize().width / 2, dim.height / 2 - w.getSize().height / 2);
		w.setVisible(true);
	}

}
