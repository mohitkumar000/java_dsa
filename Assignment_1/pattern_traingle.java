package Assignment_1;
import java.util.*;

public class pattern_traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
	    for (int i = 1; i <= n; i++)
	    { 
	        for (int j = 1; j <=n-i; j++)  //printing spaces in left , if row number is i, then spaces are n-i
	        {
	            System.out.print("\t");
	        }
	        int val=i;//each row is starting with i
	        for (int j = 1; j<=i; j++) //printing first half of the row
	        {
	            System.out.print(val+"\t");
	            val++;
	          
	        }
	        val-=2;
	        for (int j = 1; j<i; j++) //printing second half of the row
	        {
	        	System.out.print(val+"\t");
	            val--;
	          
	        }
	        System.out.println();
	        
	    }

	}

}
