package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class LinearSearch {

	public static void main(String[] args) {
		int array[] = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int query = 50000;
		int index = -1;
		int iterationCount = 0;
		for (int i = 0; i < array.length; i++) {
			iterationCount++;
			if (array[i] == query) {
				index = i;
				break;
			}
		}
		System.out.println("Index of " + query + ": " + index);
		System.out.println("iterationCount=" + iterationCount);
	}

}
