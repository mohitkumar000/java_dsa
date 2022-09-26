package arrays;
import java.util.*;
public class product_of_array_except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int []arr =new int [n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		product_araay(arr);
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}
	public static int[] product_araay(int [] arr)
	{
		int [] left =new int[arr.length];
		left[0]=1;
		for(int i=1;i<left.length;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		int [] right =new int[arr.length];
        int n=arr.length;
		right[n-1] =1;
		for(int j=n-2;j>=0;j--)
		{
			right[j]=right[j+1]*arr[j+1];
		}
		for(int k=0;k<arr.length;k++)
		{
			left[k]=left[k]*right[k];
		}
	   return left;
	}


}
