package com.lean.project.euler.level0.euler0010;

public class Main1 {

	public static void main(String[] args) {
		long number = 2000000;
		// 这个效率太低，需要改变算法
		// System.out.println(sumPrime1(number));
		System.out.println(sumPrime2(number));
	}

	/**
	 * 提供一种搞笑的算法
	 * 
	 * @param number
	 * @return
	 */
	private static long sumPrime2(long number) {
		boolean[] primes = numPrimes(number);
		long r = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == false) {
				r += i;
			}

		}
		return r;
	}

	/**
	 * 计算出小于number的所有素数
	 * 
	 * @param number
	 * @return
	 */
	public static boolean[] numPrimes(long number) {
		boolean[] notPrimeBooleans = new boolean[(int) (number + 1)];
		notPrimeBooleans[0] = true;
		notPrimeBooleans[1] = true;
		double end = Math.sqrt(number);
		for (int i = 2; i < end; i++) {
			if (notPrimeBooleans[i] == false) {
				for (int j = i + 1; j <= number; j++) {
					if (j % i == 0) {
						notPrimeBooleans[j] = true;
					}
				}
			}
		}

		return notPrimeBooleans;
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
			if (com.lean.project.euler.level0.euler0003.Main1.isPrimeNum(i)) {
				r += i;
			}
		}
		return r;
	}

}
