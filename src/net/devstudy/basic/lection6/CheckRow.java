package net.devstudy.basic.lection6;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class CheckRow {

	public static void main(String[] args) {
		int[][] array = { 
				{ 2, 5, 8 }, 
				{ -3, 0, 5 } 
		};
		boolean isAllPositive = true;
		for (int i = 0; i < array[0].length; i++) {
			if (array[0][i] < 0) {
				isAllPositive = false;
				break;
			}
		}
		System.out.println("isAllPositive=" + isAllPositive);
	}

}
