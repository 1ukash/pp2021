package ru.spbstu.pp.lecture7;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ThreadsExamples2 {
	public static void main(String[] args) {
		System.out.println("Hello from main thread with name: " + Thread.currentThread().getName());
		
		
		MyParrallelIncrementor codeRunner = new MyParrallelIncrementor(1000000);
		List<Thread> threads = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(codeRunner);
			threads.add(t);
			t.start();
		}
		
		for(Thread t: threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		int cnt = codeRunner.getCounter();
		
		System.out.println("Final result is " + cnt);
		
		
	}
}
