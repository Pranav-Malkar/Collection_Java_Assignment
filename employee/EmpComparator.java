package employee;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmpComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set <Emp> emp=new TreeSet<>(new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				int diff=o1.getSalary()-o2.getSalary();
//				return diff;
//			}
			
		//});
//		Set<Emp> emp = new TreeSet<>((Emp o1, Emp o2)->{
//			int diff = o1.getSalary() - o2.getSalary();
//			if(diff == 0)
//				diff = o1.compareTo(o2);
//			return diff;
//		});
		
		Set <Emp> emp=new TreeSet<>(new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				int diff;
				diff=o1.dept-o2.dept;
				if(diff==0)
				{
					diff=o2.getSalary()-o1.getSalary();
					if(diff==0)
					{
						diff=o1.getName().compareToIgnoreCase(o2.getName());
						if(diff==0)
						{
							diff=o1.getEid()-o2.getEid();
						}
						
					}
				}
				
				return diff;
			}
			
		
		
		
		});
		emp.add(new Emp(1,"pranav",75000,10));
		emp.add(new Emp(3,"nikhel",65000,20));
		emp.add(new Emp(9,"heema",62000,40));
		emp.add(new Emp(4,"mahindra",71000,30));
		emp.add(new Emp(6,"sam",79000,50));
		emp.add(new Emp(5,"sachin",76000,20));
		emp.add(new Emp(2,"raj",60000,30));
		emp.add(new Emp(10,"saju",55000,10));
		emp.add(new Emp(15,"sham",62000,40));
		emp.add(new Emp(14,"sam",90000,50));
		
		for(Emp e:emp)
		{
			System.out.println(e);
		}



	}

}
