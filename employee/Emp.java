package employee;

public class Emp implements Comparable<Emp> {
	private int eid;
	private String name;
	private int salary;
	int dept;
	
	public Emp() {
		super();
	}
	
	public Emp(int eid, String name, int salary, int dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Emp o) {
		
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	
	

}
