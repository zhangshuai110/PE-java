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
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 1);
		Assert.assertEquals(r1, "1,4,", "4r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 2);
		Assert.assertEquals(r2, "4,7,", "4r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 3);
		Assert.assertEquals(r3, "7,10,", "4r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 5);
		Assert.assertEquals(r4, "13,16,", "4r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 6);
		Assert.assertEquals(r5, "2,5,", "4r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 10);
		Assert.assertEquals(r6, "14,17,", "4r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 12);
		Assert.assertEquals(r7, "6,9,", "4r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 15);
		Assert.assertEquals(r8, "15,18,", "4r8 : ");
	}

	/**
	 * 测试“由下到上”
	 */
	// @Test
	// public void test_eraodicMatrix2() {
	// int[][] testMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
	// String r1 = Main1.ergodicMatrix(testMatrix, 2, 5);
	// Assert.assertEquals(r1, "53", "2r1 : ");
	//
	// String r2 = Main1.ergodicMatrix(testMatrix, 2, 6);
	// Assert.assertEquals(r2, "31", "2r2 : ");
	//
	// String r3 = Main1.ergodicMatrix(testMatrix, 2, 7);
	// Assert.assertEquals(r3, "64", "2r3 : ");
	//
	// String r4 = Main1.ergodicMatrix(testMatrix, 2, 8);
	// Assert.assertEquals(r4, "42", "2r4 : ");
	//
	// }

	/**
	 * 测试“由左到右”
	 */
	// @Test
	// public void test_eraodicMatrix3() {
	// int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	// String r1 = Main1.ergodicMatrix(testMatrix, 2, 13);
	// Assert.assertEquals(r1, "12", "3r1 : ");
	//
	// String r2 = Main1.ergodicMatrix(testMatrix, 2, 14);
	// Assert.assertEquals(r2, "23", "3r2 : ");
	//
	// String r3 = Main1.ergodicMatrix(testMatrix, 2, 15);
	// Assert.assertEquals(r3, "45", "3r3 : ");
	//
	// String r4 = Main1.ergodicMatrix(testMatrix, 2, 16);
	// Assert.assertEquals(r4, "56", "3r4 : ");
	//
	// String r5 = Main1.ergodicMatrix(testMatrix, 2, 17);
	// Assert.assertEquals(r5, "78", "3r5 : ");
	//
	// String r6 = Main1.ergodicMatrix(testMatrix, 2, 18);
	// Assert.assertEquals(r6, "89", "3r6 : ");
	// }

	/**
	 * 测试“由左到右”
	 */
	// @Test
	// public void test_eraodicMatrix4() {
	// int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11,
	// 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
	// String r1 = Main1.ergodicMatrix(testMatrix, 2, 1);
	// Assert.assertEquals(r1, "14", "4r1 : ");
	//
	// String r2 = Main1.ergodicMatrix(testMatrix, 2, 2);
	// Assert.assertEquals(r2, "47", "4r2 : ");
	//
	// String r3 = Main1.ergodicMatrix(testMatrix, 2, 3);
	// Assert.assertEquals(r3, "1", "4r3 : ");

	// String r4 = Main1.ergodicMatrix(testMatrix, 2, 16);
	// Assert.assertEquals(r4, "56", "4r4 : ");
	//
	// String r5 = Main1.ergodicMatrix(testMatrix, 2, 17);
	// Assert.assertEquals(r5, "78", "4r5 : ");
	//
	// String r6 = Main1.ergodicMatrix(testMatrix, 2, 18);
	// Assert.assertEquals(r6, "89", "4r6 : ");
	// }

	/**
	 * 测试“由右到左”
	 */
	// @Test
	// public void test_eraodicMatrix5() {
	// int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	// String r1 = Main1.ergodicMatrix(testMatrix, 2, 19);
	// Assert.assertEquals(r1, "32", "4r1 : ");
	//
	// String r2 = Main1.ergodicMatrix(testMatrix, 2, 20);
	// Assert.assertEquals(r2, "21", "4r2 : ");
	//
	// String r3 = Main1.ergodicMatrix(testMatrix, 2, 21);
	// Assert.assertEquals(r3, "65", "4r3 : ");
	//
	// String r4 = Main1.ergodicMatrix(testMatrix, 2, 22);
	// Assert.assertEquals(r4, "54", "4r4 : ");
	//
	// String r5 = Main1.ergodicMatrix(testMatrix, 2, 23);
	// Assert.assertEquals(r5, "98", "4r5 : ");
	//
	// String r6 = Main1.ergodicMatrix(testMatrix, 2, 24);
	// Assert.assertEquals(r6, "87", "4r6 : ");
	// }
}
