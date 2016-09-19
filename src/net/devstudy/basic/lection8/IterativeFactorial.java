package net.devstudy.basic.lection8;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class IterativeFactorial {

	public static long factorial(int n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		long res = factorial(6);
		System.out.println(res);
	}
}
