import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class UpdateListener implements ActionListener {


	private	JTextField r;
	private JTextField g;
	private	JTextField b;
	private	JTextField code;
	private	JTextField messages;

	ColorClass fun;
	private	ColorDisplayPanel displayPanel;
	private	UpdateButton update;
	private	String re;
	private	String gree;
	private String blu;

	int red;
	int green;
	int blue;

	static Color c;
	Color d;


	public UpdateListener(ColorClass fun, UpdateButton update, ColorDisplayPanel displayPanel, JTextField messages, JTextField code, JTextField r, JTextField g, JTextField b){
		this.fun = fun;
		this.code = code;
		this.displayPanel = displayPanel;
		this.messages = messages;
		this.r = r;
		this.g = g;
		this.b = b;
		this.update = update;
		

	}

	public void actionPerformed(ActionEvent arg0) {

		messages.setText("💻🐇: Hi! Errors and messages will be displayed here. ");

		re = r.getText();
		gree =	g.getText();
		blu = b.getText();

		messages.setText("💻🐇: RGB code read and analyzed. Displaying color.");
		
		try {
			red = Integer.parseInt(re);
		} catch (java.lang.NumberFormatException e) {
			messages.setText("❎: You need to enter numbers, no symbols or blank spaces. Defaulting to 0.");
			red = 0;
		}
		
		try {
			green = Integer.parseInt(gree);
		} catch (java.lang.NumberFormatException e) {
			messages.setText("❎: You need to enter numbers, no symbols or blank spaces. Defaulting to 0.");
			green = 0;
		}
		
		try {
			blue = Integer.parseInt(blu);
		} catch (java.lang.NumberFormatException e) {
			messages.setText("❎: You need to enter numbers, no symbols or blank spaces. Defaulting to 0.");
			blue = 0;
		}
		

		
		if(red > 255){
			
			messages.setText("❎: You can't set values larger than 255. Value set to 255.");
			red = 255;
		}

		if(red < 0){
			
			messages.setText("❎: You can't set values smaller than 0. Value set to 0.");
			red = 0;
		}


		if(green > 255){
			
			messages.setText("❎: You can't set values larger than 255. Value set to 255.");
			green = 255;
		}

		if(green < 0){
			
			messages.setText("❎: You can't set values smaller than 0. Value set to 0.");
			green = 0;
		}

		if(blue > 255){
			
			messages.setText("❎: You can't set values larger than 255. Value set to 255.");
			blue = 255;
		}

		if(blue < 0){
			messages.setText("❎: You can't set values smaller than 0. Value set to 0.");
			blue = 0;
		}

		c = new Color(red,green,blue);
		d = new Color(255 - red, 255 - green, 255 - blue);
		
		

		code.setText("Current RGB Color Code:"+" ("+red+", "+green+", "+blue+")");
		//code.setForeground(d);
		displayPanel.setBackground(c);
		
		r.setText("");
		g.setText("");
		b.setText("");

	}



}
