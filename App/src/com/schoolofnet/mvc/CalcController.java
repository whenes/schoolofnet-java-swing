package com.schoolofnet.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcController implements ActionListener {
	
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JComboBox cmbOperation;
	
	public CalcController(JTextField txtNum1, JTextField txtNum2, JComboBox cmbOperation) {
		this.txtNum1 = txtNum1;
		this.txtNum2 = txtNum2;
		this.cmbOperation = cmbOperation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer result = 0;
		Integer num1 = txtNum1.getText() == null ? 0 : Integer.parseInt(txtNum1.getText());
		Integer num2 = txtNum2.getText() == null ? 0 : Integer.parseInt(txtNum2.getText());
		String operation = this.cmbOperation.getSelectedItem().toString();
		switch (operation) {
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
			JOptionPane.showMessageDialog(null, "Invalid operation");
		}
		JOptionPane.showMessageDialog(null, num1 + " " + operation + " " + num2 + " = " + result);
	}

}
