package assignment_2;
import java.util.*;

public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0)
		{
			int m = scn.nextInt();
			int n = scn.nextInt();
			
			int a =0;
			int h =0;
			
			int count =0;
			
			while(true)
			{
				a = a+count;
				if(a>m)
				{
					System.out.println("harshit");
					break;
				}
				count++;
				h=h+count;
				if(h>n)
				{
					System.out.println("ayush");
					
				}
				count++;
				t--;
				
				
		
						
			}
		}
		
		

	}

}
