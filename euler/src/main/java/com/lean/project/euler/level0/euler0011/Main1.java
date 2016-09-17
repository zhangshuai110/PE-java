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
		String exString = "";
		// 从上到下
		for (int j = 0; j < matrix[0].length; j++) {
			exString = "";
			int countBack = 0;
			for (int i = countBack++; i < matrix.length; i++) {
				exString += matrix[i][j];
				if (exString.length() == step) {
					i = countBack++;
					i--;
					if (++exCount == count) {
						return exString;
					}
					exString = "";
				}
			}
		}

		// 从下到上
		for (int j = 0; j < matrix[0].length; j++) {
			exString = "";
			int countBack = matrix.length - 1;
			for (int i = countBack; i >= 0; i--) {
				exString += matrix[i][j];
				// System.out.print(i + " " + j + " [" + matrix[i][j] + "] ");
				if (exString.length() == step) {
					i = --countBack;
					i++;

					// System.out.println(exCount + " " + exString + " " + i + "
					// " + j);
					if (++exCount == count) {
						return exString;
					}
					exString = "";
				}
			}
			System.out.println("");
		}
		return null;

	}
}
