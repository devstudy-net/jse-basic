package net.devstudy.basic.lection7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class SinFunction {

	public static double sin(double x) {
		double res = 0;
		for (int n = 1; n < 100; n++) {
			res += calcItem(x, n);
		}
		return res;
	}

	public static double calcItem(double x, int n) {
		BigDecimal res = ((n + 1) % 2) == 0 ? BigDecimal.ONE : BigDecimal.ZERO.subtract(BigDecimal.ONE);
		res = res.multiply(pow(BigDecimal.valueOf(x), 2 * n - 1));
		res = res.divide(new BigDecimal(factorial(2 * n - 1)), MathContext.DECIMAL128);
		if (n == 99) {
			System.out.println(factorial(2 * n - 1));
		}
		return res.doubleValue();
	}

	public static BigDecimal pow(BigDecimal x, int n) {
		BigDecimal res = x;
		for (int i = 0; i < n - 1; i++) {
			res = res.multiply(x);
		}
		return res;
	}

	public static BigInteger factorial(int n) {
		BigInteger res = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(sin(2));
		System.out.println(Math.sin(2));
	}

}
