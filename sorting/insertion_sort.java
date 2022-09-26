package sorting;

import java.util.Scanner;

public class insertion_sort {
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
			System.out.println(arr[j]+ " ");
		}
		

		
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++)
		{
			int item =arr[i];
			int j =i-1;
			while(j>=0&&arr[j]>item)
			{
				arr[j=1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
		
		
	}

}
