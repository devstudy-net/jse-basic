package net.devstudy.basic.lection4;

import java.util.Scanner;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class InOut {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		System.out.println(a);
		String s = new Scanner(System.in).nextLine();
		System.out.println(s);
		boolean b = new Scanner(System.in).nextBoolean();
		System.out.println(b);
		double d = new Scanner(System.in).nextDouble();
		System.out.println(d);
		char c = new Scanner(System.in).nextLine().charAt(0);
		System.out.println(c);
	}
}
