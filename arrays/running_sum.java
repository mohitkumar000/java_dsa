package arrays;
import java.util.*;

public class running_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int [] ans =new int[arr.length];
		int final_ans = 0;
		for(int j=1;j<arr.length;j++)
		{
			arr[j] =arr[j]+arr[j-1];
			
			
			
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
		
		
		

	}

}
