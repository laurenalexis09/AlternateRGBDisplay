import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class RandomListener implements ActionListener{

	ColorClass fun;
	ColorDisplayPanel displayPanel;
	RandomButton random;
	int red;
	int green;
	int blue;
	JTextField code;
	JTextField r;
	JTextField g;
	JTextField b;
	JTextField messages;

	public RandomListener(ColorClass fun, RandomButton random, JTextField code, ColorDisplayPanel displayPanel, JTextField r, JTextField g, JTextField b, JTextField messages){
		this.fun = fun;
		this.messages = messages;
		this.random = random;
		this.displayPanel = displayPanel;
		this.code = code;
		this.r = r;
		this.g = g;
		this.b = b;
	}


	public void actionPerformed(ActionEvent arg0) {
		messages.setText("💻🐇: Random color generated and displayed");
		UpdateListener.c = new Color(red = (int)(Math.random()*255), green = (int)(Math.random()*255), blue = (int)(Math.random()*255));
		
		code.setText("Current RGB Color Code:"+" ("+red+", "+green+", "+blue+")");
		
		displayPanel.setBackground(UpdateListener.c);
		
		r.setText("");
		g.setText("");
		b.setText("");

	}

}
