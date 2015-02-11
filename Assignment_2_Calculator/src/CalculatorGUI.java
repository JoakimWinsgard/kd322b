import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final Calculator calc = new Calculator();
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("1");
			}
		});
		button_1.setBounds(12, 113, 97, 52);
		contentPane.add(button_1);
		
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("2");
			}
		});
		button_2.setBounds(121, 113, 97, 52);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("3");
			}
		});
		button_3.setBounds(230, 113, 97, 52);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("4");
			}
		});
		button_4.setBounds(12, 178, 97, 52);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("5");
			}
		});
		button_5.setBounds(121, 178, 97, 52);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("6");
			}
		});
		button_6.setBounds(230, 178, 97, 52);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("7");
			}
		});
		button_7.setBounds(12, 243, 97, 52);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("8");
			}
		});
		button_8.setBounds(121, 243, 97, 52);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("9");
			}
		});
		button_9.setBounds(230, 243, 97, 52);
		contentPane.add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("0");
			}
		});
		button_0.setBounds(121, 308, 97, 52);
		contentPane.add(button_0);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("+");
				calc.plus();
			}
		});
		button_plus.setBounds(339, 113, 81, 52);
		contentPane.add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("-");
				calc.minus();
			}
		});
		button_minus.setBounds(339, 178, 81, 52);
		contentPane.add(button_minus);
		
		JButton button_multiply = new JButton("*");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("*");
			calc.mult();
			}
		});
		button_multiply.setBounds(339, 243, 81, 52);
		contentPane.add(button_multiply);
		
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("/");
			}
		});
		button_divide.setBounds(339, 308, 81, 52);
		contentPane.add(button_divide);
		
		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.equals();
				
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("=");
			}
		});
		button_equals.setBounds(28, 308, 81, 52);
		contentPane.add(button_equals);
		
		
		JButton button_c = new JButton("C");
		button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.clear();
				calc.getOperand();
				calc.numberButtonPressed(0);
				textField.setText("C");
			}
		});
		button_c.setBounds(230, 308, 81, 52);
		contentPane.add(button_c);
		
		textField = new JTextField();
		textField.setBounds(12, 43, 408, 52);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
