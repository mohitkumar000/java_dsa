package assignment_2;
import java.util.*;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int n2=scn.nextInt();
		int extra =n2;
		
		isarmstrong(n,n2);		

	}
	public static void isarmstrong(int n,int n2)
	{
		
		
		
		for(int i=n2;i<=n;i--)
		{
		int cod =count(n2);
		int x =n2;
		int ans =0;
		while(n2>0)
		{
		int rem = n2%10;
		ans = (int)(ans+Math.pow(rem, cod));
		n2=n2/10;
		}
		if(ans==x)
		{
			System.out.println(ans);
		}
		n2--;
		}
		
		
		
		
		
		
	}
	public static int count(int n2)
	{
		int count =0;
		while(n2>0)
		{
			count++;
			n2=n2/10;
			
			
			
		}
		n2--;
		
		return count;
		
	}

}
