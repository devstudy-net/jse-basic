package net.devstudy.basic.lection8;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int array[] = new int[1024];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int query = 1023;
		int index = binarySearch(array, query, 0, array.length - 1);
		System.out.println("Index of " + query + ": " + index);
	}

	public static int binarySearch(int array[], int query, int low, int high) {
		int middleIndex = (high + low) / 2;
		int middleValue = array[middleIndex];
		if (middleValue == query) {
			return middleIndex;
		} else if (low == high) {
			return -1;
		} else if (middleValue < query) {
			return binarySearch(array, query, middleIndex + 1, high);
		} else {
			return binarySearch(array, query, low, middleIndex - 1);
		}
	}

}
