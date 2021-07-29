package com.javaex.chapter4;

//5. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
//(x, y) 형태로 출력해보세요. 단, x와 y는 10 이하의 자연수입니다.
public class Exercise05 {

	public static void main(String[] args) {
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4 * x) + (5 * y) == 60)
					System.out.println("(" + x + "," + y + ")");
			}
		}
	}
}

//이중 for문을 통해서 x와 y의 값을 10 이하로 설정하고, 각각 나우 어 떨어질 수 있도록
//4*x+5*y=60으로 설정
