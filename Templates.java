package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

JFrame frame = new JFrame("Mastermind International School");

public class Templates 
{
	//Top Part
	panel.setLayout(null);
	panel.setBackground(Color.DARK_GRAY);
	
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	panel.setBackground(Color.DARK_GRAY);
	frame.add(panel);
	
	//Label
	label = new JLabel("Username: ");
	label.setFont(new Font("Serif", Font.BOLD, 16));
	label.setForeground(Color.white);
	label.setBounds(150, 150, 90, 25);
	panel.add(label);
	
	//Button
	button[0] = new JButton("2. Prome");
	button[0].setFont(new Font("Serif", Font.BOLD, 15));
	button[0].setForeground(Color.black);
	button[0].setBounds(120, 130, 220, 30);
	panel.add(button[0]);
	
	//TextField
	userText = new JTextField();
	userText.setBounds(230, 150, 165, 25);
	panel.add(userText);
	
	//BackImageButton
	BufferedImage buttonIcon = ImageIO.read(new File("back.png"));
    JButton back = new JButton(new ImageIcon(buttonIcon));
    back.setBorderPainted(false);
    back.setFocusPainted(false);
    back.setContentAreaFilled(false);
    back.setBounds(120, 305, 80, 35);
    panel.add(back);
}
