package Assignment_1;
import java.util.*;
public class nth_fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn =new Scanner(System.in);
		int num = scn.nextInt();
		int a=0;
		int b=1;
		
		
		int c=a+b;
		for(int i=3;i<=num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			
			
			
		}
		System.out.println(c);
		

	}

}
