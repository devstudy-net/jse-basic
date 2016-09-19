package net.devstudy.basic.lection8.home;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class PrintArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		print(array);
		print2(array);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void print2(int[] array) {
		//TODO
	}

}
