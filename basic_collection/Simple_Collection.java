package basic_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Assignment1_1 {
	public static void main(String[] args) {
		ArrayList <String> str=new ArrayList <>();
		
		Scanner sc=new Scanner(System.in);
		String string="";
		int no=0;
		do {
			
			System.out.println("1.string add");
			System.out.println("2.display");
			System.out.println("3.delete by index");
			System.out.println("4.string size");
			System.out.println("5.listTerator");
			System.out.println("6.sorting");
			System.out.println("7.reverse");
			System.out.println("8.searching");
			
			System.out.println("0.exit");
			System.out.println("Enter your choice");
			no=sc.nextInt();
			switch(no) {
			case 1:
				System.out.println("Enter the String to add \n Enter stop for exit");
				string=sc.next();
				if(string.equalsIgnoreCase("stop"))
				{
					break;
				}
				str.add(string);
				break;
			case 2:
				System.out.println("========");
			    for(String s: str)
				{
					System.out.println(s);
				}
			    break;
			case 3:
				System.out.println("enter the index for delet");
				int i=sc.nextInt();
				str.remove(i);
				break;
			case 4:
				System.out.println(str.size());
				break;
			case 5:
				ListIterator <String> li=str.listIterator();
				System.out.println("===========");
				while(li.hasNext())
					System.out.println(li.next());
				    break;
			case 6:
				Collections.sort(str);
				break;
			case 7:
				//Collections.reverse(str);
				ListIterator <String> l=str.listIterator(str.size());
				System.out.println("===========");
				while(l.hasPrevious())
					System.out.println(l.previous());
				    break;
			case 8:
				System.out.println("Enter the String for search");
				String s=sc.next();
				System.out.println(s+"present in the index"+Collections.binarySearch(str, s));
				
			
			}
			
		}while(string !="");
		
	}

}
