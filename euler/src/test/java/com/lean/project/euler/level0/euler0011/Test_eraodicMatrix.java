package com.lean.project.euler.level0.euler0011;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_eraodicMatrix {
	/**
	 * 测试返回值为null的情况
	 */
	@Test
	public void test_eraodicMatrix0() {
		int[][] testMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 4, 2);
		Assert.assertEquals(r1, null, "r1 : ");

		// String r2 = Main1.ergodicMatrix(testMatrix, 3, 3);
		// Assert.assertEquals(r2, null, "r2 : ");

	}

	/**
	 * 测试“由上到下”
	 */
	@Test
	public void test_eraodicMatrix1() {
		int[][] testMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 1);
		Assert.assertEquals(r1, "13", "r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 2);
		Assert.assertEquals(r2, "35", "r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 3);
		Assert.assertEquals(r3, "24", "r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 4);
		Assert.assertEquals(r4, "46", "r4 : ");

	}

	/**
	 * 测试“由下到上”
	 */
	@Test
	public void test_eraodicMatrix2() {
		int[][] testMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 5);
		Assert.assertEquals(r1, "53", "r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 6);
		Assert.assertEquals(r2, "31", "r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 7);
		Assert.assertEquals(r3, "64", "r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 8);
		Assert.assertEquals(r4, "42", "r4 : ");

	}
}
