package project;

public class Student extends Person
{	
	public Student()
	{
		
	}
	
	public Student(String n, String i, String a, String p)
	{
		super(n, i, a, p);
	}
	
	@Override
	public String toString()
	{
		return super.name + " " + super.id + " " + super.address + " " + super.phone;
	}
}
