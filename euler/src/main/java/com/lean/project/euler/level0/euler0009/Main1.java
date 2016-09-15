package com.lean.project.euler.level0.euler0009;

public class Main1 {

	public static void main(String[] args) {
		for (int a = 0; a < 1000; a++) {
			for (int b = 0; b < 1000; b++) {
				int c = 1000 - a - b;
				if (Main1.checkTripet(a, b, c)) {
					System.out.println(a * b * c);
				}
			}
		}
	}

	/**
	 * 检查a、b、c是否符合特殊毕达哥拉斯三元组，如下：<br>
	 * 毕达哥拉斯三元组是三个自然数a < b < c组成的集合，并满足
	 * 
	 * a2 + b2 = c2
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean checkTripet(int a, int b, int c) {
		if (a < b && b < c) {
			if (c * c == a * a + b * b) {
				return true;
			}
		}
		return false;
	}
}
