package mapAssignment;
import java.util.*;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="coccacola";
		Map<Character,Integer> count=new TreeMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(count.containsKey(ch))
			{
				int value = count.get(ch);
				value++;
				count.put(ch, value);
			}
			else
			{
				count.put(ch, 1);
			}
		}
		count.forEach((Character c,Integer n)->{
			System.out.println(c+" : "+n);
		});

	}

}
