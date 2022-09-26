package Assignment_1;
import java.util.*;

public class reverse_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int n= scn.nextInt();
	        
	        while(n>0)
	        {
	            int temp1=n%10;
	            System.out.print(temp1);



	            n= n/10;

	        }
	        


	}

}
