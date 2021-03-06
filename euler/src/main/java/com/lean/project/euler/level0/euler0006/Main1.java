package com.lean.project.euler.level0.euler0006;

public class Main1 {

	public static void main(String[] args) {
		System.out.println(sumSquare(100) - squareSum(100));
	}

	/**
	 * 计算num的和平方
	 * 
	 * @param num
	 * @return
	 */
	public static long sumSquare(long num) {
		long r = 0;
		for (int i = 1; i <= num; i++) {
			r += i;
		}
		return r * r;
	}

	/**
	 * 计算1到num的平方和
	 * 
	 * @param num
	 * @return
	 */
	public static long squareSum(long num) {
		long r = 0;
		for (int i = 1; i <= num; i++) {
			r += i * i;
		}
		return r;
	}
}
