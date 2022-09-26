package arrays;
import java.util.*;

public class pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int [] arr = {10,2,6,8,4};
		int total_money = 10;
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i+1];
			if(total_money==arr[i])
			{
				System.out.println("should buy roses whose prices are"+arr[i]+"and"+);
			}
		}
		
		
		
		
		

	}

}
