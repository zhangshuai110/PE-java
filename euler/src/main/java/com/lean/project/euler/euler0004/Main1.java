package com.lean.project.euler.euler0004;

/*
 * 回文数就是从前往后和从后往前读都一样的数。
 *
 */
public class Main1 {

	public static void main(String[] args) {
		long r = 0;
		for (int i = 999; i > 1; i--) {
			for (int j = 999; j > 1; j--) {
				long xj = i * j;
				if (isPalindromeNumber(xj)) {
					if (r < xj) {
						r = xj;
					}

				}
			}
		}
		System.out.println(r);
	}

	/**
	 * 如果i是回文数，返回true
	 * 
	 * @param i
	 * @return
	 */
	public static boolean isPalindromeNumber(long i) {
		String iString = "" + i;
		String palindromeString = "";
		for (int n = 0; n < iString.length(); n++) {
			palindromeString += iString.charAt(iString.length() - n - 1);
		}
		return iString.equals(palindromeString);
	}

}
