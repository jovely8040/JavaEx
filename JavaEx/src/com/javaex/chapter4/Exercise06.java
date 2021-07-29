package com.javaex.chapter4;

//6. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
public class Exercise06 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//i는 5까지 설정하고, 한 칸씩 아래로 내려가는 j값은 i보다
//항상 작게 설정함으로써 *로 된 삼각형을 만들도록 한다.
