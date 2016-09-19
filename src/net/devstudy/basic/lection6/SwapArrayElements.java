package net.devstudy.basic.lection6;

import java.util.Arrays;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class SwapArrayElements {

	public static void main(String[] args) {
		int array[] = { 1, -4, -4, 0, 4, 2, 8, -5, 7, -2, 9, 0 };
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
