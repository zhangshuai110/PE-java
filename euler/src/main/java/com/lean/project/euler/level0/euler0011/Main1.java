package com.lean.project.euler.level0.euler0011;

public class Main1 {
	public static void main(String[] args) {
	}

	/**
	 * 安装从上到下、从下到上、从左到右、从右到左、从左上到右下、从右上到左下的顺序遍历返回step个数字组成的字符串<br>
	 * 如果遍历不到，返回null
	 * 
	 * @param matrix
	 * @param step
	 * @param count
	 * @return
	 */
	public static String ergodicMatrix(int[][] matrix, int step, int count) {
		if (count == 0) {
			return null;
		}
		if (step > matrix.length && step > matrix[0].length) {
			return null;
		}
		int exCount = 0;
		// 期望得到的每个小string
		String exString = "";
		// 每个exString的步长
		int exStringStep = 0;
		// System.out.println("matrix.length:" + matrix.length);
		// System.out.println("matrix[0].length:" + matrix[0].length);
		// 从上到下
		for (int j = 0; j < matrix[0].length; j++) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = countBack; i < matrix.length; i++) {
				// System.out.println(j);
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = countBack++;
					exCount++;
					// 等于预期的个数，返回
					if (exCount == count) {
						return exString;
					}
					// 重新再来
					exString = "";
					exStringStep = 0;
				}
			}
			// System.out.println(" ");
		}

		// 从下到上
		for (int j = 0; j < matrix[0].length; j++) {
			exString = "";
			exStringStep = 0;
			int countBack = matrix.length - 1;
			for (int i = countBack; i >= 0; i--) {
				// System.out.println(j);
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = countBack--;
					exCount++;
					// 等于预期的个数，返回
					if (exCount == count) {
						return exString;
					}
					// 重新再来
					exString = "";
					exStringStep = 0;
				}
			}
			// System.out.println(" ");
		}

		// 从左到右
		for (int i = 0; i < matrix.length; i++) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int j = countBack; j < matrix[0].length; j++) {
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					j = countBack++;

					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}
		}

		// 从右到左
		for (int i = 0; i < matrix.length; i++) {
			exString = "";
			exStringStep = 0;

			int countBack = matrix[i].length - 1;
			for (int j = countBack; j >= 0; j--) {
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					j = countBack--;

					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}
		}
		// 从左上到右下1 下半部分
		for (int x = 0; x < matrix.length; x++) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = x, j = 0; j < matrix[0].length && i < matrix.length; i++, j++) {
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = x + countBack;
					j = countBack++;
					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}
		}
		// 从左上到右下2 上半部分
		for (int x = 1; x < matrix[0].length; x++) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = 0, j = x; j < matrix[0].length && i < matrix.length; i++, j++) {
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = countBack;
					j = x + countBack++;
					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}
		}

		return null;

	}
}
