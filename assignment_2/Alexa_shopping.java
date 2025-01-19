package assignment_2;
import java.util.*;

public class Alexa_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}




		int q=scn.nextInt();

		while(q>0)
		{
			int a =scn.nextInt();
			int k = scn.nextInt();
			if(isPossible(arr,a,k)==true)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("No");
				
			}
			
			q--;
		}

	}
	public static boolean isPossible(int []price,int a,int k)
	{
		int count =0;
		for(int i=0;i<price.length;i++)
		{
			if(a%price[i]==0)
			{
				count++;
			}
		
		}
		if(count>=k)
		{
			return true;
		}
		else
		{
			return true;
		}
		
	}

}
