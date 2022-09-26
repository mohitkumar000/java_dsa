package recursion;
import java.util.*;
public class find_index {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [] arr = new int[n];
	int item = scn.nextInt();
	for(int i =0;i<arr.length;i++)
	{
		arr[i]=scn.nextInt();
	}
	int ans=0;
	
		
		for(int i =0;i<arr.length;i++)
		{
			ans =find_index(arr,item,i);
			
		}
		System.out.println(ans);
		
	
	
	
	
	
	}
	public static int find_index(int [] arr,int item,int i)
	{
		if(i==arr.length)
		{
			return -1;
		}
		if(arr[i]==item)
		{
			return i;
		}
		return find_index(arr,item,i+1);
	}
	

}
