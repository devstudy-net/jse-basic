package net.devstudy.basic.lection5.home;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class DisplayX {

	public static void main(String[] args) {
		int col = 16;
		int row = 7;
		for (int j = 0; j < row; j++) {
			int value = j < (row / 2) ? j + 1 : row - j;
			int shift = j < (row / 2) ? j * 2 : (row - j - 1) * 2;
			for (int i = 0; i < shift; i++) {
				System.out.print("  ");
			}
			for (int i = 0; i < col - 2 * shift; i++) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
