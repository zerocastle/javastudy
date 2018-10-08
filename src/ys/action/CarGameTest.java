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



class MyPanel extends JPanel{
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	public MyPanel() {
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(new File("git.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP: img_y = img_y - 10; break;
				case KeyEvent.VK_DOWN: img_y = img_y + 10; break;
				case KeyEvent.VK_LEFT: img_x = img_x - 10; break;
				case KeyEvent.VK_RIGHT: img_x = img_x + 10; break;
				}
				repaint();
			}
		});
		this.requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y,null);
	}
}

public class CarGameTest extends JFrame {
	
	public CarGameTest() {
		// TODO Auto-generated constructor stub
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarGameTest();
	}

}
