package com.schoolofnet;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc {
	private static JFrame mainFrame;
	private static JButton btnCalc;
	private static JTextField txtNum1;
	private static JTextField txtNum2;
	private static JComboBox op;

	public Calc() {
		prepareGUI();
	}

	public static void main(String[] args) {
		Calc main = new Calc();
	}

	private void prepareGUI() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 300, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Calculator");
		mainFrame.setLayout(new GridLayout(4, 0));
		
		btnCalc = new JButton("Calculate");
		btnCalc.setActionCommand("Calc");
		btnCalc.addActionListener(new BtnHandler());

		txtNum1 = new JTextField(30);
		txtNum2 = new JTextField(30);
		
		op = new JComboBox<>();
		op.addItem("+");
		op.addItem("-");
		op.addItem("*");
		op.addItem("/");

		mainFrame.add(txtNum1);
		mainFrame.add(op);
		mainFrame.add(txtNum2);
		mainFrame.add(btnCalc);

		mainFrame.setVisible(true);
	}

	private class BtnHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			switch (command) {
			case "Calc":
				if (txtNum1.getText() != null && txtNum2.getText() != null && op.getSelectedItem() != null) {
					Integer num1 = Integer.parseInt(txtNum1.getText());
					Integer num2 = Integer.parseInt(txtNum2.getText());
					
					Integer result = 0;
					
					String selectedOperation = op.getSelectedItem().toString();
					
					switch(selectedOperation) {
					case "+":
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
					case "/":
						result = num1 / num2;
						break;
					default:
						JOptionPane.showMessageDialog(null, "Invalid operation.");
						break;
					}
					JOptionPane.showMessageDialog(null, num1 + " " + op.getSelectedItem() + " " + num2 + " = " + result);
				}
				break;
			default:
				System.out.println("Invalid action.");
				break;
			}
		}

	}

}
