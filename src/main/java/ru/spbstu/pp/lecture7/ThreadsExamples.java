package ru.spbstu.pp.lecture7;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ThreadsExamples {
	public static void main(String[] args) {
		System.out.println("Hello from main thread with name: " + Thread.currentThread().getName());
		
		
		MyParrallelCodeRunner codeRunner = new MyParrallelCodeRunner();
		List<Thread> threads = new LinkedList<>();
		//codeRunner.run(); // invokes method in the same thread
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(codeRunner);
			threads.add(t);
			t.start();
		}
		
		Random r = new Random();
		while(threads.size() > 0) {
			try {
				Thread.sleep(1000 + r.nextInt(2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Thread t = threads.remove(0);
			t.interrupt();
		}
		
		
	}
}
