package net.devstudy.basic.lection8.home;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class FibonacciTest {
	// 0=1 1=1 2=2 3=3 4=5 5=8 6=13 7=21 8=34 9=55 10=89
	// 11=144 12=233 13=377 14=610 15=987 16=1597 17=2584 18=4181 19=6765 20=10946
	public static void main(String[] args) {
		System.out.println(iterative(5));
		System.out.println(recursive(5));
		System.out.println(iterative(15));
		System.out.println(recursive(15));
	}

	public static int iterative(int index) {
		if(index == 0 || index == 1) {
			return 1;
		}
		int prev0 = 1;
		int prev1 = 1;
		int next = prev0 + prev1;
		for (int i = 2; i < index; i++) {
			prev0 = prev1;
			prev1 = next;
			next = prev0 + prev1;
		}
		return next;
	}
	
	public static int recursive(int index) {
		if(index == 0 || index == 1) {
			return 1;
		} else {
			return recursive(index - 1) + recursive(index - 2);
		}
	}
}
