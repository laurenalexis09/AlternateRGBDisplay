import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;



@SuppressWarnings("serial")
public class ColorClass extends JFrame {

	private JTextField r = new JTextField(5);
	private JTextField g = new JTextField(5);	
	private JTextField b = new JTextField(5);	
	private JTextField z = new JTextField(100);
	private JTextField code = new JTextField("The RGB code will appear here");
	private JTextField messages = new JTextField("💻🐇: Hi! Welcome to the generator. Errors and messages appear here. ");
	private final String Lauren = "Lauren Cugliotta's Color Display Program";


	private JPanel myPanel = new JPanel();
	private JPanel extra = new JPanel();
	private JPanel buttons = new JPanel();
	private JPanel textFields = new JPanel();
	

	private	JLabel redLabel = new JLabel("Red:", JLabel.CENTER);
	private JLabel greenLabel = new JLabel("Green:", JLabel.CENTER);
	private JLabel blueLabel = new JLabel("Blue:", JLabel.CENTER);

	
	private ColorDisplayPanel displayPanel = new ColorDisplayPanel(this);
	
	private	UpdateButton update = new UpdateButton(this);
	private RandomButton random = new RandomButton(this);
	private JButton rulesButton = new JButton();
	

	private	Border border = BorderFactory.createLineBorder(Color.BLACK, 2);


	public ColorClass(){

		z.setText("Enter RGB values below (0-255 for each block) and press \"Update\"");

		r.setHorizontalAlignment(JTextField.CENTER);
		g.setHorizontalAlignment(JTextField.CENTER);
		b.setHorizontalAlignment(JTextField.CENTER);
		z.setHorizontalAlignment(JTextField.CENTER);
		code.setHorizontalAlignment(JTextField.CENTER);


		r.setFont(r.getFont().deriveFont(Font.BOLD, 14f));
		g.setFont(g.getFont().deriveFont(Font.BOLD, 14f));
		b.setFont(b.getFont().deriveFont(Font.BOLD, 14f));
		z.setFont(z.getFont().deriveFont(Font.BOLD, 12f));
		messages.setFont(messages.getFont().deriveFont(Font.BOLD, 12f));
		code.setFont(code.getFont().deriveFont(Font.BOLD, 14f));
		r.setBorder(border);
		g.setBorder(border);
		b.setBorder(border);
		z.setBorder(border);
		
		rulesButton.setText("What is RGB?");

		myPanel.setLayout(new GridLayout(1,7));
		extra.setLayout(new GridLayout(3,1));
		buttons.setLayout(new GridLayout(1,2));
		textFields.setLayout(new GridLayout(2,1));

		myPanel.add(redLabel);
		myPanel.add(r);
		myPanel.add(greenLabel);
		myPanel.add(g);
		myPanel.add(blueLabel);
		myPanel.add(b);
		myPanel.add(update);

		extra.add(z);
		extra.add(myPanel);
		buttons.add(random);
		buttons.add(rulesButton);
		extra.add(buttons);


		textFields.add(code);
		textFields.add(messages);

		update.addActionListener(new UpdateListener(this, update, displayPanel, messages, code, r, g, b) );
		random.addActionListener(new RandomListener(this, random, code, displayPanel, r, g, b, messages));
		rulesButton.addActionListener(new rulesListener());

		update.setMargin(new Insets(0, 0, 0, 0));
		z.setMargin(new Insets(0, 0, 0, 0));

		setLayout(new BorderLayout());

		add(extra, BorderLayout.NORTH);
		add(displayPanel, BorderLayout.CENTER);
		add(textFields, BorderLayout.SOUTH);

		setSize(500,500);
		
		setTitle(""+Lauren);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent e) {
				e.getWindow().dispose();

			}
		});
		setLocationRelativeTo(null);
		setVisible(true);
		
		Color b = new Color(204,204,255);
		
		myPanel.setBackground(b);
		

	}

	

	public static void main(String[] args){
		
		   try {
	            // Set System L&F
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {
	       // handle exception
	    }
	    catch (IllegalAccessException e) {
	       // handle exception
	    }
	

		new ColorClass();
	}

}
