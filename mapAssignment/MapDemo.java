package mapAssignment;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		//Map<Integer,String> maps=new HashMap<>();
		Map<Integer,String> maps=new TreeMap<>();
		maps.put(12, "pranav");
		maps.put(24, "nikhel");
		maps.put(20, "sam");
		maps.put(67, "mhindra");
		maps.put(47, "sachin");
		maps.put(34, "pruthvi");
		maps.put(90, "rushi");
		maps.put(11, "heema");
		
		System.out.println(maps);
		Set<Map.Entry<Integer, String>> set=maps.entrySet();
		for(Map.Entry<Integer, String> me:set)
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		System.out.println("*************************");
		Iterator<Map.Entry<Integer,String>> i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry<Integer,String> e = i.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}


	}

}
