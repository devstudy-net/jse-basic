package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class NotFoundMessage {

	public static void main(String[] args) {
		int array[] = { 1, -4};
		int element = -4;
		
		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}
	}

}
