package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calculator {

	private JFrame frame;
	private JTextField jtxtDisplay;
	double EnterNum1;
	double EnterNum2;
	double Result;
	String Operate;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		frame.setBounds(100, 100, 247, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setBounds(10, 11, 211, 28);
		frame.getContentPane().add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		//row0
		
		
		
		
		//......row1........
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn7.getText();
				jtxtDisplay.setText(digit);
				
				
				
			}
		});
		btn7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn8.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn8.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn9.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn9.setBounds(122, 54, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="+";
				
			}
		});
		btnplus.setBounds(178, 54, 50, 50);
		frame.getContentPane().add(btnplus);
		
		//...row2.....
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn4.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn4.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn5.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn5.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn6.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn6.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnsub = new JButton("-");
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="-";
				
			}
		});
		btnsub.setBounds(178, 110, 50, 50);
		frame.getContentPane().add(btnsub);
		
		//......ROW3......
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn1.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn1.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn2.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn2.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn3.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn3.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="*";
			}
		});
		btnMul.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnMul);
		
		//........row4.........
		
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit=jtxtDisplay.getText()+btn0.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn0.setBounds(10, 222, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!jtxtDisplay.getText().contains(".")){
					jtxtDisplay.setText(jtxtDisplay.getText()+btnDot.getText());
				}
						
			}
		});
		btnDot.setBounds(66, 222, 50, 50);
		frame.getContentPane().add(btnDot);
		
		
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum2=Double.parseDouble(jtxtDisplay.getText());
				if(Operate == "+"){
					Result=EnterNum1+EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				else if(Operate == "-"){
					Result=EnterNum1-EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				else if(Operate == "*"){
					Result=EnterNum1*EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				else if(Operate == "/"){
					Result=EnterNum1/EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				else if(Operate == "%"){
					Result=EnterNum1/EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
			}
		});
		btnEqual.setBounds(122, 222, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPM = new JButton("/");
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="/";
			}
		});
		btnPM.setBounds(178, 222, 50, 50);
		frame.getContentPane().add(btnPM);
		
		
		//......row5...........
		
		JButton btnCLR = new JButton("C");
		btnCLR.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="C";
				
			}
		});
		btnCLR.setBounds(10, 276, 50, 50);
		frame.getContentPane().add(btnCLR);
		
		
		
		
		
		
		JButton btnS = new JButton("%");
		btnS.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="%";
				
			}
		});
		btnS.setBounds(66, 276, 50, 50);
		frame.getContentPane().add(btnS);
		
		JButton btnPMS = new JButton("+/-");
		btnPMS.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pm=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
				pm=pm*(-1);
				jtxtDisplay.setText(String.valueOf(pm));
			}
		});
		btnPMS.setBounds(122, 276, 50, 50);
		frame.getContentPane().add(btnPMS);
		
		
				
		
	}
}
