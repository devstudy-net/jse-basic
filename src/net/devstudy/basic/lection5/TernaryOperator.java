package net.devstudy.basic.lection5;
/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c;
		if (a > b) {
			c = a;
		} else {
			c = b;
		}
		System.out.println(c);
		//////////////////////////////////////////
		int d = a > b ? a : b;
		System.out.println(d);
	}

}
