package ru.spbstu.pp.lecture3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Anonymous {
	
	static interface Button {
		void doClick();
	}
	
	static class OKButton implements Button {
		@Override
		public void doClick() {
			//some logic
		}
	}
	
	public static void main(String[] args) {
		final int x = 10;
		
		Button b = new Button() {
			
			@Override
			public void doClick() {
				System.out.println(x);
				// don another staff
			}
		};
		
		JButton button = new JButton();
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyTyped(e);
			}
		});
		
	}
	
	private void bar() {
		class Point {
			int x,y,z;
		}
	}
	

}
