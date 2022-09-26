package Assignment_1;
import java.util.*;

public class Shopping_game {

	public static void main(String[] args)throws java.lang.Exception {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int num= scn.nextInt();
	        int ayush=0;
	        int harshit=0;
	        
	        for(int i=0;i<=num;i++)
	        {
	            ayush=scn.nextInt();
	            harshit=scn.nextInt();
	            if(ayush>harshit)
	            {
	               System.out.println("Aayush");
	            }
	            else
	            {
	                 System.out.println("Harshit");

	            }
	        }

	}

}
