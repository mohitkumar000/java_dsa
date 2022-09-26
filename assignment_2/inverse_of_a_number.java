package assignment_2;
import java.util.*;

public class inverse_of_a_number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int sum=0;
		int pos =1;
		
		while(n>0)
		{
			int rem = n%10;
			sum =(int)(sum+pos*Math.pow(10,rem-1));
			n=n/10;
			pos++;
			
			
		}
		System.out.println(sum);
		
				
	}

}
