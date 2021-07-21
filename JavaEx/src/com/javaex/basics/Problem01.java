package com.javaex.basics;

public class Problem01 {

	public static void main(String[] args) {
		Problem01();

	}
	
	private static void Problem01() {
		for (int i = 1; i <= 100; i++) {
			// 5의 배수이면서 7의 배수 출력
			if (i % 5 == 0 && i % 7 == 0)
			System.out.println(i);
			
		}
	}

}
