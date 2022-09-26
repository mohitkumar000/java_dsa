package Assignment_1;
import java.util.*;

public class gcd_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 =scn.nextInt();
		int on1 =n1;
		int on2=n2;
		
		while(n1%n2!=0)
		{
			int rem =n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd =n2;
		
		
		int lcm =(on1*on2)/gcd;
		System.out.println(lcm);
		

	}

}
