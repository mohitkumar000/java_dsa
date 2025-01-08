package heap;

import java.util.*;

public class heap {

	
	private ArrayList<Integer> list= new ArrayList<>();

	public void add(int item)
	{
		list.add(item);
		upheapify(list.size()-1);
		
	}

	public void add2(int item)
	{
		list.add(item);
		upheapify(list.size()-1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi =(ci-1)/2;
		if(list.get(pi)>list.get(ci));//child priority
		{
			swap(pi,ci);
			upheapify(pi);
			
		}
		
		
		
		
		
	}
	private void swap(int i,int j)
	{
		int ith = list.get(i);
		int jth =list.get(j);
		list.set(i, jth);
		list.set(j, ith);
		
	}
	
	public int getmin()
	{
		return list.get(0);
	}
	public void display()
	{
		System.out.println(list);
	}
		

	
	
	

}
