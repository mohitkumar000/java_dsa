package assignment_2;
import java.util.*;

public class binary_to_decimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int sum=0;
		int mul = 1;
		
		while(n>0)
		{
			int rem = n%2;
			sum = sum+rem*mul;
			n=n/2;
			mul= mul*10;
		}
		System.out.println(sum);
		
		
	}

}
