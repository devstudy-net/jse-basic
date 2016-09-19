package net.devstudy.basic.lection6.home;

import java.util.Arrays;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class BubbleSort {

	public static void main(String[] args) {
		int array[] = { 7, 0, -4, 3, 1, -2, 5 };

		int iterationCount = 0;
		int firstIndex = 0;
		while (true) {
			boolean swap = false;
			for (int i = array.length -1; i > firstIndex; i--) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					swap = true;
				}
				iterationCount++;
			}
			if (swap) {
				firstIndex++;
			} else {
				break;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("length=" + array.length + ", iterationCount=" + iterationCount);
	}

}
