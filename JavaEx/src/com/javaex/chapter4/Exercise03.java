package com.javaex.chapter4;

//3. for문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
			sum = sum += i;
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}
//합을 변수 int로 설정 이후 for문을 통해 1을 시작으로 100까지 값 산출.
//3의 배수이기 때문에 i%3==0으로 설정. 왜냐? 3으로 나누었을 때, 나머지가 0이면 3의 배수