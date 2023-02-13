package college_lab;
import java.util.*;

public class four_digit_otp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String str = "345679";
		int val =0;
		String ans ="";
		StringBuilder sb = new StringBuilder(ans);
		
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			 int a = Integer.parseInt(String.valueOf(ch)); 
			if(a%2==0)
			{
				//do nothoing 
			}
			else
			{
				val =a;
				val =val*val;
				sb.append(val);
				
			}
			
			
		}
		System.out.println(ans);

	}

}
