import javax.swing.JButton;

@SuppressWarnings("serial")
public class UpdateButton extends JButton{

	ColorClass fun;

	public UpdateButton(ColorClass fun){

		this.fun = fun;

		setText("Update");
	}
}
