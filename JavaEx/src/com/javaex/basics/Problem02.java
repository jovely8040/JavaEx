package com.javaex.basics;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Problem02();

	}
	// 가로(width)부분은 j값의 증감; 세로(length)부분은 i값의 증감
	private static void Problem02() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		for(int j = 0; j <= 7; j++) {
			for(int i = 0; i < j; i++) {
				System.out.print(j);
			}
				System.out.println();
		}
		
		scanner.close();
	}
}
