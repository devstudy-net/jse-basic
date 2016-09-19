package net.devstudy.basic.lection8;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class RecursionFactorial {

	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		long res = factorial(6);
		System.out.println(res);
	}

}
