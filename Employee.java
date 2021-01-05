package project;

public class Employee extends Person {
	private double salary;
	
	public Employee() 
	{
		
	}
	public Employee(String n, String a, String e, String p, double s) 
	{
		this.salary=s;
		
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public String toString() 
	{
		return "Employee";
	}

}
