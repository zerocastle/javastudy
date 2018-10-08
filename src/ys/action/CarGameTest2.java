package ys.action;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel{
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	public MyPanel2() {
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(new File("git.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no image");
			System.exit(1);
		}
		this.addKeyListener(new MyKeyListener(this));
		this.setFocusable(true); //포커스 받을수 있게 해준다.
		this.requestFocus(); //포커스 요청
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y,null);
		this.repaint();
	}
}

public class CarGameTest2 extends JFrame {
	
	public CarGameTest2() {
		// TODO Auto-generated constructor stub
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel2());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarGameTest2();
	}

}
