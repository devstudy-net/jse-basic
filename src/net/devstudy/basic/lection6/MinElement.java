package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class MinElement {

	public static void main(String[] args) {
		int array[] = { 1, -4, -4, 0, 4, 2, 8, -5, 7, -2, 9, 0 };
		int result = array.length == 0 ? Integer.MAX_VALUE : array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}
		System.out.println("Min: " + result);
	}

}
