package employee;

import java.util.Set;
import java.util.TreeSet;

public class EmpDemo {

	public static void main(String[] args) {
		Set<Emp>emps=new TreeSet<>();
		
		emps.add(new Emp(1,"pranav",75000,));
		emps.add(new Emp(3,"nikhel",65000));
		emps.add(new Emp(9,"heema",62000));
		emps.add(new Emp(4,"mahindra",71000));
		emps.add(new Emp(6,"sam",79000));
		emps.add(new Emp(5,"sachin",76000));
		emps.add(new Emp(2,"raj",60000));
		emps.add(new Emp(10,"saju",55000));
		emps.add(new Emp(15,"sham",80000));
		emps.add(new Emp(14,"rutu",90000));
		
		for(Emp e:emps)
		{
			System.out.println(e);
		}



	}

}
