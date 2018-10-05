package ys.event2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {

	private JButton button;

	class MyListener implements ActionListener {

		private int counter = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton button1 = (JButton) e.getSource(); // 이벤트로 넘어온 버튼 소스를 얻어온뒤 세로운 버튼에 담아둔다.

			if (counter == 1) {
				button1.setText("버튼누름");
				counter = 0;
			} else {
				button1.setText("버튼을 눌러주세요");
				counter++;
			}

//			if(button1.getText().equals("버튼 누름")) {
//				button1.setText("버튼을 누르세요");
//			}else {
//				button1.setText("버튼 누름");
//			}
		}

	}

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("버튼이벤트 예제");
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르세요");
//		button.addActionListener(new MyListener());
		this.add(button);
		button.addActionListener(new MyListener());
		System.out.println("hellow");
		this.setVisible(true);
	}

}

public class WDB {

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();

	}

}
