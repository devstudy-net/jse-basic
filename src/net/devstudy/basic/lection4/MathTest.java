package net.devstudy.basic.lection4;
/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class MathTest {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = (int) Math.pow(a, b);
		double d = Math.pow(a, -b);
		System.out.println("c = "+c);
		System.out.println("a ^ b = "+c);
		System.out.println("2 ^ -3 = "+d);
		System.out.println(Math.sin(2));
		System.out.println(Math.pow(a, b));
		System.out.println(Math.abs(-3.));
		System.out.println("exp="+Math.exp(1));
		System.out.println(Math.max(2, 2.000000000000000000000001));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(2.48));
	}

}
