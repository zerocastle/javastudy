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
		if (button.getText().equals("버튼을 누르세요")) {
			button.setText("마침내 버튼을 눌러졌어용");
		} else
			button.setText("버튼을 누르세요");

	}

}

class MyFrame extends JFrame {
	private JButton button;

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("Action");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		button = new JButton("버튼을 누르세요");
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
