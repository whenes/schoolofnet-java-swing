package com.schoolofnet.mvc;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcView {
	private JFrame frame;
	private JButton btnCalc;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JComboBox cmbOperation;
	
	public CalcView() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4, 0));
		
		btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new CalcController(txtNum1, txtNum2, cmbOperation));
		txtNum1 = new JTextField(30);
		txtNum2 = new JTextField(30);
		cmbOperation = new JComboBox<>();
		
		frame.add(txtNum1);
		frame.add(cmbOperation);
		frame.add(txtNum2);
		frame.add(btnCalc);
		
		frame.setVisible(true);
	}
}
