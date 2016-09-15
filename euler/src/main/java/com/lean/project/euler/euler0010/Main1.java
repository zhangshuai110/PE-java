package com.lean.project.euler.euler0010;

public class Main1 {

	public static void main(String[] args) {
		long number = 2000000;
		// 这个效率太低，需要改变算法
		System.out.println(sumPrime1(number));
	}

	/**
	 * 一种低效的算法
	 * 
	 * @param number
	 * @return
	 */
	public static long sumPrime1(long number) {
		long r = 0;
		for (int i = 2; i < number; i++) {
			if (com.lean.project.euler.euler0003.Main1.isPrimeNum(i)) {
				r += i;
			}
		}
		return r;
	}

	/**
	 * 如果number是质数，返回true
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPrimeNum(long number) {
		if (number <= 0) {
			return false;
		}
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
