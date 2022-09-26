package arrays;
import java.util.*;

public class linear_search_calss {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int flag =0;
		int element = scn.nextInt();
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				flag =1;
			}
			if(flag ==1)
			{
				System.out.println(i);
				break;
				
			}
		}
		
			

	}

	

}
