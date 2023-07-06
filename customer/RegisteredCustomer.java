package customer;

public class RegisteredCustomer extends Customer {
	private int regno;

	public RegisteredCustomer() {
		super();
	}

	public RegisteredCustomer(String name, String emailid, String cont_no, int regno) {
		super(name, emailid, cont_no);
		this.regno = regno;
	}

	@Override
	public String toString() {
		return "RegisteredCustomer [regno=" + regno + ", toString()=" + super.toString() + ", getName()=" + getName()
				+ ", getEmailid()=" + getEmailid() + ", getCont_no()=" + getCont_no() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	

}
