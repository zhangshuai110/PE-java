package com.lean.project.euler.euler0002;
/**
 * n的值小的时候还可以，多了就会报堆栈溢出的错；
 *Exception in thread "main" java.lang.StackOverflowError
 */
public class Main1 {

	public static void main(String[] args) {
		int n = 4000000;
		// int n = 9;
		long r = fibonacci(n);
		System.out.println(r);
	}

	private static long fibonacci(int n) {
		if (n == 0) {
			return 1L;
		} else if (n == 1) {
			return 1L;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

}
