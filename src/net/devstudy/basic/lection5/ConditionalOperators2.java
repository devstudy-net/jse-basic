package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ConditionalOperators2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		boolean condition1 = a > b;
		boolean condition2 = a < b;
		if (condition1) {
			System.out.println("A > B");
		} else if (condition2) {
			System.out.println("A < B");
		} else {
			System.out.println("A = B");
		}
		if (a > 0 || a == 0 && !(b <= 0) && b >= -5 || condition1) {
			System.out.println("Complex condition");
		}
	}

}
