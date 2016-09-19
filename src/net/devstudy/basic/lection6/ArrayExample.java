package net.devstudy.basic.lection6;

import java.util.Arrays;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ArrayExample {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = new int[10];
		for (int i = 0; i < 10; i++) {
			array2[i] = i;
		}
		System.out.println(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		int[][] table1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] table2 = new int[2][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(table1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
