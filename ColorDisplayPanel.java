import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ColorDisplayPanel extends JPanel {


	int red;
	int green;
	int blue;
	public ColorClass fun;


	public ColorDisplayPanel(ColorClass fun){
		this.fun = fun;
		setBackground(UpdateListener.c);
		setForeground(UpdateListener.c);
	}



}
