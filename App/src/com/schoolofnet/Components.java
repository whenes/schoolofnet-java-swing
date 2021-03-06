package com.schoolofnet;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Components {
	private static JFrame mainFrame;
	private static JPanel mainPanel;
	private static JButton btnAction;
	private static JTextField inputAction;

	public Components() {
		showGUI();
	}

	public static void main(String[] args) {
		Components main = new Components();
	}

	private void showGUI() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 400, 200);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Second Frame");
		mainFrame.setLayout(new GridLayout(0, 2));
		
		btnAction = new JButton("Click here.");
		btnAction.setActionCommand("Action");
		btnAction.addActionListener(new BtnHandler());

		inputAction = new JTextField(30);

		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(inputAction);
		mainPanel.add(btnAction);

		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}

	private class BtnHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			switch (command) {
			case "Action":
				System.out.println("My first event");
				JOptionPane.showMessageDialog(null, inputAction.getText());
				break;
			default:
				System.out.println("Invalid action.");
				break;
			}
		}

	}

}
