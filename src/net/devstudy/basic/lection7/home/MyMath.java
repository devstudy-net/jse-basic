package net.devstudy.basic.lection7.home;

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
	public static double cos(double x) {
		double res = 0;
		for (int n = 0; n < 12; n++) {
			res += calcCosItem(x, n);
		}
		return res;
	}
	public static double calcCosItem(double x, int n) {
		double res = n % 2 == 0 ? 1 : -1;
		res *= Math.pow(x, 2 * n);
		res /= factorial(2 * n);
		return res;
	}
	public static double ln(double x) {
		double res = 0;
		for (int n = 1; n < 1000000; n++) {
			res += calcLnItem(x - 1, n);
		}
		return res;
	}
	public static double calcLnItem(double x, int n) {
		return Math.pow(-1, n + 1) * Math.pow(x, n) / n;
	}
	public static void main(String[] args) {
		System.out.println(cos(2));
		System.out.println(Math.cos(2));
		
		System.out.println(ln(2));
		System.out.println(Math.log(2));
	}
}
