package com.javaex.basics;

public class Problem04 {

	public static void main(String[] args) {
		Problem04();

	}
	public static void Problem04() {
		for(int i= 0; i < 10; i++){
			for(int j = 1; j <= 10; j++)
			System.out.print(j + i + "\t");
			System.out.println();
		}
	}
}	

//	public static void problem04_meth() {
//		for(int i=0; i<10; i++) {
//			int sum = 0;
//			sum = sum + i;
//			for(int j=1; j<11; j++) {
//				System.out.print(j  + sum + "\t");
//			}
//			System.out.println("");
//		}
//	}