package com.lean.project.euler.level0.euler0012;

/**
 * 这个算法耗时太长，如下：<br>
 * 用时 ： 23903402<br>
 * 76576500
 */
public class Main1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int r = 0;
		int count = 1;
		do {
			r += count++;
		} while (numberComposite(r) <= 500);

		long end = System.currentTimeMillis();
		System.out.println("用时 ： " + (end - start));
		System.out.println(r);
	}

	/**
	 * 返回number的约数的个数
	 * 
	 * @param number
	 * @return
	 */
	public static int numberComposite(long number) {
		if (number == 1) {
			return 1;
		}
		int r = 2;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				r++;
			}
		}
		System.out.println(number + "  " + r);
		return r;
	}
}
