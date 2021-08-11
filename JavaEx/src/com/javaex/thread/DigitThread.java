package com.javaex.thread;

public class DigitThread extends Thread {

	@Override
	public void run() {
		// 쓰레드의 실행 로직
		// 주의: 이 메서드는 직접 호출하지 말것!
		for (int i =1; i <= 30; i++) {
			System.out.printf("%s: %d%n", // 센텐스, 데이터, 개행
					getName(), // 현재 쓰레드 이름
					i);
			// 0.3초 대기
			try {
				Thread.sleep(300); // 300ms = 0.3s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		super.run();
	}
	
}
