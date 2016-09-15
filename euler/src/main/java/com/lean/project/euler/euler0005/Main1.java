package com.lean.project.euler.euler0005;

public class Main1 {

	public static void main(String[] args) {
		long i = 2520;
		long next = 0;
		while (true) {
			i = 2520 + (next++) * 20;
			if (isDivided(i)) {
				System.out.println(i);
				break;
			}
		}
	}

	/**
	 * 如果num能被1-20整除，返回true
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isDivided(long num) {
		for (int i = 11; i <= 20; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}
}
