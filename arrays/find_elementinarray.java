package arrays;
import java.util.*;

public class find_elementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int key =scn.nextInt();
		int [] arr =new int[n];
		int count = 0;
		for(int i = 0 ;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		for(int j =0;j<arr.length;j++)
		{
			if(arr[j]==key)
			{
				System.out.println(j);
				count=1;
				
			}
			
			
			
		}
		if(count==0)
		{
			
		
		System.out.println(-1);
		}
		
		
			
	
		

	}

}
