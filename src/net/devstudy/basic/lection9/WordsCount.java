package net.devstudy.basic.lection9;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class WordsCount {

	public static void main(String[] args) {
		String text = "Java is a general-purpose computer programming language that is concurrent,class-based,"
				+ "object-oriented, and specifically designed to have as few implementation dependencies as possible";
		System.out.println(getWordsCount(text));
		System.out.println(getWordsCount(""));
		System.out.println(getWordsCount("Hello"));
		System.out.println(getWordsCount("Hello world"));
		System.out.println(getWordsCount("Hello world!"));
		System.out.println(getWordsCount("Hello -!!!--- guys!"));
	}

	public static int getWordsCount(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (" ,.!?:-".indexOf(ch) != -1) {
				if (i != text.length() - 1) {
					if (i > 0) {
						if (" ,.!?:-".indexOf(text.charAt(i - 1)) == -1) {
							count++;
						}
					}
				}
			}
		}
		if (text.length() > 0) {
			count++;
		}
		return count;
	}

}
