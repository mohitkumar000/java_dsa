package assignment_2;
import java.util.*;

public class nth_traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//int n =scn.nextInt();
		int n=3;
		int ans =total_traingle(n);
		System.out.println(ans);
		
		

	}
	public static int total_traingle(int n)
	{
		 if (n == 1)
	            return 0;
	        int ans =n+total_traingle(n-1);
	        return ans;
	        
	        
	}

}
