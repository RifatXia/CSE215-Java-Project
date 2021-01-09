package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Page1 implements ActionListener
{
	JFrame frame = new JFrame("Mastermind International School");
	private static JPanel panel;
	private static JTextField userText;
	private static JLabel userLabel;
	private static JLabel pass;
	private static JPasswordField password;
	private static JButton button;
	private static JLabel success;
	
	public Page1()
	{
		panel = new JPanel();
		panel.setLayout(null);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		frame.add(panel);
		
		JLabel intro = new JLabel("  Mastermind International School");
		intro.setFont(new Font("Serif", Font.BOLD, 16));
		intro.setForeground(Color.white);
		intro.setBounds(120, 120, 450, 25);
		panel.add(intro);
		
		userLabel = new JLabel("Username: ");
		userLabel.setFont(new Font("Serif", Font.BOLD, 16));
		userLabel.setForeground(Color.white);
		userLabel.setBounds(120, 160, 90, 25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(200, 160, 165, 25);
		panel.add(userText);
		
		pass = new JLabel("Password: ");
		pass.setFont(new Font("Serif", Font.BOLD, 16));
		pass.setForeground(Color.white);
		pass.setBounds(120, 200, 90, 25);
		panel.add(pass);
		
		password = new JPasswordField();
		password.setBounds(200, 200, 165, 25);
		panel.add(password);
		
		button = new JButton("Login");
		button.setBounds(120, 260, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		
		success = new JLabel("");
		success.setFont(new Font("Serif", Font.BOLD, 16));
		success.setForeground(Color.white);
		success.setBounds(120, 290, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String user = userText.getText();
		String userPass = password.getText();
		
		if(user.equals("a") && userPass.equals("a"))
		{
			success.setText("Login Successfull!!");
			frame.setVisible(false);

			try
			{
				new Page2();
			}
			catch(Exception f)
			{
				
			}
		}
		else
			success.setText("Wrong Username or Password!!");
	}
}
