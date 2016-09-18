package net.devstudy.basic.lection5;

import java.util.Scanner;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ReadCommand2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String cmd = new Scanner(System.in).nextLine();
		while (cmd.charAt(0) != 'q') {
			int value = Integer.parseInt(cmd);
			System.out.println(value * value);
			cmd = new Scanner(System.in).nextLine();
		}
		System.out.println("Bye");
	}

}
