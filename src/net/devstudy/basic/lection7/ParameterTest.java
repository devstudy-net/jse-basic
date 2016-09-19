package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class ParameterTest {

	public static void main(String[] args) {
		int a = 5; // all primitives + immutable objects
		changePrimitiveParameter(a);
		System.out.println("glob.a=" + a);
		System.out.println("------------------");
		int[] array = { 5 }; // all objects
		changeArray(array);
		System.out.println("glob.array[0]=" + array[0]);
		System.out.println("------------------");
		changeArrayElement(array);
		System.out.println("glob.array[0]=" + array[0]);
		System.out.println("------------------");
		String s = "Hello world";
		changeString(s);
		System.out.println("glob.s=" + s);
	}

	public static void changePrimitiveParameter(int p) {
		p++;
		System.out.println("local.a=" + p);
	}

	public static void changeArray(int[] array) {
		array = new int[] { 5 };
		array[0]++;
		System.out.println("local.array[0]=" + array[0]);
	}

	public static void changeArrayElement(int[] array) {
		array[0]++;
		System.out.println("local.array[0]=" + array[0]);
	}

	public static void changeString(String locStr) {
		locStr = "Hello java";
		System.out.println("local.s=" + locStr);
	}

}
