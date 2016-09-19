package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class SimpleSearch {

	public static void main(String[] args) {
		int array[] = { 1, -4, -4, 0, 4, 2, 8, -5, 7, -2, 9, 0 };
		int element = -5;
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				index = i;
				break;
			}
		}
		System.out.println("Index of " + element + " is " + index);
	}

}
