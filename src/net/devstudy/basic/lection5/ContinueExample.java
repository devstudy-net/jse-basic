package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("---------------------");
		int i = 0;
		while (i < 10) {
			if (i % 2 == 1) {
				++i;
				continue;
			}
			System.out.println(i++);
		}
	}

}
