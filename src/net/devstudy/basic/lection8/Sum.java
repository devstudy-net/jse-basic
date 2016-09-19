package net.devstudy.basic.lection8;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class Sum {

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		int n = 40000000;
		System.out.println("iterative: " + iterativeSum(n) + "->" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		System.out.println("recursive: " + recursiveSum(n) + "->" + (System.currentTimeMillis() - t));
		t = System.currentTimeMillis();
		System.out.println("analitic: " + analiticSum(n) + "->" + (System.currentTimeMillis() - t));
	}

	public static long iterativeSum(long n) {
		long res = 0;
		for (int i = 0; i < n; i++) {
		res += (i + 1);
		}
		return res;
	}
	//
	public static long recursiveSum(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n + recursiveSum(n - 1);
		}
	}

	public static long analiticSum(long n) {
		// (a1 + an) * n / 2;
		return ((1 + n) * n) / 2;
	}

}
