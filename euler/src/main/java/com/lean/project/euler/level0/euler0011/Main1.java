package com.lean.project.euler.level0.euler0011;

public class Main1 {
	public static void main(String[] args) {
		int[][] matrix = { { 8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8 },
				{ 49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0 },
				{ 81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65 },
				{ 52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91 },
				{ 22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80 },
				{ 24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50 },
				{ 32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70 },
				{ 67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21 },
				{ 24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72 },
				{ 21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95 },
				{ 78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92 },
				{ 16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57 },
				{ 86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58 },
				{ 19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40 },
				{ 04, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66 },
				{ 88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69 },
				{ 04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36 },
				{ 20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16 },
				{ 20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54 },
				{ 01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48 } };
		long r = 0;
		String exString = "";
		int count = 0;
		while (true) {
			exString = ergodicMatrix(matrix, 4, ++count);
			if (exString == null) {
				break;
			}
			String[] ex = exString.split(",");
			long rTemp = Integer.parseInt(ex[0]) * Integer.parseInt(ex[1]) * Integer.parseInt(ex[2])
					* Integer.parseInt(ex[3]);
			if (rTemp > r) {
				r = rTemp;
			}
		}
		System.out.println(r);
	}

	/**
	 * 安装从上到下、从下到上、从左到右、从右到左、从左上到右下、从右上到左下、的顺序遍历返回step个数字组成的字符串<br>
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
		// 从右下到左上 上半部分
		for (int x = matrix.length - 1; x >= 0; x--) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = x, j = matrix[0].length - 1; j >= 0 && i >= 0; i--, j--) {
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = x - countBack;
					j = matrix[0].length - 1 - countBack++;
					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}

		}

		// 从右下到左上 下半部分
		for (int x = matrix[0].length - 2; x >= 0; x--) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = matrix.length - 1, j = x; j >= 0 && i >= 0; i--, j--) {
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = matrix.length - 1 - countBack;
					j = x - countBack++;
					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}
		}

		// 左下到右上 上半部分
		for (int x = matrix.length - 1; x >= 0; x--) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = x, j = 0; j < matrix[0].length && i >= 0; i--, j++) {
				// System.out.println(" i=" + i + " j=" + j + " " +
				// matrix[i][j]);
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = x - countBack;
					j = countBack++;
					if (++exCount == count) {
						return exString;
					}
					exString = "";
					exStringStep = 0;
				}
			}
		}

		// 从左下到右上 下半部分
		for (int x = 1; x < matrix[0].length; x++) {
			exString = "";
			exStringStep = 0;
			int countBack = 0;
			for (int i = matrix.length - 1, j = x; j < matrix[0].length && i >= 0; i--, j++) {
//				System.out.println(" i=" + i + " j=" + j + " " + matrix[i][j]);
				exString += matrix[i][j];
				exString += ",";
				exStringStep++;
				if (exStringStep == step) {
					i = matrix.length - 1 - countBack;
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
