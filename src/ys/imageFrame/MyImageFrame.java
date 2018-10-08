package ys.imageFrame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame {
	
	BufferedImage img = null;
	
	public MyImageFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("image load Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try{
			img = ImageIO.read(new File("iu.jpg"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		this.add(new MyPanel());
		pack();
		setVisible(true);
	}
	
	
	class MyPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
//			super.paint(g);
			g.drawImage(img, 0, 0, null);
		}
		
		@Override
		public Dimension getPreferredSize() {
			// TODO Auto-generated method stub
			if(img == null)
				return new Dimension(100, 100);
			else
				return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}
	public static void main(String[] args) {
		new MyImageFrame();
	}

}
