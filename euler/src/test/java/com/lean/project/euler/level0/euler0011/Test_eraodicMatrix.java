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
		Assert.assertEquals(r1, null, "0r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 4, 3);
		Assert.assertEquals(r2, null, "0r2 : ");

	}

	/**
	 * 测试“由上到下”
	 */
	@Test
	public void test_eraodicMatrix1() {
		int[][] testMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 1);
		Assert.assertEquals(r1, "13", "1r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 2);
		Assert.assertEquals(r2, "35", "1r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 3);
		Assert.assertEquals(r3, "24", "1r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 4);
		Assert.assertEquals(r4, "46", "1r4 : ");

	}

	/**
	 * 测试“由下到上”
	 */
	@Test
	public void test_eraodicMatrix2() {
		int[][] testMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 5);
		Assert.assertEquals(r1, "53", "2r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 6);
		Assert.assertEquals(r2, "31", "2r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 7);
		Assert.assertEquals(r3, "64", "2r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 8);
		Assert.assertEquals(r4, "42", "2r4 : ");

	}

	/**
	 * 测试“由左到右”
	 */
	@Test
	public void test_eraodicMatrix3() {
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 13);
		Assert.assertEquals(r1, "12", "3r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 14);
		Assert.assertEquals(r2, "23", "3r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 15);
		Assert.assertEquals(r3, "45", "3r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 16);
		Assert.assertEquals(r4, "56", "3r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 17);
		Assert.assertEquals(r5, "78", "3r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 18);
		Assert.assertEquals(r6, "89", "3r6 : ");
	}

}
