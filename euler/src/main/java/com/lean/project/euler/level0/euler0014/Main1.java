package com.lean.project.euler.level0.euler0014;

import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int r = 0;
		int count = 0;
		for (int i = 1; i < 1000000; i++) {
			int exCount = sequenceItemCount(i);
			// System.out.println(i + " " + exCount);
			if (count < exCount) {
				count = exCount;
				r = i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("用时 ： " + (end - start));
		System.out.println(r);
	}

	/**
	 * 返回从number开始的序列的个数，序列规则如下：<br>
	 * n → n/2 (n is even)<br>
	 * n → 3n + 1 (n is odd)<br>
	 * Using the rule above and starting with 13, we generate the following
	 * sequence:<br>
	 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	 * 
	 * @param number
	 * @return
	 */
	public static int sequenceItemCount(long number) {
		if (number <= 0) {
			return 0;
		}
		int count = 1;
		while (true) {
			if (number % 2 == 0) {
				number = number / 2;
				// System.out.println("/2 = " + number);
			} else {
				number = 3 * number + 1;
				// System.out.println("*3 + 1 = " + number);
			}
			count++;
			if (number == 1) {
				break;
			}
			if (number < 0) {
				break;
			}
		}
		return count;
	}
}
