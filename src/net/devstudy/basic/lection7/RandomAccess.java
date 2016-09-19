package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class RandomAccess {

	public static void main(String[] args) {
		int[][] array = new int[10][10];
		for (int i = 1; i < array.length; i += 2) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 1;
			}
		}
		printArray(array);
		System.out.println("---------------------------------------------");
		array = new int[9][9];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int value = 0;// (i == j ? 1 : (i == array.length - j - 1 ? 2 : 0));
				if (i == j) {
					value = 1;
				} else if (i == array.length - j - 1) {
					value = 2;
				} else {
					value = 5;
				}
				array[i][j] = value;
			}
		}
		printArray(array);
		printArray(new int[][]{{2, 3}, {3}, {3, 4, 5}});
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
