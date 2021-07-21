package com.javaex.basics;

public class JavaPPT {

	public static void main(String[] args) {
//		whileGuguPractice();
//		forGuguPractice();
//		whileStarPractice();
//		forStarPractice();
		breakEx();
		
		System.out.println("End od Code");
	}
	
	
	private static void breakEx() {
		int num = 1;

		while(true) {	//	무한 루프
			if (num % 6 == 0 &&
				num % 14 == 0) 
				break;	//	루프 탈출
			num ++;
		}
		System.out.println(num);
	}
	
	
//	*
//	**
//	***
//	****
//	*****
//	public static void whileStar() {
//		for(int i = 0; i <= 6; i++) {
//			for(int s = 0; s < i; s++) {
//				System.out.print("*");
//			}
//				System.out.println();
//		}
//		
//	}
	private static void forStarPractice() {
		//	행루프
		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= row; col ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void whileStarPractice() {
		int row = 1;
		//	행 루프
		while(row <= 6) {
			//	열 루프
			int col = 1;
			while (col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println(); //	한 행 끝난 후 개행
			row++;
		}
	}

//	2*1 = 2
//	2*2 = 4
//	2*3 = 6
//	[중간생략]
//	9*7 = 63
//	9*8 = 72
//	9*9 = 81	
	private static void forGuguPractice() {
		//	단루프
		for (int dan = 2; dan <= 9; dan++) {
			//	숫자 루프 
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + 
									(dan * num));
			}
		}
	}
	
	private static void whileGuguPractice() {
		int dan = 2;
		//	단루프
		while(dan <= 9) {
			int num = 1;
			//	숫자 루프
			while(num <= 9) {
				System.out.println(dan + "*" + num + "=" + 
								(dan * num));
				num ++;
			}

			dan ++;
		}

	}
	

}
