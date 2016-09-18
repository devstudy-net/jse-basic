package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class MultiplyEmulationExample {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int result = 0;
		for (int i = 0; i < Math.abs(b); i++) {
			result += Math.abs(a);
		}
		if (a < 0 && b > 0 || a > 0 && b < 0) {
			result = -result;
		}
		System.out.println(result);
	}

}
