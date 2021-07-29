package com.javaex.chapter4;

import java.util.Scanner;

//7. while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로
//예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
//이 프로그램을 실행시키면 다음과 같은 실행 결과가 나와야합니다.
public class Exercise07 {

	public static void main(String[] args) {
     boolean run = true; // boolean run으로 참인 값을 나타내고,
     
     int balance = 0; // 잔고를 balance로 int 타입으로 설정
     
     Scanner sc = new Scanner(System.in); // Scanner 함수를 적용하기 위해 호출
     
     while(run){ // 출력되는 값을 위해 while에서 run 되는 동안 각각 하단에 있는 값을 출력하도록 한다
         System.out.println("----------------------------------");
         System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
         System.out.println("----------------------------------");
         System.out.print("선택>");
         
         // 작성 위치
         int menuNo = sc.nextInt(); // 각각 해당되는 값의 출력 버튼을 설정하기 위해 int menuNo을 scanner로 설정
         int money = 0;

         switch(menuNo) { // swith문으로 하나씩 출력

             case 1:
             	// 1번 입력시 예금액 출력, 금액을 입력시 잔고는 금액의 합으로 설정
                 System.out.print("예금액>");
                 money = sc.nextInt(); // 정수 1개를 입력받아 money변수에 저장. 예금액 사용
                 balance += money;
                 break;

             case 2:
             	// 2번 입력시 출금액 출력, 금액 입력 이후 잔고에서 빠져나간 금액을 표기
                 System.out.print("출금액>");
                 money= sc.nextInt(); // 정수 1개를 입력받아 money변수에 저장. 출금액 사용
                 balance -= money; // 나타나는 금액을 표현하기 위해 money도 변수로 설정
                 break;

             case 3:
             	// 3번 입력시 최종 잔고를 balance로 나타냄
                 System.out.print("잔고액>" + balance);
                 break;

             case 4:
             	// 4번 입력시 프로그램 종료
                 run = false;
                 break;
         }//switch 

     }//while
     
     System.out.print("프로그램 종료");
     sc.close(); // Scanner가 참조하고 있는 System.in 스트림을 닫음
 }

}
