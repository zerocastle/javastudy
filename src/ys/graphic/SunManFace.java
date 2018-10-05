package ys.graphic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {

	JPanel panel;

	public MyPanel() {
		// TODO Auto-generated constructor stub

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.drawString("ø¿øµ¡ÿ", 250, 0);
		g.fillOval(125, 125, 180, 180);
		g.setColor(Color.black);
		
		g.drawArc(180, 140, 30, 30, 0,180 );
		g.drawArc(220, 140, 30, 30, 0, 180);
		
		g.drawArc(180, 200, 100, 100, 180, 180);
		

	}

}

class MyFrame extends JFrame {

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("sunManFace");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		this.add(panel);
		this.setVisible(true);
		
	}

}

public class SunManFace {

	public SunManFace() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		new MyFrame();

	}

}
