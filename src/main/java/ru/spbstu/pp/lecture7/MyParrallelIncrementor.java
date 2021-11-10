package ru.spbstu.pp.lecture7;

public class MyParrallelIncrementor implements Runnable {
	
	private final int numOfOps;
	private int counter = 0;
	
	public MyParrallelIncrementor(int numOfOps) {
		this.numOfOps = numOfOps;
	}

	@Override
	public void run() {
		int i = 0;
		for (; i < numOfOps; i++) {
			
			synchronized (this) {
				counter ++;
			}

		}
		
		System.out.println("Thread " + Thread.currentThread().getName() + " performed " + i + " ops");
	
	}

	public int getCounter() {
		return counter;
	}
	
	
}
