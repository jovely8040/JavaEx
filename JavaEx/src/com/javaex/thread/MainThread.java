package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
			// Working Thread 호출
			Thread thread = new DigitThread();
			thread.setName("DigitThread");
			// 쓰레드 시작: run 메서드 직접 호출하지 말자!
			thread.start();
		
//		// Main Thread 로직
//		// A ~ Z까지 출력
//		for (char ch='A'; ch <= 'Z'; ch++) {
//			System.out.println("MainThread:" + ch);
//			
//			// 0.3초 대기
//			try {
//				Thread.sleep(300); // 300ms = 0,3s
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		Thread thread2 = new Thread(new AlphabetThread()); // Runnable 집어 넣어
		thread2.start(); // run 메서드 대신 수행
		
		// MainThread의 흐름에 WorkingThread들의 흐름을 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of MainThread!");
	}

}
