package ys.Thread;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	// 생성자
	private JLabel label;
	
	class MyThread3 extends Thread{
		public void run() {
			//delay를 준다
			try {
				Thread.sleep(1000);
				for(int i = 0; i < 100; i++) {
					label.setText(i + " ");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

	public CountDownTest() {
		// TODO Auto-generated constructor stub
		this.setTitle("CountDownTest");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("시작");
		Font font = new Font("휴먼 명조", Font.BOLD, 100);
		label.setFont(font);
		this.add(label);
		MyThread3 myThread = new MyThread3();
		myThread.start();
		this.setVisible(true);
	}

}
