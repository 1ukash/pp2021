package ru.spbstu.pp.lecture7;

public class MyParrallelCodeRunner implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while(!Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println(Thread.currentThread().getName() + " was interrupted while sleeping");
				//e.printStackTrace();
			}
			System.out.println(i + ": " + Thread.currentThread().getName());
			i++;
		}
		// do cleanup ops
	}
}
