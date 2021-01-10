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

public class Main implements ActionListener, Method
{	
	public static int cnt = 0;
	public static int ind = 0;
	public static Faculty[] fac = new Faculty[100];
	public static Student[] stud = new Student[100];
	public static boolean[][][] att = new boolean[100][15][40];
	
	JFrame frame = new JFrame("Mastermind International School");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel[] line = new JLabel[100];
	JTextField[] text = new JTextField[10];
	String[] s = {"Name", "ID", "Address", "Phone", "Department", "Salary"};
	JButton back1, back2, back3, enter;
	JFrame sframe, fframe, aframe, apframe;
	JButton button[] = new JButton[100];
	JCheckBox box[] = new JCheckBox[100];
	JTextField day, month;
	boolean[] rec = new boolean[100];
	
	public static void main(String[] args)
	{
		try
		{
			new Page1();
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
	    
	    label = new JLabel("Faculties Info: ");
	    label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.white);
		label.setBounds(40, 55, 250, 25);
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
	
	public void getAttendance()
	{
		apframe = new JFrame("Mastermind International School");
		panel = new JPanel();
		
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		apframe.setSize(700, 700);
		apframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		apframe.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		apframe.add(panel);
		
		line[0] = new JLabel("Attendance");
	    line[1] = new JLabel("Day: ");
	    line[2] = new JLabel("Month: ");
	    line[3] = new JLabel("Name");
	    line[4] = new JLabel("ID");
	
	    line[0].setBounds(30, 10, 150, 25);
	    line[1].setBounds(30, 40, 150, 25);
	    
	    try
	    {
	    	day = new JTextField();
			day.setBounds(80, 40, 25, 25);
			panel.add(day);
	    }
	    catch(Exception q)
	    {
	    	
	    }
		
		line[2].setBounds(130, 40, 150, 25);
		
		try
		{
			month = new JTextField();
			month.setBounds(210, 40, 25, 25);
			panel.add(month);
		}
		catch(Exception w)
		{
			
		}
		
		line[3].setBounds(30, 70, 150, 25);
		line[4].setBounds(300, 70, 150, 25);
		
	    for(int i = 0; i < 5; i++) 
	    {
	    	line[i].setFont(new Font("Serif", Font.BOLD, 18));
			line[i].setForeground(Color.white);
			panel.add(line[i]);
	    }
		
		for(int i = 0, j = 5, x = 30, y = 100; i < ind; i++, j++, y += 35)
		{
			line[j] = new JLabel(stud[i].name);
			line[j].setFont(new Font("Serif", Font.BOLD, 17));
			line[j].setForeground(Color.white);
			line[j].setBounds(x, y, 250, 25);
			panel.add(line[j]);
			
			line[j] = new JLabel(stud[i].id);
			line[j].setFont(new Font("Serif", Font.BOLD, 17));
			line[j].setForeground(Color.white);
			line[j].setBounds(x + 270, y, 250, 25);
			panel.add(line[j]);
			
			box[i] = new JCheckBox("Present");
			box[i].setBounds(x + 470, y, 20, 20);
			
			panel.add(box[i]);	
		}
		
		enter = new JButton("Submit");
		enter.setFont(new Font("Serif", Font.BOLD, 15));
		enter.setForeground(Color.black);
		enter.setBounds(30, 620, 110, 30);
		enter.addActionListener(this);
		panel.add(enter);
		
		apframe.setVisible(true);
	}
	
	public void printAttendance(int mon) throws Exception
	{
		aframe = new JFrame("Mastermind International School");
		panel = new JPanel();
		
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		aframe.setSize(1100, 700);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		aframe.add(panel);
		
		String as = String.valueOf(mon);
		line[0] = new JLabel("Attendance for month " + as);
		line[0].setBounds(30, 50, 350, 25);
		line[0].setFont(new Font("Serif", Font.BOLD, 18));
		line[0].setForeground(Color.white);
		panel.add(line[0]);
		
		line[0] = new JLabel("Name");
	    line[1] = new JLabel("ID");
	    line[0].setBounds(30, 80, 150, 25);
		line[1].setBounds(200, 80, 150, 25);
		
		for(int i = 0; i < 2; i++) 
	    {
	    	line[i].setFont(new Font("Serif", Font.BOLD, 18));
			line[i].setForeground(Color.white);
			panel.add(line[i]);
	    }
	    
		label = new JLabel("Day: ");
		label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.white);
		label.setBounds(270, 80, 90, 25);
		panel.add(label);
		for(int i = 0, x = 320, y = 80; i < 30; i++, x += 25)
		{
			String tr = String.valueOf(i + 1);
			label = new JLabel(tr);
			label.setFont(new Font("Serif", Font.BOLD, 16));
			label.setForeground(Color.white);
			label.setBounds(x, y, 90, 25);
			panel.add(label);
		}
		
		for(int i = 0, y = 110; i < ind; i++, y += 35)
		{
			label = new JLabel(stud[i].name);
			label.setFont(new Font("Serif", Font.BOLD, 18));
			label.setForeground(Color.white);
			label.setBounds(30, y, 90, 30);
			panel.add(label);
			
			label = new JLabel(stud[i].id);
			label.setFont(new Font("Serif", Font.BOLD, 18));
			label.setForeground(Color.white);
			label.setBounds(200, y, 90, 30);
			panel.add(label);
			
			for(int j = 1, x = 320; j <= 30; j++, x += 25)
			{
				if(att[i][mon][j])
				{
					label = new JLabel("P");
					label.setFont(new Font("Serif", Font.BOLD, 18));
					label.setForeground(Color.white);
					label.setBounds(x, y, 90, 30);
					panel.add(label);
				}
				else
				{
					label = new JLabel("A");
					label.setFont(new Font("Serif", Font.BOLD, 18));
					label.setForeground(Color.white);
					label.setBounds(x, y, 90, 30);
					panel.add(label);
				}
			}
		}
		
		BufferedImage buttonIcon = ImageIO.read(new File("back.png"));
	    back3 = new JButton(new ImageIcon(buttonIcon));
	    back3.setBorderPainted(false);
	    back3.setFocusPainted(false);
	    back3.setContentAreaFilled(false);
	    back3.setBounds(30, 10, 80, 35);
	    back3.addActionListener(this);
	    panel.add(back3);
		
		aframe.setVisible(true);
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
		else if(e.getSource() == back2)
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
		else if(e.getSource() == back3)
		{
			try
			{
				aframe.dispose();
				new Page2();
			}
			catch(Exception rt)
			{
				
			}
		}
		else if(e.getSource() == enter)
		{
			try
			{
				apframe.dispose();
				int d = Integer.valueOf(day.getText());
				int m = Integer.valueOf(month.getText());
				
				for(int i = 0; i < ind; i++)
				{
					if(box[i].isSelected())
					{
						att[i][m][d] = true;
					}
					else
					{
						att[i][m][d] = false;
					}
				}
				
				new Page2();
			}
			catch(Exception lo)
			{
				
			}
		}
	}
}