package ys.event4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("��ư�� ��������")) {
			button.setText("��ħ�� ��ư�� ���������");
		} else
			button.setText("��ư�� ��������");

	}

}

class MyFrame extends JFrame {
	private JButton button;

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("Action");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		button = new JButton("��ư�� ��������");
		this.setLayout(new FlowLayout());
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
	}
}

public class ActionTest {

	public ActionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
