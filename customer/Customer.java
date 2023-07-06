package customer;

public class Customer {
	private String name;
	private String emailid;
	private String cont_no;
	public Customer() {
		super();
	}
	public Customer(String name, String emailid, String cont_no) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.cont_no = cont_no;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailid=" + emailid + ", cont_no=" + cont_no + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getCont_no() {
		return cont_no;
	}
	public void setCont_no(String cont_no) {
		this.cont_no = cont_no;
	}
	
	
	

}
