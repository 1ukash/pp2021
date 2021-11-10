package ru.spbstu.pp.lecture7;

public class JoinExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = new  Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("I finished doing staff in 3 seconds");
			}
		};
		
		
		Thread t = new Thread(r);
		t.start();
		System.out.println("I have started waiting while thread t was executing");
		t.join();
		System.out.println("I have finished waiting while thread t was executing");
		
	}

}
