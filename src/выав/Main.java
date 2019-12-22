package выав;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends JFrame {

	public Main() {
		super("Расчет количества символов в тексте");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Creating panel
		JPanel mainPanel = new JPanel();
		// Creating colours 
		Color myColor = new Color(10, 165, 255);

		// Changing the panel's color
		mainPanel.setBackground(myColor);

		//  Font
		JTextArea area2 = new JTextArea(10, 10);
		area2.setFont(new Font("Dialog", Font.PLAIN, 14));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); 
		// Word wrap options
		area2.setLineWrap(true);
		area2.setWrapStyleWord(true);
		// Setting size and adding to panel
		mainPanel.add(new JScrollPane(area2));
		mainPanel.add(area2);

		// Creating and adding of button
		JButton button1 = new JButton("Посчитать");
		button1.setPreferredSize(new Dimension(100, 50)); 
		mainPanel.add(button1);

		// Set size of window and dispay on the screen
		setContentPane(mainPanel);
		JFrame.setDefaultLookAndFeelDecorated(true);
		setSize(700, 700);
		setVisible(true);

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sew = area2.getText();
				// Pass the data to the method for calculation
				int result = Result(sew); 
				int A = sew.replaceAll(" ", "").length();
				JOptionPane.showMessageDialog(Main.this, "Количество символов = " + result + " Без пробелов = " + A);
			}
		});
	}

	public int Result(String text) { // Set variables and method
		int result = text.length(); // Data transmission
		return result; // Return value
	}

	public static void main(String[] args) {
		new Main();
	}
}