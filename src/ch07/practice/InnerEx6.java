package ch07.practice;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
	class InnerEx6 {
		public static void main(String[] args) {
			Button b = new Button("Start");
			b.addActionListener(new EventHandler());
		}
	}
	
	class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent occurred!!!");
		}
	}
*/

// InnerEx6 --> 익명 클래스로 변환
class InnerEx6 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}


