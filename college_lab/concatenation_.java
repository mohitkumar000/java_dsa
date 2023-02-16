package college_lab;
import java.util.*;


public class concatenation_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int [] arr= {2,3,5,7,8,9};
		int p1 =0;
		int p2 =0;
		int sum =1;
		int total_sum =0;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++)
		{
			total_sum = arr[i]+total_sum;
		}
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==5)
			{
				p1=i+1;
			}
			if(arr[i]==8)
			{
				p2 = i+1;
			}
			
		}
		for(int i=p1;i<=p2;i++)
		{
			sum =sum*10+arr[i];
			sum2= sum+arr[i];
			
		}
		int rs= sum2-total_sum;
		
		System.out.println(total_sum+rs);
		
		

	}

}
