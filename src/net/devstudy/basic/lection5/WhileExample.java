package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class WhileExample {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(++i);
		}
		i = 0;
		int j = 100;
		while (i < j) {
			System.out.println(++i);
			j--;
		}
		i = 0;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println(i + 2);
			}
			i++;
		}
		while (i > 0) {
			System.out.println("Infinite loop");
		}
		while (2 > 1) {
			System.out.println("Infinite loop");
		}
	}

}
