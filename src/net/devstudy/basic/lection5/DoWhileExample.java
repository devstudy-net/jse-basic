package net.devstudy.basic.lection5;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class DoWhileExample {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(++i);
		}
		System.out.println("--------------------------");
		i = 0;
		do {
			System.out.println(++i);
		} while (i < 10);
	}

}
