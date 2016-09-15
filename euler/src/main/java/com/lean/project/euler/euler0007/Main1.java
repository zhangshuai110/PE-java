package com.lean.project.euler.euler0007;

public class Main1 {

	public static void main(String[] args) {
		System.out.println(primeTh(10001));
	}

	/**
	 * 找出第num个质数（素数）
	 * 
	 * @param count
	 * @return
	 */
	public static long primeTh(long count) {
		long num = 1;
		while (count > 0) {
			num++;
			if (com.lean.project.euler.euler0003.Main1.isPrimeNum(num)) {
				count--;
			}
		}
		return num;
	}
}
