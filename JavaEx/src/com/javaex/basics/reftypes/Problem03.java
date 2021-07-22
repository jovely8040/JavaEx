package com.javaex.basics.reftypes;

public class Problem03 {

	public static void main(String[] args) {



		 nullChangeComma();



		}


		public static void nullChangeComma() {

			char c[] = {'T', 'h', 'i', 's', ' ',
							'i', 's', ' ',
							'a', ' ',
						'p', 'e', 'n', 'c', 'i', 'l'
			};

			//  c[16] =>  배열의 개수는  16개이다.



			for(int i=0; i<c.length; i++) {

				System.out.print(c[i] );      // 배열된것을 그대로 출력한다.

			}
			System.out.println("");   // 줄바꿈 개행

		  for(int i=0; i<c.length; i++) {

			  if(c[i] == ' ') {         //  ' ' => ',' 로 바꾸기 위한 조건식
				  						//  c[i]를 반복 실행하다 ' ' (비어 있는 값이 나온다면) 그것
				  c[i] = ',';			//  ',' 로 대체하라
			  }

			  System.out.print(c[i]);   //출력
		  }



		}


	}

