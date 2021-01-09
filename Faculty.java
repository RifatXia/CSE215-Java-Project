package project;

public class Faculty extends Person
{
	public String department, salary;
	
	public Faculty()
	{
		
	}
	public Faculty(String n, String a, String p, String id, String d, String s) 
	{
		super(n, a, p, id);
		this.department = d;
		this.salary = s;
	}
	
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
	public String getSalary()
	{
		return salary;
	}
	
	public void setSalary(String salary)
	{
		this.salary = salary;
	}

	public String toString() 
	{
		return "Faculty";
	}
}
