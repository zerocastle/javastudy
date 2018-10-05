package ys.font;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	Font f1, f2, f3, f4, f5;

	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.setLayout(new FlowLayout());
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Mono", Font.PLAIN, 20);
		f4 = new Font("Dialog", Font.BOLD, 20);
		f5 = new Font("DialogInput", Font.BOLD, 20);

	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub    
		g.drawString("hgfhfgh", 10, 50);
		g.setFont(f2);
		g.drawString("san Serif", 10, 70);
		
	}
}

class MyFrame extends JFrame {

	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension demension = kit.getScreenSize();
		this.setLocation(demension.width / 2, demension.height / 2);
		Image image = kit.getImage("iu.jpg");
		this.setIconImage(image);
		this.setTitle("font들 사용해보기 ");
		this.setSize(500,500);
		
		JPanel panel = new MyPanel();
		this.add(panel);
		this.setVisible(true);

	}

}

public class FontTest2 {

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
	}

}
