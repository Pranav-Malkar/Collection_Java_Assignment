package basic_collection;

import java.util.ArrayList;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<>(20);
		int [] a= {0,1,53,27,64,13,17,-14,2};
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			
			for(int j=2;j<a[i];j++)
			{
				
				if(a[i]%i==0)
				{
					flag=true;
					break;
				}
				
				
			}
			if(flag == false && a[i]>=2)
			{
				ar.add(a[i]);
			}
			
		}
		for(Integer m:ar)
		{
			System.out.println(m);
		}

	}

}
