import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class rulesListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "What is \"RGB?\""
				+ "\n💻🐇: RGB or \"Red, Green, Blue\" is an additive color system. When different numbers are combined in different proportions, any color in the visible color spectrum can be created."
				+ "\n A combination of colors will be lighter than the two colors mixed together. Setting all to 255 will display the color white, for example."
				+ "\nLeaving all at zero will result in black. Setting all to the same color will result in some shade of gray."
				+ "\n"
				+ "\n \"But how does this program work?\" "
				+ "\n Quite simple, actually. Notice the three boxes with the labels of RGB. In each box, you should enter a number between 0-255. "
				+ "\n When you press the \"Update\" button, it will read in your values, analyze them, and it will display a color."
				+ "\n"
				+ "\n \"What happens if you enter something that isn't in that range?\" "
				+ "\n The program is designed to find and correct several errors. Known errors:"
				+ "\n Entering a number bigger than 255: That won't work in the RGB system. It will automatically default to 255. "
				+ "\n Entering a negative number: That won't work in the RGB system. It will automatically default to 0. "
				+ "\n Entering something that is not a number: You can only make a color out of numbers. It will automatically default to 0. This includes decimals."
				+ "\n Entering nothing: You need a value to display a color. It will automatically default to 0. "
				+ "\n"
				+ "\n I hope you enjoy using my program - Lauren Cugliotta 🐇 ", "This should help", JOptionPane.PLAIN_MESSAGE);

	}

}
