package net.devstudy.basic.lection4;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ExpendedExpressions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = (15 + 4) * 5;
		int b = 7;
		a++; // a = a + 1;
		b--; // b = b - 1;
		a += 3;// a = a + 3;
		b -= 9;
		a *= 2;
		b /= 2;
		int c = a++;
		int d = ++a;
		int e = 2;
		e = e << 1;
		e = e >> 1;
		e = e << 4;
		System.out.println(e);
	}

}
