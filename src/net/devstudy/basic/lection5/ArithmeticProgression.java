package net.devstudy.basic.lection5;

import java.util.Scanner;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ArithmeticProgression {

	public static void main(String[] args) {
		int a = 2;
		int d = 4;
		int n = new Scanner(System.in).nextInt();
		System.out.print(a + " ");
		for (int i = 1; i < n; i++) {
			System.out.print((a += d) + " ");
		}
	}

}
