package Project;

public class Person {

	private String name,address,email;
	private double phoneNumber;
	private int id;
	
	public Person()
	{
		
	}
	
	public Person(String n,String a,String e,double p,int i) {
		this.name=n;
		this.address=a;
		this.email=e;
		this.phoneNumber=p;
		this.id=i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Person";
	}
}
