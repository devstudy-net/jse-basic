package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ForExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		for (int i = 0, j = 100; i < j; i++, j--) {
			System.out.println(i + 1);
		}
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + 2);
			}
		}
		for (int i = 1; i > 0;) {
			System.out.println("Infinite loop");
		}
		for (;;) {
			System.out.println("Infinite loop");
		}
	}

}
