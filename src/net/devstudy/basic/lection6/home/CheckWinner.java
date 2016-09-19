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
				{ COMPUTER, COMPUTER, COMPUTER }, 
				{ EMPTY, EMPTY, EMPTY }, 
				{ EMPTY, EMPTY, EMPTY } 
		};
		char winner = 0;
		// --------------------------------------- start --------------------------------------- 
		// Check rows			
		for (int i = 0; i < 3; i++) {
			if (gameTable[i][0] == gameTable[i][1] && gameTable[i][1] == gameTable[i][2] && gameTable[i][2] != EMPTY) {
				winner = gameTable[i][0];
				break;
			}
		}
		if(winner == 0) {
			// Check columns
			for (int j = 0; j < 3; j++) {
				if (gameTable[0][j] == gameTable[1][j] && gameTable[1][j] == gameTable[2][j] && gameTable[2][j] != EMPTY) {
					winner = gameTable[0][j];
					break;
				}
			}
			if(winner == 0) {
				// Check not main diagonal
				if (gameTable[0][2] == gameTable[1][1] && gameTable[1][1] == gameTable[2][0] && gameTable[2][0] != EMPTY) {
					winner = gameTable[0][2];
				} else
				// Check main diagonal
				if (gameTable[0][0] == gameTable[1][1] && gameTable[1][1] == gameTable[2][2] && gameTable[2][2] != EMPTY) {
					winner = gameTable[0][0];
				} 
			}
		}
		// ---------------------------------------  end  --------------------------------------- 
		if (winner == HUMAN) {
			System.out.println("Game over: You win!");
		} else if (winner == COMPUTER) {
			System.out.println("Game over: Computer wins!");
		} else {
			System.out.println("Game over: No winner!");
		}
	}

}
