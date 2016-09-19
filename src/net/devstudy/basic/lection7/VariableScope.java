package net.devstudy.basic.lection7;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
public class VariableScope {

	public static int var1 = 23; // global variable

	public static void main(String[] args) {
		System.out.println("main.var1=" + var1);
		method1();
		method2();
		int localVar1 = 78;
		method3(localVar1);
		int localVar2 = method4();
		System.out.println("main.c=" + localVar2);
	}

	public static void method1() {
		int var1 = 34;
		System.out.println("metho1.var1=" + var1);
	}

	public static void method2() {
		System.out.println("metho2.var1=" + var1);
	}

	public static void method3(int param) {
		System.out.println("method3.param=" + param);
	}

	public static int method4() {
		int b = 89;
		b++;
		return b;
	}

}
