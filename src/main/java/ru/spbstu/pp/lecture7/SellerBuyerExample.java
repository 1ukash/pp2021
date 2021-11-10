package ru.spbstu.pp.lecture7;

import java.util.LinkedList;
import java.util.List;

public class SellerBuyerExample {

	
	static class Account {
		private int val;

		public Account(int val) {
			super();
			this.val = val;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}
		
		boolean isEmpty() {
			return val == 0;
		}
		
	}
	
	
	private static final int INITIAL_GOODS_NUM = 5000;
	public static final int INITIAL_WEALTH = 1000;
	public static final int PRICE = 1;
	
	static class Seller {
		Account acc = new Account(0);
		int numOfGoods = INITIAL_GOODS_NUM;
		
		void buy(Buyer b) {
			acc.setVal(acc.getVal() + PRICE);
			b.acc.setVal(b.acc.getVal() - PRICE);
			numOfGoods --;
			b.adjustGoods(1);
			
		}

		public int getNumOfGoods() {
			return numOfGoods;
		}
		
	}
	
	static class Buyer implements Runnable{
		Account acc = new Account(INITIAL_WEALTH);
		int numOfGoods = 0;
		private Seller seller;
		
		
		
		public Buyer( Seller seller) {
			this.seller = seller;
		}

		@Override
		public void run() {
			
			while(!Thread.currentThread().isInterrupted() && canProceed()) {
				seller.buy(this);
			}
			
		}

		public void adjustGoods(int i) {
			numOfGoods += i;
		}

		private boolean canProceed() {
			return !acc.isEmpty()  && seller.getNumOfGoods() > 0;
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		List<Thread> threads = new LinkedList<>();
		List<Buyer> buyers = new LinkedList<>();
		
		Seller seller = new Seller();
		
		for (int i = 0; i < 5; i++) {
			Buyer b = new Buyer(seller);
			buyers.add(b);
			Thread t = new Thread(b);
			t.start();
			threads.add(t);
		}
		
		for (Thread t: threads) {
			t.join();
		}
		
		System.out.println("Seller: goods=" + seller.numOfGoods + ", money=" + seller.acc.getVal());
		
		int totalGoods = 0, totalMoney = 0;
		for (Buyer b: buyers) {
			totalMoney += b.acc.getVal();
			totalGoods += b.numOfGoods;
		}
		
		System.out.println("Totally buyers have: goods=" + totalGoods + ", money= " + totalMoney );
		
		
	}
	
}
