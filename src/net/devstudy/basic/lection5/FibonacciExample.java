package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class FibonacciExample {

	public static void main(String[] args) {
		System.out.print("1 1 ");
		int n = 21;
		int prev0 = 1;
		int prev1 = 1;
		for (int i = 2; i < n; i++) {
			int next = prev0 + prev1;
			System.out.print(next + " ");
			prev0 = prev1;
			prev1 = next;
		}
	}

}
