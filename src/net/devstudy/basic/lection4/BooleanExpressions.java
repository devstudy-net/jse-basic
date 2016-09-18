package net.devstudy.basic.lection4;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class BooleanExpressions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = !b;
		boolean d = a && b;
		boolean e = a & b;
		boolean f = a || b;
		boolean g = a | b;
		boolean h = (a || b) && (!a || !b) || a || !b;
		boolean i = (2 > 1);
		boolean j = (2 == 1);
		boolean k = (2 != 1);
		boolean l = (2 != 1) && (2 >= 5) && (2 <= 4) && (2 < 3);
		System.out.println(k);
		System.out.println(l);
	}

}
