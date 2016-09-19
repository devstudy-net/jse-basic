package net.devstudy.basic.lection9;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello ";
		System.out.println("length=" + s.length());
		System.out.println("char[0]=" + s.charAt(0));
		System.out.println("beforeTrim=" + s + ", afterTrim=" + s.trim() + ".");
		System.out.println("replace=" + s.replace("lo ", "l!"));
		System.out.println("lower=" + s.toLowerCase());
		System.out.println("upper=" + s.toUpperCase());
		System.out.println("contains=" + s.contains("ll"));
		System.out.println("indexOf=" + s.indexOf('e'));
		System.out.println("indexOf=" + s.indexOf("l"));
		System.out.println("indexOf=" + s.indexOf("l", 3));
		System.out.println("startsWith=" + s.startsWith("He"));
		System.out.println("endsWith=" + s.endsWith("llo"));
		System.out.println("substring=" + s.substring(3));
		System.out.println("--------------------------------------------");
		// concat
		String s2 = s + "world" + "!";
		System.out.println(s2);
		String s3 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != 'l') {
				s3 += String.valueOf(ch);
			}
		}
		System.out.println(s3 + "!");
	}

}
