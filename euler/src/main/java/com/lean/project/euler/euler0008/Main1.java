package com.lean.project.euler.euler0008;

public class Main1 {

	public static void main(String[] args) {

	}

	/**
	 * 从soource中找出第count个连续num的数字<br>
	 * 如果没有找到，则返回null
	 * 
	 * @param source
	 * @param num
	 * @return
	 */
	public static String findSeriesNum(String source, int num, int count) {
		if (source == null) {
			return null;
		}
		if (count <= 0 || num <= 0) {
			return null;
		}
		if (source.length() < count * num) {
			return null;
		}
		int beginIndex = count - 1;
		int endIndex = count - 1 + num;
		return source.substring(beginIndex, endIndex);
	}
}
