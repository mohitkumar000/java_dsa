package sorting;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		sort(arr);
		for(int j =0;j<arr.length;j++)
		{
			System.out.print(arr[j]+ " ");
		}

	}
	public static void sort(int [] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			int mini =i;
			for(int j=i+1;j<arr.length;j++ )
			{
				if(arr[j]<arr[mini])
				{
					mini =j;
				}
			}
			int temp =arr[i];
			arr[i] =arr[mini];
			arr[mini]=temp;
			
		}
		

	}

}
