package ys.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTest extends JFrame {

	public ColorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
	}

}

class MyFrame extends JFrame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(240, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("색깔 변경 이벤트");
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
}

class MyPanel extends JPanel implements ActionListener {
	private JButton button;
	private Color color = new Color(0, 0, 0); //기본 색상을 지정(검은색)
	BufferedImage img = null;

	public MyPanel() {
		setLayout(new BorderLayout());
		button = new JButton("생상변경");
		button.addActionListener(this); // 안에 인자값은 acionPerformed abstract 메소드가 구현 되어 있는 객체를 찾는다.
		add(button, BorderLayout.SOUTH);
		try {
			img = ImageIO.read(new File("iu.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 200, 20);
		Font f1 = new Font("Serif",Font.PLAIN,20);
		g.setFont(f1);g.drawString("Serif 20 PLAIN", 20,60);
		
		Font f2 = new Font("San Serif",Font.BOLD,20);
		g.setFont(f2);g.drawString("San Serif 20 BOLD", 20,80);
		
		Font f3 = new Font("굴림체",Font.ITALIC,20);
		g.setFont(f3);g.drawString("굴림체 20 ITALIC", 20,100);
		
		Font f4 = new Font("Dialog",Font.ITALIC,20);
		g.setFont(f4);g.drawString("Dialog 20 ITALIC", 20,120);
		
		g.drawImage(img, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
		System.out.println("리스너 에벤트 처리 메소드 구현");
		repaint(); //현재 컨테이너를 다시 그리게 하는 메소드 절대로 paint()를 직접 호출하면 안된다.

	}

}

// 1.리스너 린터페이스를 상속
// 2.버튼에 리스너 등록
// 3.리스너 에벤트 처리 메소드 구현
