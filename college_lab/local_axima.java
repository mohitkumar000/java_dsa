package college_lab;
import java.util.*;
public class local_axima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		
		
		int [] arr = {18,1,3,6,7,-5};
		
		
		
		int i=0;
		int j =1;
		
		ArrayList <Integer> list = new ArrayList<>();
		
		
		for( i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]>arr[j])
			{
				//nothing
			}
			else
			{
				list.add(arr[i]);
			}
			j++;
			
			
		}
		for(int f=0;f<list.size();f++)
		{
			System.out.println(list.get(f));
		}
			

	}

}
