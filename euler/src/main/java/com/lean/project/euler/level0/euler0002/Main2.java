package com.lean.project.euler.level0.euler0002;
/*
 * 这样写有点儿繁琐，代码可以简化
 */
public class Main2 {

	public static void main(String[] args) {
		int fonancci = 0;
		int pro = 0;
		int i=0;
		int r = 0;
		while(fonancci<=4000000){
			if (i == 0) {
				fonancci = 1;
				pro = 1;
			} else {
				int pro_temp = fonancci;
				fonancci = fonancci + pro;
				pro = pro_temp;
			}
			if(fonancci%2==0){
				r += fonancci;
			}
				
			i++;
		}
		System.out.println(r);
	}

}
