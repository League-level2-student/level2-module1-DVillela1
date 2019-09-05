package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {

	JButton add;
	JButton view;

	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
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
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		add = new JButton();
		view = new JButton();

		frame.setTitle("Guest Book");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.addActionListener(this);
		add.setText("Add Names");
		view.addActionListener(this);
		view.setText("View Names");
		frame.add(panel);
		panel.add(add);
		panel.add(view);

		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == add) {
			String b = JOptionPane.showInputDialog("Add a name");
			names.add(b);
		}
		if (buttonPressed == view) {
			JFrame frame = new JFrame();
			frame.setTitle("Guests");
			JPanel panel = new JPanel();
			frame.add(panel);
			frame.setVisible(true);
			JLabel label = new JLabel();
			panel.add(label);
			for (int a = 0; a < names.size(); a++) {
				label.setText(label.getText() + "Guest #" + a + " " + names.get(a) + ", ");
			}
			frame.pack();
		}
	}
}
