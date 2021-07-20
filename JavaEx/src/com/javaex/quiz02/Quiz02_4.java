package com.javaex.quiz02;

public class Quiz02_4 {
	public static void main(String[] args) {
		char ch = 'A';
		
		//	'A': 65, 'a': 97 (*대문자와 소문자 차이는 항상 32)
		char conv = (char)(ch + 32);
		System.out.println(conv);
	}
}
