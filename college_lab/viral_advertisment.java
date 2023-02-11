package college_lab;
import java.util.*;

public class viral_advertisment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		
		
	
		
		int shared =5;
		int liked =0;
		int sum =0;
		for(int i=0;i<n;i++)
		{
			liked =shared/2;
			sum =sum+liked;
			shared = 3*liked;
		}
		
		System.out.println(sum);
		

	}

}
