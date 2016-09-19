package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class BinarySearch {

	public static void main(String[] args) {
		int array[] = new int[1000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int query = 100000;
		int index = -1;
		int iterationCount = 0;
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middleIndex = (high + low) / 2;
			int middleValue = array[middleIndex];
			iterationCount++;
			if (middleValue < query) {
				low = middleIndex + 1;
			} else if (middleValue > query) {
				high = middleIndex - 1;
			} else {
				index = middleIndex;
				break;
			}
		}
		System.out.println("Index of " + query + ": " + index);
		System.out.println("iterationCount=" + iterationCount);
	}

}
