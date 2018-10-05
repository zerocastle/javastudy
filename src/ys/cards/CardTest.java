package ys.cards;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener {

	JPanel panel;
	Cards cards;

	public MyFrame() {
		// TODO Auto-generated constructor stub
		setTitle("CardLayout");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5,10,0));
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		
		this.add(panel , "North");
		cards = new Cards();
		this.add(cards, "Center");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("종료")) {
			System.out.println(e.getActionCommand());
			System.exit(0);
		}else if(e.getActionCommand().equals("<<")) {
			System.out.println(e.getActionCommand());
			cards.layout.first(cards);
		}else if(e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		}else if(e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		}else if(e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}

	}

	private void addButton(String str, Container target) {
		// TODO Auto-generated method stub
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}

	private class Cards extends JPanel {
		CardLayout layout;

		public Cards() {
			// TODO Auto-generated constructor stub
			layout = new CardLayout();
			this.setLayout(layout);
			for (int i = 1; i <= 10; i++) {
				this.add(new JButton("현재 카드의 번호는" + i + "입니다"), "Center");
			}
		}
	}

}

public class CardTest {

	public CardTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
