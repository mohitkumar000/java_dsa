package Assignment_1;
import java.util.*;

public class Search_insert_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =  scn.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int target = scn.nextInt();
		int ans =search(arr,target);
		System.out.println(ans);
		
		

	}
	 public static int search(int []arr,int target)
		{
			int si=0;
			int ei =arr.length-1;
			
			int ans =0;
			while(si<=ei)
			{
				int mid =si+(ei-si)/2;
				if(arr[mid]==target )
				{
					
					return mid;
				}
				else if(arr[mid]>target)
				{
					ei =mid-1;
					
				}
				else
				
				{
					si=mid+1;
					
				}
			}
			return si;
			
				
		}
	

}
