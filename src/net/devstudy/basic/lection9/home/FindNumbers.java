package net.devstudy.basic.lection9.home;

import java.util.Arrays;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class FindNumbers {
	public static void main(String[] args) {
		String text = "assew12345ht 67  jhhggv -9 mknj - --4 tt -5-6-s,jn  ljkh  4 ooki 0 6666 -";
		System.out.println(Arrays.toString(find(text)));
	}
	
	public static boolean isDigit(char ch) {
		return "0123456789".indexOf(ch) != -1;
	}

	public static int[] find(String text) {
		int[] numbers = new int[text.length()];
		int count = 0;
		String number = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == '-') {
				if (i != text.length() - 1) {
					char nextChar = text.charAt(i + 1);
					if(isDigit(nextChar)) {
						if(number.length() == 0) {
							number += String.valueOf(ch) + String.valueOf(nextChar);
							i++;
						} else {
							if(number.equals("-")) {
								number += String.valueOf(nextChar);
								i++;
							} else{
								numbers[count++] = Integer.parseInt(number);
								number = String.valueOf(ch) + String.valueOf(nextChar);
								i++;
							}
						}
					}
				}
			} else if (isDigit(ch)) {
				number += String.valueOf(ch);
			} else {
				if (number.length() != 0) {
					numbers[count++] = Integer.parseInt(number);
					number = "";
				}
			}
		}
		if (number.length() != 0) {
			numbers[count++] = Integer.parseInt(number);
			number = "";
		}
		int[] res = new int[count];
		for (int i = 0; i < count; i++) {
			res[i] = numbers[i];
		}
		return res;
	}
}
