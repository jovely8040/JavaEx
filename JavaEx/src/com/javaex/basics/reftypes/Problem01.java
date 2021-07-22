package com.javaex.basics.reftypes;

public class Problem01 {

	public static void main(String[] args) {


        numbAndX3();

	}



	public static void numbAndX3() {

		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};

		int sum=0;   // 3의 배수의 값을 저장하기 위한 변수값
		int cnt =0;  // 3의 배수의 개수를 세기 위한 변수값

		for(int i=0; i<data.length; i++) {

			// 3의 배수를 구하기 위한 조건 if
			if(data[i] % 3 == 0) {
				cnt++;        // 갯수 카운트
			}

		}

		System.out.println("주어진 배열에서 3의 배수의 개수 =>" + cnt);






		for(int i=0; i< data.length; i++ ) {

		if(data[i]%3 == 0) {

			sum += data[i];   // sum 변수값에  data[i]를 저장

		}

		}
		 System.out.println("주어진 배열에서 3의 배수의 합 =>" + sum);



	}

}