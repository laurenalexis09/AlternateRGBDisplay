import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PanelListener implements ActionListener{

	int red;
	int green;
	int blue;
	 ColorClass fun;
	ColorDisplayPanel displayPanel;

	public PanelListener(ColorClass fun, int red, int green, int blue, ColorDisplayPanel displayPanel){
		this.fun = fun;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.displayPanel = displayPanel;
	}

	public void actionPerformed(ActionEvent arg0) {

		displayPanel.setBackground(UpdateListener.c);
		

	}

}
