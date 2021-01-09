package project;

public class Person 
{

	public String name, address, phone, id;
	
	public Person()
	{
		
	}
	
	public Person(String n, String a, String p, String i) 
	{
		this.name = n;
		this.address = a;
		this.phone = p;
		this.id = i;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}
	
	public String toString() 
	{
		return "Person";
	}
}
