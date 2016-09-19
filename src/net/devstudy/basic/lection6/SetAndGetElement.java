package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class SetAndGetElement {

	public static void main(String[] args) {
		int array[] = { 1, -4, -8, 0, 4, 2, 8, -5, 7, -2, 9, 10 };
		System.out.println(array[2]);
		array[2] = 9;
		System.out.println(array[2]);
		System.out.println("Array length: " + array.length);
		System.out.println(array[array.length - 1]);
		System.out.println(array[78]);
	}

}
