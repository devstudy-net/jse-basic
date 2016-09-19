package net.devstudy.basic.lection6;

import java.util.Arrays;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		double[] array2 = {};
		double[] array3 = { 1., 2., 3., Math.sqrt(2) };
		boolean[] array4 = { true, false, 2 > 1, 6 > 0 && 4 < 0 || !(3 != 2) };
		char[] array5 = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		String[] array6 = { "Hello", "world" };
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		System.out.println(Arrays.toString(array5));
		System.out.println(Arrays.toString(array6));
	}
}
