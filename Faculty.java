package project;

public class Faculty extends Person
{
	public String department, salary;
	
	public Faculty()
	{
		
	}
	public Faculty(String n, String i, String a, String p, String d, String s)
	{
		super(n, i, a, p);
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

	@Override
	public String toString()
	{
		return super.name + " " + super.id + " " + super.address + " " + super.phone + " " + department + " " + salary;
	}
}
