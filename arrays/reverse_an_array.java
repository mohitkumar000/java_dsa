package arrays;
import java.util.*;


public class reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		Reverse(arr);
	}

	public static void Reverse(int [] arr)
	{
		int i=0;
		int j=arr.length-1;
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
