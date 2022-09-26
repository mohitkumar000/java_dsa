package Assignment_1;
import java.util.*;
public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int num = scn.nextInt();
	        int digit =scn.nextInt();
	        int count =0;
	        int check=0;
	        while(num>0)
	        {
	             check = num%10;
	            if(check==digit)
	            {
	                count++;
	            }
	            num = num/10;
	        }
	        System.out.println(count);
	        

	}

}
