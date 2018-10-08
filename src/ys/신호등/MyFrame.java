package ys.신호등;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;

class MyListener implements ActionListener {
	MyPanel mypanel;

	public MyListener(MyPanel mypanel) {
		// TODO Auto-generated constructor stub
		this.mypanel = mypanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("들어오니??");

		mypanel.setLight_number(mypanel.getLight_number() + 1);
		System.out.println(mypanel.getLight_number());
		if (mypanel.getLight_number() >= 3) {
			mypanel.setLight_number(0);

		}
		mypanel.repaint();

	}

}

class MyPanel extends JPanel {
	boolean flag = false;
	private int light_number = 0;

	public MyPanel() {
		setLayout(new BorderLayout());
		JButton button = new JButton("traffic ligh turn on");
		button.addActionListener(new MyListener(this));
		this.add(button, BorderLayout.SOUTH);
		// 타이머 처리
//		Timer timer = new Timer();
//		MyTimerTask task = new MyTimerTask(this);
//		timer.schedule(task, 1000,1000); // 지연시간 , 반복시간
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);

		if (light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		} else if (light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
		}
		this.repaint();
	}

	public int getLight_number() {
		return light_number;
	}

	public void setLight_number(int light_number) {
		this.light_number = light_number;
	}
}

public class MyFrame extends JFrame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
