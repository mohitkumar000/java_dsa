package arrays;

import java.util.Scanner;
//this a brute force approch which is tle on leetcode


public class reverse_between_particular_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			
			int [] arr = new int[n];
			for(int i =0;i<arr.length;i++)
			{
				arr[i]=scn.nextInt();
			}
			int s =scn.nextInt();
			int e =scn.nextInt();
			
			Reverse(arr, s,e);
		}

	
		public static void Reverse(int [] arr,int i,int j)
		{
			while(i<j)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
			}
			for(int k=0;k<arr.length;k++)
			{
				System.out.println(arr[k]);
			}
			
		}


	}


