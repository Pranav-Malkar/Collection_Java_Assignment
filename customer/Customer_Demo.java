package customer;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer_Demo {
	public static void main(String[] args) {
		ArrayList<Customer> c=new ArrayList<Customer>(); 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter emailid");
		String emailid=sc.next();
		System.out.println("Enter phone number");
		String cont_no=sc.next();
		Customer cust=new Customer(name,emailid,cont_no);
	}

}
