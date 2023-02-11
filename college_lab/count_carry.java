package college_lab;
import java.util.*;

public class count_carry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 =scn.nextInt();
		int p=0;
		int q=0;
		
		
		int carry =0;
		int count=0;
		
		while(num1!=0&&num2!=0)
		{
			 p=num1%10; q=num2%10;
			int result = p+q+carry;
			if(result>9)
			{
				carry=1;
				count++;
				
				
			}
			else
			{
				carry =0;
				
			}
			num1=num1/10;
			num2=num2/10;
				
			
		}
		
		System.out.println(count);
		
		

	}

}
