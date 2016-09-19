package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class MyMath {

	public static long factorial(int n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static double sin(double x) {
		double res = 0;
		for (int n = 1; n < 12; n++) {
			res += calcSinItem(x, n);
		}
		return res;
	}

	public static double calcSinItem(double x, int n) {
		double res = Math.pow(-1, n + 1) * Math.pow(x, 2 * n - 1);
		res /= factorial(2 * n - 1);
		return res;
	}

	public static double e(double x) {
		double res = 0;
		for (int n = 0; n < 31; n++) {
			res += calcEItem(x, n);
		}
		return res;
	}

	public static double calcEItem(double x, int n) {
		return Math.pow(x, n) / factorial(n);
	}

	public static void main(String[] args) {
		System.out.println(sin(2));
		System.out.println(Math.sin(2));
		System.out.println(e(2));
		System.out.println(Math.pow(Math.E, 2));
		System.out.println(e(0.5));
		System.out.println(Math.pow(Math.E, 0.5));
	}

}
