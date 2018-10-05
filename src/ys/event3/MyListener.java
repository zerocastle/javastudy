package ys.event3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyListener implements ActionListener {
	JPanel myPanel = null;
	public MyListener(JPanel myPanel) {
		this.myPanel = myPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		
		String str = button.getText();
		
		if(str.equals("ÇÎÅ©»ö")) {
			this.myPanel.setBackground(Color.pink);
		}else
			this.myPanel.setBackground(Color.YELLOW);
		
	}
	
	

}
