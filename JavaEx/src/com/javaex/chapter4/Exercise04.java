package com.javaex.chapter4;

//4. while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
//눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
//눈의 합이 5가 되는 조합은 (1, 4), (4, 1), (2, 3), (3, 2) 입니다.
public class Exercise04 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		while(num1 + num2 != 5) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.print("(" + num1 + "," + num2 + ")");
		}
	}
}

//Math.random(): 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴 (1.0은 포함되지 않음)
//0.0 &lt;= Math.random() &lt; 1.0
//각 변에 범위 수를 곱하여 범위 내에 속하는 하나의 double 타입 값을 얻음
//0.0 * 6 &lt;= Mathi.random() &lt; 1.0*6
//각 변을 int타입으로 강제 타입 변환하여 하나의 정수 값을 얻어냄
//(int) 0.0 &lt;= (int) Mathi.random() &lt; (int) 1.0*6
//각 변에 1을 더하면 1~6까지 정수 중에서 하나의 정수를 얻을 수 있음
//0+1 &lt;= (int) Mathi.random() + 1 &lt; 6+1

//0.0 <=Math.random() <1.0 이기 때문에 주사위에 해당되는 값을 얻기 위해선 각각 6을 곱해줘야 한다.
//0.0 x*6 <= math.random() < 1.0 *6 이 되어야 함.
//이제 각 변을 int으로 강제 타입 변을 시켜주고, 주사위의 눈은 1부터 시작하니 +1을 해준다.
