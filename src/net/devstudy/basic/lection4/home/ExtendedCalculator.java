package net.devstudy.basic.lection4.home;

import java.util.Scanner;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class ExtendedCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please input a:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Please input b:");
		int b = new Scanner(System.in).nextInt();
		System.out.println("a++=" + (++a));
		System.out.println("b--=" + (--b));
		System.out.println("a>>1=" + (a>>1));
		System.out.println("a /2=" + (a/2));
		System.out.println("a<<1=" + (a<<1));
		System.out.println("a *2=" + (a*2));
	}
}
