package ys.event3;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyKeyListener implements KeyListener {
	JPanel myPanel = null;
	Color color = new Color(0, 0, 0);

	public MyKeyListener(JPanel myPanel) {
		// TODO Auto-generated constructor stub
		this.myPanel = myPanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub		
		color = new Color(
				(int) (Math.random() * 255),
				(int) (Math.random() * 255),
				(int) (Math.random() * 255)
				);

		myPanel.setBackground(color);
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

public class MyFrame extends JFrame {

	private JButton buttonYellow;
	private JButton buttonPink;
	private JPanel panel;

//	MyListener listener = new MyListener(this.panel);
	MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("액션이벤트예제");

		panel = new JPanel();
		panel.addKeyListener(new MyKeyListener(this.panel));
		buttonPink = new JButton("핑크색");
		buttonYellow = new JButton("노란색");
		panel.add(buttonPink);
		buttonPink.addActionListener(new MyListener(this.panel));

		buttonYellow.addActionListener(new MyListener(this.panel));
		panel.add(buttonYellow);
		this.add(panel);
		this.setVisible(true);
		panel.setFocusable(true);
	}

	public JButton getButtonPink() {
		return buttonPink;
	}

	public JButton getButtonYellow() {
		return buttonYellow;
	}

	public JPanel getPanel() {
		return panel;
	}

}
