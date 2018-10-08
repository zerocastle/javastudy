package ys.action;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
	private MyPanel2 myPanel;
	private int offset = 10;
	public MyKeyListener(MyPanel2 myPanel2) {
		// TODO Auto-generated constructor stub
		this.myPanel = myPanel2;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_RIGHT) {
			myPanel.img_x = myPanel.img_x + offset;
			System.out.println(keycode);
		}else if(keycode == KeyEvent.VK_LEFT) {
			myPanel.img_x = myPanel.img_x - offset;
			System.out.println(keycode);
		}else if(keycode == KeyEvent.VK_DOWN) {
			myPanel.img_y = myPanel.img_y + offset;
			System.out.println(keycode);
		}else if(keycode == KeyEvent.VK_UP) {
			myPanel.img_y = myPanel.img_y - offset;
			System.out.println(keycode);
		}
		
//		myPanel.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
