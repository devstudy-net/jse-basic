package net.devstudy.basic.lection8;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class IterativeBinarySearch {

	public static void main(String[] args) {
		int array[] = new int[1024];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int query = 1023;
		int index = binarySearch(array, query);
		System.out.println("Index of " + query + ": " + index);
	}

	public static int binarySearch(int array[], int query) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middleIndex = (high + low) / 2;
			int middleValue = array[middleIndex];
			if (middleValue < query) {
				low = middleIndex + 1;
			} else if (middleValue > query) {
				high = middleIndex - 1;
			} else {
				return middleIndex;
			}
		}
		return -1;
	}
}
