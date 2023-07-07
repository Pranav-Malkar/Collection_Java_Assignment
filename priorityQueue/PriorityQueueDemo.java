package priorityQueue;
import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<>();
		
		 queue.add("pranav");
		 queue.add("nikhel");
		 queue.add("sam");
		 queue.add("sachin");
		 queue.add("pruthvi");
		 queue.add("heema");
		 queue.add("mahindra");
		 queue.add("rushi");
		
		 System.out.println("*****Storeage*******");
		 for(String s:queue)
		 {
			 System.out.println(s);
		 }
		 System.out.println("********Removal********");
		 while(!queue.isEmpty())
		 {
			 System.out.println(queue.remove()+ " : "+queue.size());
			 System.out.println("************************");
				//System.out.println(queue.poll()+ " : "+queue.size());
		 }

	}

}
