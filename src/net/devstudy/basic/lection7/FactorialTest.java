package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class FactorialTest {

	public static void main(String[] args) {
		long res5 = factorial(5);
		System.out.println("5! = " + res5);
		System.out.println("4! = " + factorial(4));
		int n = 6;
		long res6 = factorial(n);
		System.out.println("6! = " + res6);
		n = 8;
		System.out.println("8! = " + factorial(n));
		showFactorial(7);
	}

	public static long factorial(int n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static void showFactorial(int n) {
		System.out.println(n + "! = " + factorial(n));
	}

}
