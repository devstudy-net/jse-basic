package net.devstudy.basic.lection4;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class TypeConvert {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i1 = 65;
		double d1 = i1;
		byte bt1 = (byte) i1;
		char ch1 = (char) i1;
		char ch2 = '0';
		int i2 = ch2;
		String s1 = String.valueOf(i2);
		String s2 = String.valueOf(ch2);
		String s3 = "120";
		int i3 = Integer.parseInt(s3);
		s3 = "120.34";
		double d2 = Double.parseDouble(s3);
		String s4 = String.valueOf(true);
		boolean b1 = Boolean.parseBoolean(s4);
		char ch3 = s3.charAt(0);
		System.out.println();
	}
}
