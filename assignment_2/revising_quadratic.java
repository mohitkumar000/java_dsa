package assignment_2;
import java.util.*;
public class revising_quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		
		int d = b*b-4*a*c;
		if(d>0)
		{
			System.out.println("Real and Distinct");
			int r1 =(int)((-b -Math.sqrt(d))/(2*a));
			int r2 =(int)((-b +Math.sqrt(d))/(2*a));
			System.out.println(r1 + " " + r2);
		}
		else if(d==0) 
		{
			System.out.println("Real and equal ");
			int r1 = (-b)/(2*a);
			System.out.println(r1 +  " " + r1);
			
		}
		else
		{
			System.out.println("Imaginary");
		}
		
		

	}
 
}
