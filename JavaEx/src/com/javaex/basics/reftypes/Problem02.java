package com.javaex.basics.reftypes;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {


		inputArrays();

	}


	public static void inputArrays() {

	 Scanner sc = new Scanner(System.in);

	 int [] inputnum = new int[5];

	 int num;   // 스캐너를 위한 값
	 int sum =0;  //배열들의 합을 저장 위한 변수 값

	 for(int i=0; i<inputnum.length; i++) {

		 num = sc.nextInt();   //5개의 숫자를 입력받기위한 반복문  5번 입력 반복
		 inputnum[i] = num;   //  입력한 값을 배열에 집어넣는다.

	 }


	 for(int i=0; i< inputnum.length; i++) {

		 sum += inputnum[i];  // 입력한 값들을 하나씩 sum에 집어 넣는 반복문
		 					//  sum = sum + inputnum[i]

	 }

	 float avg = sum / 5;         // 평균값 구하는 방법

	 System.out.println("평균은 " + avg +"입니다.");
	}



}
