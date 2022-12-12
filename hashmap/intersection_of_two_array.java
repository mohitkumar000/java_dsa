package hashmap;
import java.util.*;
import java.io.*;

public class intersection_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,2,1};
		int [] arr2 = {2,2};
	int [] ans =
		intersection(arr1,arr2);
		 for(int i =0;i<ans.length;i++)
		 {
			 System.out.println(ans[i]);
		 }
		
		
		
		

	}
	
	public static int []  intersection(int [] arr1,int [] arr2)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<arr2.length;i++)
		{
			if(map.containsKey(arr1[i]))
			{
				int val = map.get(arr1[i]);
				map.put(arr1[i],val+1);
				
			}
			else
			{
				map.put(arr1[i],1);
			}
		}
		ArrayList <Integer> list =new ArrayList<>();
		for(int i =0 ;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i])&& map.get(arr2[i])>0)
			{
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}
		
		int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
	}
	

}
