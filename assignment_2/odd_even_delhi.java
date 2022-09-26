package assignment_2;
import java.util.*;

public class odd_even_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t =scn.nextInt();
		while(t>0)
		{
			int n = scn.nextInt();
			int oddsum = 0;
			int evensum=0;
			while(n>0)
			{
				int rem = n%10;
				if(rem%2==0)
				{
					evensum = evensum+rem;
				}
				else
				{
					oddsum = oddsum+rem;
					
				}
				n =n/10;
			}
			if(evensum%4==0 || oddsum%3==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}

			t--;
		}
	}

}
