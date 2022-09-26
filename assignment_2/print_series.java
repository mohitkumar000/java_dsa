package assignment_2;
import java.util.*;

public class print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x,d=0;
		int n =scn.nextInt();
		int m =scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=(d+i);j<=1001;j++)
	        {
	            x=(3*j)+2;
	            if(x%m!=0)
	            {
	               System.out.println(x);
	               break;
	            }
	            else
	            d++;
	        }
		}
		
		

	}

}
