package net.devstudy.basic.lection6;

import java.util.Arrays;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class GetAccessArrayElement {

	public static void main(String[] args) {
		int[] array = { 1, -4, 5, 2, 0, -4, -9, -2, 6, 7 };
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n---------------------------------");
		int[][] array2 = { { 2, -4 }, { 3, 5 }, { 2, 2 }, { -5, 0 } };
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		array2 = new int[][] { { 2 }, { 3, 5 }, { 2, 2, 6 }, { -5, 0, -7, 8 } };
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
