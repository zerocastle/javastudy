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
			JButton button1 = (JButton) e.getSource(); // �̺�Ʈ�� �Ѿ�� ��ư �ҽ��� ���µ� ���ο� ��ư�� ��Ƶд�.

			if (counter == 1) {
				button1.setText("��ư����");
				counter = 0;
			} else {
				button1.setText("��ư�� �����ּ���");
				counter++;
			}

//			if(button1.getText().equals("��ư ����")) {
//				button1.setText("��ư�� ��������");
//			}else {
//				button1.setText("��ư ����");
//			}
		}

	}

	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��ư�̺�Ʈ ����");
		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� ��������");
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
