package assignment_2;
import java.util.*;

public class bostan_number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		bostanNumber(n);
		
		
	}
	public static void bostanNumber(int n)
	{
		int x =n;
		int sum =0;
		int i =2;
		while(i<=n)
		{
			while(n%i==0)
			{
				sum =sum+sod(i);
				n = n/i;
			}
			i++;
		}
		int ans = sod(x);
		if(ans==sum)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		
	}
	private static int sod(int n) {
		// TODO Auto-generated method stub
		int sum =0;
		while(n>0)
		{
			int rem =n%10;
			sum = sum+rem;
			n=n/10;
			
		}
		return sum;
	}

}
