package net.devstudy.basic.lection5;

import java.util.Scanner;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ReadCommand {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			String cmd = new Scanner(System.in).nextLine();
			if (cmd.charAt(0) == 'q') {
				System.out.println("Bye");
				break;
			} else {
				int value = Integer.parseInt(cmd);
				System.out.println(value * value);
			}
		}
	}

}
