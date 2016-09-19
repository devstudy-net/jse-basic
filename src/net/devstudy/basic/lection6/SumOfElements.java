package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class SumOfElements {

	public static void main(String[] args) {
		int array[] = { 1, -4, -4, 0, 4, 2, 8, -5, 7, -2, 9, 0 };
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		System.out.println("Sum: " + result);
	}
}
