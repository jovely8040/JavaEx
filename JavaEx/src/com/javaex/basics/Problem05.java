package com.javaex.basics;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Problem05();

	}
	public static void Problem05() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		for(int i = 1; i < 6; i++) {
			System.out.println("숫자: " );
			int num1 = scanner.nextInt();
			
			System.out.println("숫자: " );
			int num2 = scanner.nextInt();
			
			System.out.println("숫자: " );
			int num3 = scanner.nextInt();
			
			System.out.println("숫자: " );
			int num4 = scanner.nextInt();
			
			System.out.println("숫자: " );
			int num5 = scanner.nextInt();
			
			int max1 = 0;
			int max2 = 0;
			int max3 = num5;
			
			if(num1>num2) {

				max1 = num1;


				}
			else  {
			    max1 =num2;
			}

			if(num3>num4) {
				max2 = num3;
			}
			else{
				max2 =num4;
			}
			if(max1>max2) {

				if(max1>max3) {
					System.out.println(" 최대값은" + max1+" 입니다.");
					break;
				}
				else{
					System.out.println("최대값은" + max3+" 입니다.");
					break;

				}

			}
			else if(max1<max2)	{

				if(max2>max3) {
					System.out.println(" 최대값은" + max2+" 입니다.");
					break;
				}
				else{
					System.out.println("최대값은 " + max3 +" 입니다.");
					break;
				}

			}
			}

		}


	}
