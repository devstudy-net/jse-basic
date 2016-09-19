package net.devstudy.basic.lection5.home;

import java.util.Scanner;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class ComplexCalculator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please input operator: {+,-,*,/,%,^,!,v,2,3}");
		char ch = new Scanner(System.in).nextLine().charAt(0);
		System.out.println("Please input a:");
		int a = new Scanner(System.in).nextInt();
		if (ch == 'v') {
			if (a >= 0) {
				System.out.println("sqrt(a)=" + Math.sqrt(a));
			} else {
				System.out.println("Invalid argument for sqrt : " + a);
			}
		} else if (ch == '2') {
			System.out.println("a^2=" + (a * a));
		} else if (ch == '3') {
			System.out.println("a^3=" + (a * a * a));
		} else if (ch == '!') {
			if (a >= 0 && a <= 25) {
				long res = 1;
				for (int i = 1; i <= a; i++) {
					res *= i;
				}
				System.out.println("a! = " + res);
			} else {
				System.out.println("Invalid argument for factorial : " + a);
			}
		} else {
			System.out.println("Please input b:");
			int b = new Scanner(System.in).nextInt();
			if (ch == '+') {
				System.out.println("a + b = " + (a + b));
			} else if (ch == '-') {
				System.out.println("a - b = " + (a - b));
			} else if (ch == '*') {
				System.out.println("a * b = " + (a * b));
			} else if (ch == '/') {
				System.out.println("a / b = " + (a / b));
			} else if (ch == '%') {
				System.out.println("a % b = " + (a % b));
			} else if (ch == '^') {
				System.out.println("a ^ b = " + Math.pow(a, b));
			} else {
				System.out.println("Unsupported operator: " + ch);
			}
		}
	}
}
