package com.javaex.basics.reftypes;

public class Problem04 {

	public static void main(String[] args) {


		miniLotto();
	}


	 public static void miniLotto() {

		 int [ ] lottonumber = new int[6];       // 로또번호 6개를 배열


		 for(int i=0; i<lottonumber.length; i++) {
			 lottonumber[i] =(int)(Math.random()*45+1);     // 설명하기 무지 어려움 !!!!   구글에서 Math.random 꼭 볼것
			 												// 쉽게 말하면 45개의 로또 범위를 랜덤으로 지정하는 함수	
			 for(int j=0; j<i; j++) {
				  												
				 if(lottonumber[i]== lottonumber[j]) {			// 중복 없애기
					  i--;
					  break;
				 }
			 }

		 }
for(int i=0; i<lottonumber.length; i++) {
		System.out.print(lottonumber[i] + "\t");
}

	}

}