package net.devstudy.basic.lection6.home;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class CheckWinner {

	public static void main(String[] args) {
		char HUMAN = 'X';
		char COMPUTER = '0';
		char EMPTY = ' ';
		char[][] gameTable = { 
				{ EMPTY, EMPTY, EMPTY }, 
				{ EMPTY, EMPTY, EMPTY }, 
				{ EMPTY, EMPTY, EMPTY } 
		};
		char winner = 0;
		// TODO

		if (winner == HUMAN) {
			System.out.println("Game over: You win!");
		} else if (winner == COMPUTER) {
			System.out.println("Game over: Computer wins!");
		} else {
			System.out.println("Game over: Draw!");
		}
	}

}
