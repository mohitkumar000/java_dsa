package arrays;
import java.util.*;
public class inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		int [] ans =new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			int v=arr[j];
			ans[v]=j;
			
			
		}
		for(int k =0;k<ans.length;k++)
		{
			System.out.print(ans[k]);
		}
		
		
		

	}

}
