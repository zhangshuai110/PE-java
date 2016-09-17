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
		Assert.assertEquals(r1, "1,4,", "1r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 2);
		Assert.assertEquals(r2, "4,7,", "1r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 3);
		Assert.assertEquals(r3, "7,10,", "1r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 5);
		Assert.assertEquals(r4, "13,16,", "1r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 6);
		Assert.assertEquals(r5, "2,5,", "1r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 10);
		Assert.assertEquals(r6, "14,17,", "1r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 12);
		Assert.assertEquals(r7, "6,9,", "1r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 15);
		Assert.assertEquals(r8, "15,18,", "1r8 : ");
	}

	/**
	 * 测试“由下到上”
	 */
	@Test
	public void test_eraodicMatrix2() {
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 16);
		Assert.assertEquals(r1, "16,13,", "2r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 17);
		Assert.assertEquals(r2, "13,10,", "2r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 18);
		Assert.assertEquals(r3, "10,7,", "2r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 19);
		Assert.assertEquals(r4, "7,4,", "2r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 20);
		Assert.assertEquals(r5, "4,1,", "2r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 21);
		Assert.assertEquals(r6, "17,14,", "2r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 22);
		Assert.assertEquals(r7, "14,11,", "2r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 23);
		Assert.assertEquals(r8, "11,8,", "2r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 24);
		Assert.assertEquals(r9, "8,5,", "2r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 25);
		Assert.assertEquals(r10, "5,2,", "2r10 : ");

		String r11 = Main1.ergodicMatrix(testMatrix, 2, 26);
		Assert.assertEquals(r11, "18,15,", "2r11 : ");

		String r12 = Main1.ergodicMatrix(testMatrix, 2, 27);
		Assert.assertEquals(r12, "15,12,", "2r12 : ");

		String r13 = Main1.ergodicMatrix(testMatrix, 2, 28);
		Assert.assertEquals(r13, "12,9,", "2r13 : ");

		String r14 = Main1.ergodicMatrix(testMatrix, 2, 29);
		Assert.assertEquals(r14, "9,6,", "2r14 : ");

		String r15 = Main1.ergodicMatrix(testMatrix, 2, 30);
		Assert.assertEquals(r15, "6,3,", "2r15 : ");
	}

	/**
	 * 测试“由左到右”
	 */
	@Test
	public void test_eraodicMatrix3() {
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 31);
		Assert.assertEquals(r1, "1,2,", "3r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 32);
		Assert.assertEquals(r2, "2,3,", "3r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 33);
		Assert.assertEquals(r3, "4,5,", "3r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 34);
		Assert.assertEquals(r4, "5,6,", "3r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 35);
		Assert.assertEquals(r5, "7,8,", "3r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 36);
		Assert.assertEquals(r6, "8,9,", "3r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 37);
		Assert.assertEquals(r7, "10,11,", "3r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 38);
		Assert.assertEquals(r8, "11,12,", "3r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 39);
		Assert.assertEquals(r9, "13,14,", "3r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 40);
		Assert.assertEquals(r10, "14,15,", "3r10 : ");

		String r11 = Main1.ergodicMatrix(testMatrix, 2, 41);
		Assert.assertEquals(r11, "16,17,", "3r11 : ");

		String r12 = Main1.ergodicMatrix(testMatrix, 2, 42);
		Assert.assertEquals(r12, "17,18,", "3r12 : ");
	}

	/**
	 * 测试“由右到左”
	 */
	@Test
	public void test_eraodicMatrix5() {
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 43);
		Assert.assertEquals(r1, "3,2,", "4r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 44);
		Assert.assertEquals(r2, "2,1,", "4r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 45);
		Assert.assertEquals(r3, "6,5,", "4r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 46);
		Assert.assertEquals(r4, "5,4,", "4r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 47);
		Assert.assertEquals(r5, "9,8,", "4r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 48);
		Assert.assertEquals(r6, "8,7,", "4r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 49);
		Assert.assertEquals(r7, "12,11,", "4r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 50);
		Assert.assertEquals(r8, "11,10,", "4r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 51);
		Assert.assertEquals(r9, "15,14,", "4r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 52);
		Assert.assertEquals(r10, "14,13,", "4r10 : ");

		String r11 = Main1.ergodicMatrix(testMatrix, 2, 53);
		Assert.assertEquals(r11, "18,17,", "4r11 : ");

		String r12 = Main1.ergodicMatrix(testMatrix, 2, 54);
		Assert.assertEquals(r12, "17,16,", "4r12 : ");
	}
}
