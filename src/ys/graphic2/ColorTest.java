package ys.graphic2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener {

	JButton button;
	Color color = new Color(0, 0, 0);

	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout());
		button = new JButton("색상 오영준 ㅄ");
		button.addActionListener(this);
		this.add(button, BorderLayout.SOUTH);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 210, 220);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = new Color(
				(int)(Math.random() * 255.0),
				(int)(Math.random() * 255.0),
				(int)(Math.random() * 255.0)
				);
		repaint();
		
	}
}

class MyFrame extends JFrame {

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("change title");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new MyPanel();
		
		
		this.add(panel);
		this.setVisible(true);
	}
	

}

public class ColorTest {

	public ColorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
