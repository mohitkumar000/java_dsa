package Array_list;
import java .util.*;

public class array_list_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.size());
		System.out.println(list.remove(2));
		
		System.out.println();
		list.set(0, 1);
		
		//to sort array list
		Collections.sort(list);
		//to  get the value of index
		list.get(0);
		//to print the element in array list
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" ");
			
		}
		
		

	}

}
