package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;


public class DataPrinter
{	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	String[] s = {"Name", "ID", "Address", "Phone", "Department", "Salary"};
	String[] s2 = {"name"};
	
	public void printInfo(Faculty[] o, int cnt, int len)
	{
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		frame.add(panel);
		
		for(int i = 0, x = 70; i < len; i++, x += 110)
		{
			label = new JLabel(s[i]);
			label.setFont(new Font("Serif", Font.BOLD, 17));
			label.setForeground(Color.white);
			label.setBounds(x, 135, 250, 25);
			panel.add(label);
		}
		
		for(int i = 0, y = 165; i < cnt; i++, y += 35)
		{
			
			for(int j = 0, x = 70; j < len; j++, x += 110)
			{
				String a = null;
				
				if(j == 0)
					a = o[i].name;
				else if(j == 1)
					a = o[i].id;
				else if(j == 2)
					a = o[i].address;
				else if(j == 3)
					a = o[i].phone;
				else if(j == 4)
					a = o[i].department;
				else if(j == 5)
					a = o[i].salary;
				
				label = new JLabel("A");
				label.setFont(new Font("Serif", Font.BOLD, 16));
				label.setForeground(Color.white);
				label.setBounds(x, y, 90, 25);
				panel.add(label);
			}
		}
		frame.setVisible(true);
	}
}
