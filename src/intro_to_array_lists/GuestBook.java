package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	
	JButton one;
	JButton two;
	JTextField output;
	JTextField box;
	JFrame frame;
	
	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBook a = new GuestBook();
		a.makeUI();
	}
	
	void makeUI() {
		frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setTitle("Guest Book");
		one = new JButton();
		one.setText("Add Names");
		two = new JButton();
		two.setText("View Names");
		panel.add(one);
		panel.add(two);
		box = new JTextField();
		box.setSize(20, 20);
		output = new JTextField();
		output.setSize(50, 20);
		panel.add(box);
		panel.add(output);
		output.setEditable(false);
		output.setVisible(false);
		one.addActionListener(this);
		two.addActionListener(this);
		box.getText();
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == one) {
			String a = box.getText();
			names.add(a);
			output.setText(a);
			if (a.contains(" ")) {
				a = a + ", ";
			}
			box.setText(" ");
			output.setVisible(false); 
			frame.pack();
		}
		if (buttonPressed == two) {
			output.setVisible(true);
			frame.pack();
		}
		else {
			output.setText("What happenned?");
			output.setVisible(true);
			frame.pack();
		}
	}
}
