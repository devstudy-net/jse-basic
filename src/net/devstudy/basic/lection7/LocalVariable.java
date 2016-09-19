package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class LocalVariable {

	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		if (a == 0) {
			int b = 23;
			System.out.println(b);
		}
		{
			int c = 45;
			System.out.println(c);
		}
		{
			int c = 48;
			System.out.println(c);
		}
	}
}
