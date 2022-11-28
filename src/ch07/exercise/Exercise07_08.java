package ch07.exercise;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Exercise07_08 {
	public static void main(String[] args) {
		Frame f = new Frame();
//		f.addWindowListener(new EventHandler()); 
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}

// 아래의 클래스(EventHandler)를 익명 클래스로 변경하기
/*
class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
*/
