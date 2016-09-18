package net.devstudy.basic.lection4;

import java.math.BigDecimal;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ArithmeticExpressions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 15;
		int b = 7;
		int c = a + b; // a + 8;
		int d = a - b; // 5 – 9;
		int e = a * b; // (2 + 4) * (7 – 4);
		int f = a / b;
		System.out.println(f);
		int g = a % b;
		double h = a / b;
		double i = (double) a / b;
		int k = 0x7FFFFFFF;
		int l = k + 1;
		int m = k + 2137483649;
		
		double j = 1.03 - 0.42;
		BigDecimal bd = new BigDecimal("1.03").subtract(new BigDecimal("0.42"));
		System.out.println(j);
		System.out.println(bd);
		System.out.println(k);
	}

}
