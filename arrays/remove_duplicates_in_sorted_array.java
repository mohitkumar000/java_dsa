package arrays;

import java.util.Scanner;

public class remove_duplicates_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println(remove_duplicate(arr));
		
		
		
		
		

		
	}
	public static int remove_duplicate(int [] arr)
	{
		int si=0;
		int ei=1;
		int count =0;
		while(ei>=arr.length)
		{
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]!=arr[i-1])
				{
					count++;
					 arr[i]=arr[j];
					
					
				}
				
			}
			
			 
			
		}
		return count+1;
	}

}
