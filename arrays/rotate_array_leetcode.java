package arrays;
import java.util.*;

public class rotate_array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		int k =3;
		
		

	}
	public static void rotate_array(int [] arr ,int k)
	{
		int n =arr.length;
		k=k%n;
		while(k>0)
		{
			int temp =arr[n-1];
			for(int i = n-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
				
			}
			arr[0]=temp;
			k--;
		}
		
	}

}
