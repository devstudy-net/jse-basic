package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class BreakExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i > 5) {
				break;
			}
			System.out.println(i);
		}
		int i = 0;
		while (i < 10) {
			if (i > 5) {
				break;
			}
			System.out.println(i++);
		}
	}

}
