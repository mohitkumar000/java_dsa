package sorting;
import java.util.*;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	public static void sort(int [] arr)
	{
		for(int turn =1;turn<arr.length;turn++)
		{
		 for(int i=0;i<=arr.length-turn-1;i++)
		 {
			if(arr[i]>arr[i+1])
			{
				int temp =arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		 }
		 
			
		}
		
			
		
	}

}
