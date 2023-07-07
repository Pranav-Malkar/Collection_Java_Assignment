package Student;
import java.util.*;


public class StudentDemo {

	public static void main(String[] args) {
		Set <Student> students=new HashSet<Student>();
		
		students.add(new Student(111,"pranav","ich",70.00));
		students.add(new Student(101,"nikhel","bhandara",80.00));
		students.add(new Student(191,"heema","kolhapur",75.00));
		students.add(new Student(121,"sachin","chandgad",71.00));
		students.add(new Student(151,"mahindra","jaypur",90.00));
		students.add(new Student(171,"sam","pune",84.00));
		students.add(new Student(173,"pruthvi","mumbai",81.00));
		students.add(new Student(172,"rutu","kolhapur",88.00));
		students.add(new Student(179,"raj","ich",89.00));
		students.add(new Student(17,"sham","bhandara",64.00));
		
		for(Student s:students)
		{
			System.out.println(s);
		}
	

	}

}
