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
		Assert.assertEquals(r1, "3,2,", "5r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 44);
		Assert.assertEquals(r2, "2,1,", "5r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 45);
		Assert.assertEquals(r3, "6,5,", "5r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 46);
		Assert.assertEquals(r4, "5,4,", "5r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 47);
		Assert.assertEquals(r5, "9,8,", "5r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 48);
		Assert.assertEquals(r6, "8,7,", "5r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 49);
		Assert.assertEquals(r7, "12,11,", "5r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 50);
		Assert.assertEquals(r8, "11,10,", "5r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 51);
		Assert.assertEquals(r9, "15,14,", "5r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 52);
		Assert.assertEquals(r10, "14,13,", "5r10 : ");

		String r11 = Main1.ergodicMatrix(testMatrix, 2, 53);
		Assert.assertEquals(r11, "18,17,", "5r11 : ");

		String r12 = Main1.ergodicMatrix(testMatrix, 2, 54);
		Assert.assertEquals(r12, "17,16,", "5r12 : ");
	}

	/**
	 * 测试“由左上到右下”
	 */
	@Test
	public void test_eraodicMatrix6() {
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 55);
		Assert.assertEquals(r1, "1,5,", "6r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 56);
		Assert.assertEquals(r2, "5,9,", "6r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 57);
		Assert.assertEquals(r3, "4,8,", "6r3 : ");

		String r4 = Main1.ergodicMatrix(testMatrix, 2, 58);
		Assert.assertEquals(r4, "8,12,", "6r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 59);
		Assert.assertEquals(r5, "7,11,", "6r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 60);
		Assert.assertEquals(r6, "11,15,", "6r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 61);
		Assert.assertEquals(r7, "10,14,", "6r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 62);
		Assert.assertEquals(r8, "14,18,", "6r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 63);
		Assert.assertEquals(r9, "13,17,", "6r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 64);
		Assert.assertEquals(r10, "2,6,", "6r10 : ");
	}

	/**
	 * 测试“由左上到右下”1
	 */
	@Test
	public void test_eraodicMatrix7() {
		int[][] testMatrix = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 55);
		Assert.assertEquals(r1, "1,8,", "7r1 : ");

		String r2 = Main1.ergodicMatrix(testMatrix, 2, 56);
		Assert.assertEquals(r2, "8,15,", "7r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 57);
		Assert.assertEquals(r3, "7,14,", "7r3 : ");
		// 上半部分测试
		String r4 = Main1.ergodicMatrix(testMatrix, 2, 58);
		Assert.assertEquals(r4, "2,9,", "7r4 : ");

		String r5 = Main1.ergodicMatrix(testMatrix, 2, 59);
		Assert.assertEquals(r5, "9,16,", "7r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 60);
		Assert.assertEquals(r6, "3,10,", "7r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 61);
		Assert.assertEquals(r7, "10,17,", "7r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 62);
		Assert.assertEquals(r8, "4,11,", "7r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 63);
		Assert.assertEquals(r9, "11,18,", "7r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 64);
		Assert.assertEquals(r10, "5,12,", "7r10 : ");
	}
	/**
	 * 从右下到左上 上半部分
	 */
	@Test
	public void test_eraodicMatrix8() {
		int[][] testMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 65);
		Assert.assertEquals(r1, "18,14,", "8r1 : ");
		
		String r2 = Main1.ergodicMatrix(testMatrix, 2, 66);
		Assert.assertEquals(r2, "14,10,", "8r2 : ");
		
		String r3 = Main1.ergodicMatrix(testMatrix, 2, 67);
		Assert.assertEquals(r3, "15,11,", "8r3 : ");
		
		String r4 = Main1.ergodicMatrix(testMatrix, 2, 68);
		Assert.assertEquals(r4, "11,7,", "8r4 : ");
	}
	/**
	 * 从右下到左上 下半部分
	 */
	@Test
	public void test_eraodicMatrix9() {
		int[][] testMatrix = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		//上半部分
		String r1 = Main1.ergodicMatrix(testMatrix, 2, 65);
		Assert.assertEquals(r1, "18,11,", "9r1 : ");
		
		String r2 = Main1.ergodicMatrix(testMatrix, 2, 66);
		Assert.assertEquals(r2, "11,4,", "9r2 : ");

		String r3 = Main1.ergodicMatrix(testMatrix, 2, 67);
		Assert.assertEquals(r3, "12,5,", "9r3 : ");
		//下半部分
		String r4 = Main1.ergodicMatrix(testMatrix, 2, 68);
		Assert.assertEquals(r4, "17,10,", "9r4 : ");
		
		String r5 = Main1.ergodicMatrix(testMatrix, 2, 69);
		Assert.assertEquals(r5, "10,3,", "9r5 : ");

		String r6 = Main1.ergodicMatrix(testMatrix, 2, 70);
		Assert.assertEquals(r6, "16,9,", "9r6 : ");

		String r7 = Main1.ergodicMatrix(testMatrix, 2, 71);
		Assert.assertEquals(r7, "9,2,", "9r7 : ");

		String r8 = Main1.ergodicMatrix(testMatrix, 2, 72);
		Assert.assertEquals(r8, "15,8,", "9r8 : ");

		String r9 = Main1.ergodicMatrix(testMatrix, 2, 73);
		Assert.assertEquals(r9, "8,1,", "9r9 : ");

		String r10 = Main1.ergodicMatrix(testMatrix, 2, 74);
		Assert.assertEquals(r10, "14,7,", "9r10 : ");
	}

}
