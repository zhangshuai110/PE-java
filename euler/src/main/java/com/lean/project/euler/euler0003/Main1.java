package com.lean.project.euler.euler0003;

/*
 * 质数（prime number）又称素数，有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。
 */
public class Main1 {

	public static void main(String[] args) {
		long n = 600851475143l;
		long fristPrime = 2;
		long r = 2;
		do {
			fristPrime = fristPrime(n);
			n /= fristPrime;
			if (fristPrime > r) {
				r = fristPrime;
			}
			if (isPrimeNum(n)) {
				if (n > r) {
					r = n;
				}	
				break;
			}
		} while (true);

		System.out.println(r);
	}

	/**
	 * 找出number的第一个质因数，如果没有返回他本身
	 * 
	 * @param number
	 * @param primes
	 * @return
	 */
	public static long fristPrime(long number) {
		for (int i = 2; i < number; i++) {
			if (isPrimeNum(i) && number % i == 0) {
				return i;
			}
		}
		return number;
	}

	/**
	 * 如果number是质数，返回true
	 * 
	 * @param number
	 * @return
	 */
	private static boolean isPrimeNum(long number) {
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
