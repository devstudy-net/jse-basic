package net.devstudy.basic.lection6.home;

import java.util.Arrays;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class InsertionSort {

	public static void main(String[] args) {
		int array[] = { 7, 0, -4, 3, 1, -2, 5 };

		int iterationCount = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
				iterationCount++;
				int temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("length=" + array.length + ", iterationCount=" + iterationCount);
	}
}
