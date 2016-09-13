package com.lean.project.euler.euler0002;

public class Main3 {

	public static void main(String[] args) {
		int fobnacci = 1;
		int fobnacciPro = 1;
		int r = 0;
		while (fobnacci <= 4000000) {
			int temp = fobnacci;
			fobnacci += fobnacciPro;
			fobnacciPro = temp;
			if (fobnacci % 2 == 0) {
				r += fobnacci;
			}
		}
		System.out.println(r);
	}

}
