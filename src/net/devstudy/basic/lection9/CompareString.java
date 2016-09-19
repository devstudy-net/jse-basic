package net.devstudy.basic.lection9;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class CompareString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "H" + s1.substring(1);
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//
		String s3 = "Hello!";
		String s4 = "Bye!";
		int result = s3.compareToIgnoreCase(s4);
		if (result > 0) {
			System.out.println("s3 > s4");
		} else if (result < 0) {
			System.out.println("s3 < s4");
		} else {
			System.out.println("s3 = s4");
		}
	}

}
