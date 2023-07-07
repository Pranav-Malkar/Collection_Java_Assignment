package Student;

import java.util.Objects;

public class Student implements Comparable<Student> {
	@Override
	public int hashCode() {
		int hcode = 0;
		if(city.equalsIgnoreCase("kolhapur"))
			hcode=10;
		else if(city.equalsIgnoreCase("pune"))
			hcode=20;
		else if(city.equalsIgnoreCase("bhandara"))
			hcode=30;
		else if(city.equalsIgnoreCase("ich"))
			hcode = 40;
		else
			hcode=50;
		return hcode;
		
	}
	public boolean equals(Student s) {
		boolean flag=false;
		if(this.city.equalsIgnoreCase(s.city) && this.sid==s.sid && this.name.equalsIgnoreCase(s.name)&& this.percentage==s.percentage);
		{
			flag=true;
		}
		return flag;
		
		
	}
	private int sid;
	private String name;
	private String city;
	private double percentage;
	public Student() {
		super();
	}
	public Student(int sid, String name, String city, double percentage) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
