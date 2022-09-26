package arrays;
import java.util.*;

public class find_miminum_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		int mini = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int j =0;j<arr.length;j++)
		{
			if(arr[j]>mini)
			{
				mini = arr[j];
			}
			
		}
		System.out.println(mini);
		

	}

}
