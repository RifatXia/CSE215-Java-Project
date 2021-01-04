package Project;

public class Staff {
	private String work;
	
	public Staff()
	{
		
	}
	public Staff(String n, String a, String e, String p, double s,String w) {
		
		this.work=w;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}

	public String toString() {
		return "Staff";
	}
}
