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
		setTitle("���� ���� �̺�Ʈ");
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
}

class MyPanel extends JPanel implements ActionListener {
	private JButton button;
	private Color color = new Color(0, 0, 0); //�⺻ ������ ����(������)
	BufferedImage img = null;

	public MyPanel() {
		setLayout(new BorderLayout());
		button = new JButton("���󺯰�");
		button.addActionListener(this); // �ȿ� ���ڰ��� acionPerformed abstract �޼ҵ尡 ���� �Ǿ� �ִ� ��ü�� ã�´�.
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
		
		Font f3 = new Font("����ü",Font.ITALIC,20);
		g.setFont(f3);g.drawString("����ü 20 ITALIC", 20,100);
		
		Font f4 = new Font("Dialog",Font.ITALIC,20);
		g.setFont(f4);g.drawString("Dialog 20 ITALIC", 20,120);
		
		g.drawImage(img, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
		System.out.println("������ ����Ʈ ó�� �޼ҵ� ����");
		repaint(); //���� �����̳ʸ� �ٽ� �׸��� �ϴ� �޼ҵ� ����� paint()�� ���� ȣ���ϸ� �ȵȴ�.

	}

}

// 1.������ �������̽��� ���
// 2.��ư�� ������ ���
// 3.������ ����Ʈ ó�� �޼ҵ� ����
