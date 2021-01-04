package Project;

public class Faculty extends Employee{
	
	private String designation,department;
	
	public Faculty()
	{
		
	}
	public Faculty(String n, String a, String e, String p, double s,String d,String dep) {
		this.designation=d;
		this.department=dep;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return "Faculty";
	}
}
