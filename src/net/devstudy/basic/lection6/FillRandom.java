package net.devstudy.basic.lection6;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class FillRandom {

	public static void main(String[] args) {
		int array[] = new int[10];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = new Random().nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(array));
	}
}
