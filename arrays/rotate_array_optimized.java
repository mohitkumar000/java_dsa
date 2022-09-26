package arrays;
import java.util.*;

public class rotate_array_optimized {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr =new int[n];
		for(int i =0;i<arr.length;i++)
		
		{
			arr[i]=scn.nextInt();
		}
		int k = scn.nextInt();
		
		
		rotate_array(arr,k);
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		
		

	}
	public static void rotate_array(int [] arr ,int k)
	{
		int n =arr.length;
		k=k%n;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
		
		
		
	}
	public static void reverse(int [] arr ,int i , int j)
	{
		while(i<j)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		
	}
	

}
