package net.devstudy.basic.lection5.home;

/**
 * 
 *    |   |  
 * -----------
 *    |   |  
 * -----------
 *    |   |  
 *    
 * @author devstudy
 * @see http://devstudy.net
 */
public class ShowGameTable {

	public static void main(String[] args) {
		int size = 20;
		for (int k = 0; k < 3; k++) {
			char ch = ' ';
			if (k > 0) {
				ch = k == 1 ? 'X' : 'O';
			}
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(" " + ch);
					if (j != size - 1) {
						System.out.print(" |");
					}
				}
				System.out.println();
				if (i != size - 1) {
					for (int j = 0; j < size; j++) {
						System.out.print("---");
						if (j != size - 1) {
							System.out.print("-");
						}
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
