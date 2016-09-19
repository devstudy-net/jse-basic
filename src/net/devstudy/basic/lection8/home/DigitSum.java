package net.devstudy.basic.lection8.home;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class DigitSum {

	public static void main(String[] args) {
		System.out.println(recursive(12345)); // 15
		System.out.println(iterative(12345)); // 15
		System.out.println(recursive(111)); // 3
		System.out.println(iterative(111)); // 3
	}

	public static int recursive(int number) {
		if (number < 10) {
			return number;
		} else {
			return number % 10 + recursive(number / 10);
		}
	}

	public static int iterative(int number) {
		int sum = 0;
		while(number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}
