package com.lean.project.euler.level0.euler0001;

public class Main {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i < 1000; i++) {

			if (times3_5(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	private static boolean times3_5(int i) {
		if (i % 3 == 0 || i % 5 == 0) {
			return true;
		}
		return false;
	}

}
