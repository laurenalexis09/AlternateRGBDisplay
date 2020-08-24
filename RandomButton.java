import javax.swing.JButton;

@SuppressWarnings("serial")
public class RandomButton extends JButton {

	ColorClass fun;

	public RandomButton(ColorClass fun){

		this.fun = fun;

		setText("Random Color");
	}

}
