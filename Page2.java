package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Page2 implements ActionListener
{
	JFrame frame = new JFrame("Mastermind International School");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton[] button = new JButton[20];
	
	public Page2() throws IOException
	{
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		frame.add(panel);

		label = new JLabel("Choose an option: ");
		label.setFont(new Font("Serif", Font.BOLD, 17));
		label.setForeground(Color.white);
		label.setBounds(120, 70, 150, 25);
		panel.add(label);
		
		button[0] = new JButton("1. Add Student Info");
		button[1] = new JButton("2. Add Faculty Info");
		button[2] = new JButton("3.Show Student Info");
		button[3] = new JButton("4.Show Faculty Info");
		button[4] = new JButton("5.Read data from file");
		button[5] = new JButton("6.  Take Attendance");
		
		int y = 100;
		for(int i = 0; i < 6; i++, y += 40)
		{
			button[i].setFont(new Font("Serif", Font.BOLD, 15));
			button[i].setForeground(Color.black);
			button[i].setBounds(120, y, 220, 30);
			panel.add(button[i]);
		}
		
		BufferedImage buttonIcon = ImageIO.read(new File("back.png"));
	    button[10] = new JButton(new ImageIcon(buttonIcon));
	    button[10].setBorderPainted(false);
	    button[10].setFocusPainted(false);
	    button[10].setContentAreaFilled(false);
	    button[10].setBounds(120, y, 80, 35);
	    button[10].addActionListener(this);
	    panel.add(button[10]);
	    
	    for(int i = 0; i < 6; i++)
	    {
	    	button[i].addActionListener(this);
	    }
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		frame.dispose();
		Main obj = new Main();
		
		if(e.getSource() == button[0])
		{
			new StudentPage();
		}
		else if(e.getSource() == button[1])
		{
			new FacultyPage();
		}
		else if(e.getSource() == button[2])
		{
			try
			{
				obj.printStudentInfo();
			}
			catch(Exception c)
			{
				
			}
		}
		else if(e.getSource() == button[3])
		{
			try
			{
				obj.printFacultyInfo();
			}
			catch(Exception b)
			{
				
			}
		}
		else if(e.getSource() == button[4])
		{
			try
			{
				obj.FileReader();
			}
			catch(Exception a)
			{
				System.out.println("No");
			}
		}
		else if(e.getSource() == button[10])
		{
			try
			{
				new Page1();
			}
			catch(Exception a)
			{
				
			}
		}
	}
}
