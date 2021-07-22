package com.javaex.basics.reftypes;

public class Problem05 {

	public static void main(String[] args) {



		scoreOver85();

}



public static void scoreOver85() {

	int scoreboard [][]  = {

			{80, 75, 90, 95, 78},
			{92, 88, 89, 92, 70},
			{78, 80, 85, 86, 63},
			{83, 84, 89, 87, 75},
			{89, 83, 93, 94, 78}

				//  5행 5열 즉,   int scoreboard [5][5]
							};
	int sum=0;       // 85점 이상의 배열값들을 저장하기 위한 변수


	for(int i=0; i<5; i++) {	//첫번째 반복문은 scoreboadr [i] [j] 에서  i 담당


		for(int j=0; j<5; j++) {  // 두번째 반복문은 scoreboadr [i] [j] 에서  j 담당

				if(scoreboard[i][j] >= 85 ) {  // 조건문 if 를 통해  scoreboadr [i] [j] 에서 85점 이상인것 찾기

					sum += scoreboard[i][j];   // 찾은후 sum에 집어넣기

				}


		}



	}
	System.out.println("배열내 85점이상인 요소들의 총합 : " + sum);
	System.out.println("배열내 85점 이상인 요소들을 뽑아 만든 평균값 : " + (sum/12));


}

}

