package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class MethodsExample {

	public static void main(String[] args) {
		method1();
		method3(23, true, 'A');
		
		method4();
		method4(1);
		method4(1,2,3,4,5);
		
		int r = method5();
		System.out.println(r);
		
		System.out.println(method7(34));
	}

	public static void method1() {
		System.out.println("Hello world");
	}

	public static void method2(int param1) {
	}

	public static void method3(int param1, boolean param2, char param3) {
		System.out.println(param1);
	}

	public static void method3(int[] arrayParam) {
	}

	public static void method4(int... params) {
	}

	public static int method5() {
		int c = 1 + 2;
		return c;
	}

	public static double method6() {
		return 1.;
	}

	public static String method7(int param1) {
		return "Hello World";
	}
}

