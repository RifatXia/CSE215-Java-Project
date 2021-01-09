package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main implements ActionListener
{	
	public static int cnt = 0;
	public static int ind = 0;
	public static Faculty[] fac = new Faculty[100];
	public static Student[] stud = new Student[100];
	public static int[][][] att = new int[100][15][40];
	
	JFrame frame = new JFrame("Mastermind International School");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField[] text = new JTextField[10];
	String[] s = {"Name", "ID", "Address", "Phone", "Department", "Salary"};
	JButton back1, back2;
	JFrame sframe, fframe;
	
	public static void main(String[] args)
	{
		try
		{
			new Page2();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void printFacultyInfo() throws Exception
	{
		JPanel panel = new JPanel();
		fframe = new JFrame("Mastermind International School");
		
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		fframe.setSize(700, 700);
		fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fframe.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		fframe.add(panel);
		
		BufferedImage buttonIcon = ImageIO.read(new File("back.png"));
	    back1 = new JButton(new ImageIcon(buttonIcon));
	    back1.setBorderPainted(false);
	    back1.setFocusPainted(false);
	    back1.setContentAreaFilled(false);
	    back1.setBounds(40, 10, 80, 35);
	    back1.addActionListener(this);
	    panel.add(back1);
	    
	    label = new JLabel("Faculty's Info: ");
		label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.white);
		label.setBounds(40, 60, 250, 25);
		panel.add(label);
		
		for(int j = 0, x = 40; j < 6; j++, x += 110)
		{
			label = new JLabel(s[j]);
			label.setFont(new Font("Serif", Font.BOLD, 18));
			label.setForeground(Color.white);
			label.setBounds(x, 90, 250, 25);
			panel.add(label);
		}
		
		for(int i = 0, y = 120; i < cnt; i++, y += 35)
		{
			for(int j = 0, x = 40; j < 6; j++, x += 110)
			{	
				String a = "";
				if(j == 0)
					a = fac[i].name;
				else if(j == 1)
					a = fac[i].id;
				else if(j == 2)
					a = fac[i].address;
				else if(j == 3)
					a = fac[i].phone;
				else if(j == 4)
					a = fac[i].department;
				else if(j == 5)
					a = fac[i].salary;
				
				label = new JLabel(a);
				label.setFont(new Font("Serif", Font.BOLD, 18));
				label.setForeground(Color.white);
				label.setBounds(x, y, 90, 25);
				panel.add(label);
			}
		}
		fframe.setVisible(true);
	}
	
	public void printStudentInfo() throws Exception
	{
		JPanel panel = new JPanel();
		sframe = new JFrame("Mastermind International School");
		
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		sframe.setSize(700, 700);
		sframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sframe.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		sframe.add(panel);
		
		BufferedImage buttonIcon = ImageIO.read(new File("back.png"));
	    back2 = new JButton(new ImageIcon(buttonIcon));
	    back2.setBorderPainted(false);
	    back2.setFocusPainted(false);
	    back2.setContentAreaFilled(false);
	    back2.setBounds(70, 10, 80, 35);
	    back2.addActionListener(this);
	    panel.add(back2);
	    
	    label = new JLabel("Student's Info: ");
		label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.white);
		label.setBounds(70, 50, 250, 25);
		panel.add(label);
		
		for(int j = 0, x = 70; j < 4; j++, x += 150)
		{
			label = new JLabel(s[j]);
			label.setFont(new Font("Serif", Font.BOLD, 18));
			label.setForeground(Color.white);
			label.setBounds(x, 80, 250, 25);
			panel.add(label);
		}
		
		for(int i = 0, y = 110; i < ind; i++, y += 35)
		{
			for(int j = 0, x = 70; j < 4; j++, x += 150)
			{	
				String a = "";
				if(j == 0)
					a = stud[i].name;
				else if(j == 1)
					a = stud[i].id;
				else if(j == 2)
					a = stud[i].address;
				else if(j == 3)
					a = stud[i].phone;
				
				label = new JLabel(a);
				label.setFont(new Font("Serif", Font.BOLD, 18));
				label.setForeground(Color.white);
				label.setBounds(x, y, 90, 25);
				panel.add(label);
			}
		}
		sframe.setVisible(true);
	}
	
	public void FileReader() throws IOException
	{
		File myFile = new File("in.txt");
		
		Scanner in = new Scanner(myFile);
		String num[] = new String[10];
		
		while(in.hasNext())
		{
			num[0] = in.next();
			
			if(num[0].equals("1"))
			{
				for(int i = 1; i <= 4; i++)
				{
					num[i] = in.next();
				}
				stud[ind] = new Student(num[1], num[2], num[3], num[4]);
				ind++;
			}
			else
			{
				for(int i = 1; i <= 6; i++)
				{
					num[i] = in.next();
				}
				fac[cnt] = new Faculty(num[1], num[2], num[3], num[4], num[5], num[6]);
				cnt++;
			}
		}
		
		in.close();

		try
		{
			new Page2();
		}
		catch(Exception ec)
		{
			
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == back1)
		{
			try
			{
				fframe.dispose();
				new Page2();
			}
			catch(Exception z)
			{
				
			}
		}
		else
		{
			try
			{
				sframe.dispose();
				new Page2();
			}
			catch(Exception z)
			{
				
			}
		}
	}
}





